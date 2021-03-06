package com.crazyt.gmod;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.DefaultEditorKit.CutAction;

import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.MetaVar;
public class GmodJavaFilesBuilder {
	private final static Set<String> disallowedFuncs;
	private final static HashMap<String,String> customInterfaceExtension = new HashMap<String,String>();
	private final static HashMap<String,String> customExtension = new HashMap<String,String>();
	private static Set<String> attributeTypes = new HashSet<String>();
	private static HashMap<String,String> attributePaths = new HashMap<String,String>();
	private static HashMap<String,String> metaVarSubst = new HashMap<String,String>();
	private static HashMap<String,String> propertySubst = new HashMap<String,String>();

	private static Set<String> libraries = new HashSet<String>();
	private static HashMap<String,String> librariesPaths = new HashMap<String,String>();
	
	private static String path;
	
	
	private final static String BASE_URL = "http://wiki.garrysmod.com";
	static {
		disallowedFuncs = new HashSet<String>();
		//currently not parseable functions:
		disallowedFuncs.add("assert");
		disallowedFuncs.add("callonremove");
		disallowedFuncs.add("dispatchtraceattack");
		disallowedFuncs.add("enablematrix");
		disallowedFuncs.add("takedamageinfo");
		disallowedFuncs.add("getconstrainedphysobjects");
		disallowedFuncs.add("getphysicsobject");
		disallowedFuncs.add("getphysicsobjectnum");
		
		disallowedFuncs.add("addonmaterial");
		disallowedFuncs.add("clientsidescene");
		disallowedFuncs.add("createconvar");
		disallowedFuncs.add("creatematerial");
		disallowedFuncs.add("damageinfo");
		disallowedFuncs.add("dynamiclight");
		disallowedFuncs.add("effectdata");
		disallowedFuncs.add("getconvar");
		disallowedFuncs.add("getrendertarget");
		disallowedFuncs.add("getrendertargetex");
		disallowedFuncs.add("localplayer");
		disallowedFuncs.add("material");
		disallowedFuncs.add("matrix");
		disallowedFuncs.add("mesh");
		disallowedFuncs.add("particleemitter");
		disallowedFuncs.add("player");
		disallowedFuncs.add("recipientfilter");
		
		disallowedFuncs.add("byte");
		disallowedFuncs.add("char");
		
		disallowedFuncs.add("drawtexturedrectuv");
		
		disallowedFuncs.add("onup");
		
		disallowedFuncs.add("addfunction");
		disallowedFuncs.add("gettextureid");
		
		disallowedFuncs.add("copyfromto");
//		disallowedFuncs.add("add");
		disallowedFuncs.add("tostring");
		disallowedFuncs.add("remove");
		disallowedFuncs.add("clearkeys");
		disallowedFuncs.add("getname");
		
		disallowedFuncs.add("gamemode_chattext");
		disallowedFuncs.add("gamemode_canplayerentervehicle");
		
//		propertySubst.put("name","name_p");
		
		//TODO: implements * is just a small hack, need to improve this later
		customInterfaceExtension.put("string","com.crazyt.mcf.MetaVar,com.crazyt.mcf.MetaVarString,com.crazyt.gmod.types.MetaVarVararg");
		customInterfaceExtension.put("number","com.crazyt.mcf.MetaVarInt");
		customInterfaceExtension.put("boolean","com.crazyt.mcf.MetaVarBoolean");
		customInterfaceExtension.put("table","com.crazyt.mcf.MetaVarTable");

		customExtension.put("string","com.crazyt.mcf.MetaVarStringImpl");
		customExtension.put("number","com.crazyt.mcf.MetaVarIntImpl");
		customExtension.put("boolean","com.crazyt.mcf.MetaVarBooleanImpl");
		
		metaVarSubst.put("any", "com.crazyt.gmod.IMetaVarAny");
	}
	public static PrintStream newFile(String path){
		File f = new File(path);
		try {
			f.createNewFile();
		} catch (IOException e) {
			return null;
		}
		PrintStream p;
		try {
			p = new PrintStream(f);
		} catch (FileNotFoundException e) {
			return null;
		}
		return p;
	}
	public static void createCache(String urlStr,String content){
		URL url;
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e1) {
			return;
		}
		String path = url.getPath();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		URL url2 = classLoader.getResource("com/crazyt/gmod/cache");
		File f;
		try {
			f = new File(url2.toURI().getPath().replace("/build/", "/src/")
					+ path+"Cache");
			f.getParentFile().mkdirs();
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			fw.write(content);
			fw.close();
		} catch (IOException e) {
			return;
		} catch (URISyntaxException e) {
			return;
		}
	}
	public static String getCacheIfExists(String urlStr){
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		URL url;
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e1) {
			return null;
		}
		String path = url.getPath();
		URL url2 = classLoader.getResource("com/crazyt/gmod/cache"+path+"Cache");
		if (url2 == null) {
			return null;
		}
		try {
			BufferedInputStream bis = new BufferedInputStream(
					url2.openStream());
			int bytesRead;
			byte[] buf = new byte[1024];
			String strFullContents = "";
			while ((bytesRead = bis.read(buf)) != -1) {
				String strContents = new String(buf, 0, bytesRead);
				strFullContents += strContents;
			}
			return strFullContents;
		} catch (IOException e) {
			return null;
		}
	}
	
	public static String getContent(String urlStr) {
		System.out.println("getContent:"+urlStr);
		String content = getCacheIfExists(urlStr);
		if (content != null) {
			return content;
		}
		URL url;
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e) {
			return "";
		}
		try {
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			BufferedInputStream bis = new BufferedInputStream(
					huc.getInputStream());
			int bytesRead;
			byte[] buf = new byte[1024];
			String strFullContents = "";
			while ((bytesRead = bis.read(buf)) != -1) {
				String strContents = new String(buf, 0, bytesRead);
				strFullContents += strContents;
			}
			createCache(urlStr,strFullContents);
			return strFullContents;
		} catch (IOException e) {
			return "";
		}
	}
	private static void writeMainPackages(PrintStream p,String name){
		p.println("package com.crazyt.gmod;");
		p.println("import com.crazyt.gmod.types.*;");
		p.println("import com.crazyt.gmod.libs.*;");
		p.println("import com.crazyt.mcf.External;");
		p.println("import com.crazyt.mcf.MetaVar;");
		p.println("import com.crazyt.mcf.MetaCommand;");
		p.println("import com.crazyt.mcf.BasicFunctions;");
		p.println("import com.crazyt.mcf.Library;");
		p.println("@External");
		p.println("public abstract class "+name+" extends BasicFunctions {");
	}
	private static void parseProperties(PrintStream p,String urlStr){
		parseProperties(p, urlStr, false);
	}
	private static void parseProperties(PrintStream p,String urlStr,Boolean isInterface){
		String propPat = "(?s)<tr>\r?\n<td> <a href=\"/page/Classes[^\"]+\" title=\"[^\"]+\">([^<]+)</a>\r?\n</td>\r?\n<td>(.+?)\r?\n</td>\r?\n<td>(.+?\r?\n)</td></tr>";

		Pattern propPattern = Pattern.compile(propPat);

		String content = getContent(urlStr);

		Matcher propMatcher = propPattern.matcher(content);
		Set<String> propertiesDefined = new HashSet<String>();
		while (propMatcher.find()) {
			String propType = propMatcher.group(1).trim();
			propType = propType.toUpperCase().substring(0, 1)
					+ propType.substring(1);
			String orgPropName = propMatcher.group(2).trim();
			if(propertiesDefined.contains(orgPropName)){
				continue;
			}
			propertiesDefined.add(orgPropName);
			String propName = orgPropName;
			if(propertySubst.containsKey(orgPropName.toLowerCase())){
				propName = propertySubst.get(orgPropName.toLowerCase());
			}
			String propName2 = propName.toUpperCase().substring(0, 1)
					+ propName.substring(1);
			
			if(!isInterface){
				p.println("\tprivate MetaVar" + propType + " " + propName + ";");
				p.println("\t@SimpleName(\""+orgPropName+"\")");
				p.println("\tpublic MetaVar" + propType + " get" + propName2
						+ "(){ return " + propName + ";}");
				p.println("\t@SimpleName(\""+orgPropName+"\")");
				p.println("\tpublic void set" + propName2 + "(MetaVar" + propType
						+ " value){ " + propName + "=value;}");
			}else{
				p.println("\t@SimpleName(\""+orgPropName+"\")");
				p.println("\tpublic MetaVar" + propType + " get" + propName2
						+ "();");
				p.println("\t@SimpleName(\""+orgPropName+"\")");
				p.println("\tpublic void set" + propName2 + "(MetaVar" + propType
						+ " value);");
			}
		}
	}
	private static void parseLibraries(PrintStream p,String urlStr){
		String libPat = "<a href=\"(/page/Libraries/[^\"]+)\" title=\"[^\"]+\">([^<]+)</a>";
		
		Pattern libPattern = Pattern.compile(libPat);
		
		String content = getContent(urlStr);
		
		Matcher libMatcher = libPattern.matcher(content);
		while(libMatcher.find()){
			String path = libMatcher.group(1);
			String name = libMatcher.group(2);
			
			libraries.add(name);
			librariesPaths.put(name.toLowerCase(),path);
			
			p.println("\t@Library(\""+name+"\")");

			name = name.toUpperCase().substring(0, 1) + name.substring(1);
			p.println("\tpublic Lib" + name + " get" + name + "(){throw new RuntimeException(\"Should never be executed directly, there is probably an error in the Aspect-coding.\");};");
		}
	}
	private static void parseFunctions(PrintStream p,String urlStr){
		parseFunctions(p, urlStr, false);
	}
	private static void parseFunctions(PrintStream p,String urlStr,Boolean isInterface){
		String funcUrlPat = "(?s)<td> *<a +href=\"[^\"]+\" +title=\"[^\"]+\">([^<]+)</a>\r?\n\\</td>\r?\n<td> *(?:<b>(?:[^<]+)</b>(?::|.))?\\<a +href=\"([^\"]+)\" title=\"[^\"]+\">([^<]+)</a>";
		String argPat = "(?s)<p>[0-9]+\\.[^<]+<b>([^<]+)</b> *\\(<a href=\"([^\"]+)\" title=\"[^\"]+\"[^>]*>([^<]+)</a>\\)";
		String namePat = "(?s)<tr>\r?\n<td><strong>Name:</strong></td>\r?\n<td>(?:[^.]+\\.)?([^<]+)</td>";
		String returnPat = "(?s)<b>Returns:</b> <a href=\"([^\"]+)\" title=\"[^\"]+\"[^>]*>([^<]+)</a>";
		String descPat = "(?s)<p><b>Description:</b>(.+?)</p";
		
		Pattern funcUrlPattern = Pattern.compile(funcUrlPat);
		Pattern argPattern = Pattern.compile(argPat);
		Pattern namePattern = Pattern.compile(namePat);
		Pattern returnPattern = Pattern.compile(returnPat);
		Pattern descPattern = Pattern.compile(descPat);

		String content = getContent(urlStr);
		
		Matcher funcUrlMatcher = funcUrlPattern.matcher(content);
		Set<String> functions = new HashSet<String>();
		while (funcUrlMatcher.find()) {
			String state = funcUrlMatcher.group(1);
			String entity = funcUrlMatcher.group(3);
			String methodPath = funcUrlMatcher.group(2);
			System.out.println(entity+":"+methodPath+":"+state);
			String content2 = getContent("http://wiki.garrysmod.com"
					+ methodPath);
			Matcher nameMatcher = namePattern.matcher(content2);			
			Matcher argMatcher = argPattern.matcher(content2);
			if(nameMatcher.find()){
				String funcName = nameMatcher.group(1);
				if(funcName.lastIndexOf(":")>0){
					funcName = funcName.substring(funcName.lastIndexOf(":")+1);
				}
				if(!functions.contains(funcName.toLowerCase())){
					functions.add(funcName.toLowerCase());
					Matcher descMatcher = descPattern.matcher(content2);
					if(descMatcher.find()){
						String description = descMatcher.group(1).trim();
						description = description.replaceAll(" href=\"/page/"," href=\"" + BASE_URL + "/page/" );
						p.println("\t/**");
						p.println("\t"+description);
						p.println("\t*/");
					}
					if(!disallowedFuncs.contains(funcName.toLowerCase())){
						p.println("\t@External");
						p.println("\t@"+state+"Func");
					}
					p.print("\t");
					if(disallowedFuncs.contains(funcName.toLowerCase())){
						p.print("//");
					}
					String retType = "MetaVar";
					Matcher returnMatcher = returnPattern.matcher(content2);
					if(returnMatcher.find()){
						String retTypePath = returnMatcher.group(1);
						retType = returnMatcher.group(2);
						
						attributeTypes.add(retType);
						attributePaths.put(retType.toLowerCase(),retTypePath);

						if (metaVarSubst.containsKey(retType.toLowerCase())) {
							retType = metaVarSubst.get(retType.toLowerCase());
						} else {
							retType = retType.toUpperCase().substring(0, 1)
									+ retType.substring(1);
							retType = "MetaVar" + retType;
						}
					}
					p.print("public "+retType+" "+funcName+"(");
					boolean found = argMatcher.find();
					while (found) {
						String argName = argMatcher.group(1).replace(" ", "");
						String typePath = argMatcher.group(2);
						String argType = argMatcher.group(3);
						String attName = argType;
						attName = attName.toUpperCase().substring(0, 1) + attName.substring(1);
						attributeTypes.add(argType);
						attributePaths.put(argType.toLowerCase(),typePath);
						System.out.println(argName+":"+argType);
						if (metaVarSubst.containsKey(argType.toLowerCase())) {
							p.print(metaVarSubst.get(argType.toLowerCase())+" "+argName+"Var");
						}
						else
						{
							p.print("MetaVar"+attName+" "+argName+"Var");
						}
						found = argMatcher.find();
						if(found){
							p.print(",");						
						}
					}
					if (!isInterface) {
						p.println("){throw new RuntimeException(\"Should never be executed directly, there is probably an error in the Aspect-coding.\");};");
					} else {
						p.println(");");
					}
				}
			}
		}
	}
	private static void parseEnums(String urlStr){
		String enumPat = "<a href=\"(/page/Enums/[^\"]+)\" title=\"[^\"]+\">([^<]+)_ Enums</a>";
		String enumListPat = "\r?\n<tr>\r?\n<td> ([^<]+)\r?\n</td>\r?\n<td> ";
		
		Pattern enumPattern = Pattern.compile(enumPat);
		Pattern enumListPattern = Pattern.compile(enumListPat);
		
		String content = getContent(urlStr);

		Matcher enumMatcher = enumPattern.matcher(content);
		
		while(enumMatcher.find()){
			String url = enumMatcher.group(1);
			String name = enumMatcher.group(2);
			
			String content2 = getContent(BASE_URL + url);
			Matcher enumListMatcher = enumListPattern.matcher(content2);
			if(!content2.equals("")){
				PrintStream p = newFile(path + "enums/" + name + ".java");
				if(p==null){
					return;
				}
	
				
				p.println("package com.crazyt.gmod.enums;");
				p.println("import com.crazyt.mcf.MetaVar;");
				p.println("public enum " + name + " implements MetaVar {");
				while(enumListMatcher.find()){
					p.println(enumListMatcher.group(1)+"(\""+enumListMatcher.group(1)+"\"),");
				}

				p.println(";");
				p.println("\tprivate String name;");
				p.println("\tprivate "+name+"(String name){");
				p.println("\t\tthis.name = name;");
				p.println("\t}");
				p.println("\t@Override");
				p.println("\tpublic String _getName() {");
				p.println("\t\treturn name;");
				p.println("\t}");
				p.println("\t@Override");
				p.println("\tpublic void _setName(String name) {}");
				p.println("}");
				
				p.close();
			}
		}
	}
	
	//99% identical with parseFunctions,maybe improve it later by creating functions with same content
	public static void parseHooks(String urlStr){
		String funcUrlPat = "(?s)<td> *<a +href=\"[^\"]+\" +title=\"[^\"]+\">([^<]+)</a>\r?\n\\</td>\r?\n<td> *(?:<b>(?:[^<]+)</b>(?::|.))?\\<a +href=\"([^\"]+)\" title=\"[^\"]+\">([^<]+)</a>";
		String argPat = "(?s)<p>[0-9]+\\.[^<]+<b>([^<]+)</b> *\\(<a href=\"([^\"]+)\" title=\"[^\"]+\"[^>]*>([^<]+)</a>\\)";
		String namePat = "(?s)<tr>\r?\n<td><strong>Name:</strong></td>\r?\n<td>(?:[^.]+\\.)?([^<]+)</td>";
		String returnPat = "(?s)<b>Returns:</b> <a href=\"([^\"]+)\" title=\"[^\"]+\">([^<]+)</a>";
		String descPat = "(?s)<p><b>Description:</b>(.+?)</p";
		
		Pattern funcUrlPattern = Pattern.compile(funcUrlPat);
		Pattern argPattern = Pattern.compile(argPat);
		Pattern namePattern = Pattern.compile(namePat);
		Pattern returnPattern = Pattern.compile(returnPat);
		Pattern descPattern = Pattern.compile(descPat);
		
		String content = getContent(urlStr);

		Matcher funcUrlMatcher = funcUrlPattern.matcher(content);
		while(funcUrlMatcher.find()){
			String state = funcUrlMatcher.group(1);
			String entity = funcUrlMatcher.group(3);
			String methodPath = funcUrlMatcher.group(2);
			System.out.println(entity+":"+methodPath+":"+state);
			String content2 = getContent("http://wiki.garrysmod.com"+methodPath);
			Matcher nameMatcher = namePattern.matcher(content2);			
			Matcher argMatcher = argPattern.matcher(content2);
			if(nameMatcher.find()){
				String funcName = nameMatcher.group(1);
				funcName = funcName.replace(":", "_");
				if(disallowedFuncs.contains(funcName.toLowerCase())){
					continue;
				}
				String shortFuncName = funcName.substring(funcName.lastIndexOf("_")+1);
				PrintStream p2 = newFile(path + "hooks/Hook" + funcName + ".java");
				p2.println("package com.crazyt.gmod.hooks;");
				p2.println("import com.crazyt.gmod.types.*;");
				p2.println("import com.crazyt.gmod.*;");
				p2.println("import com.crazyt.mcf.MetaVar;");
				p2.println("import com.crazyt.mcf.Hook;");
				p2.println("import com.crazyt.mcf.SimpleName;");
				p2.println("@Hook(\""+funcName+"\")");
				p2.println("public abstract class Hook" + funcName + " extends MetaVarFunctionImpl{");
				p2.println("\tpublic final static String INTERNAL_HOOK_NAME = \"" + shortFuncName + "\";");
				p2.println("\tpublic Hook" + funcName + "(String n) {");
				p2.println("\t\tsuper(n);");
				p2.println("\t}");

				Matcher descMatcher = descPattern.matcher(content2);
				if(descMatcher.find()){
					String description = descMatcher.group(1).trim();
					description = description.replaceAll(" href=\"/page/",
							" href=\"" + BASE_URL + "/page/");
					p2.println("\t/**");
					p2.println("\t" + description);
					p2.println("\t*/");
				}
				
				p2.println("\t@"+state+"Func");

				String retType = "MetaVar";
				Matcher returnMatcher = returnPattern.matcher(content2);
				if(returnMatcher.find()){
					String retTypePath = returnMatcher.group(1);
					retType = returnMatcher.group(2);
					
					attributeTypes.add(retType);
					attributePaths.put(retType.toLowerCase(),retTypePath);

					if (metaVarSubst.containsKey(retType.toLowerCase())) {
						retType = metaVarSubst.get(retType.toLowerCase());
					} else {
						retType = retType.toUpperCase().substring(0, 1)
								+ retType.substring(1);
						retType = "MetaVar" + retType;
					}
				}
				
				p2.print("\tpublic abstract "+retType+" "+funcName+"(");
				boolean found = argMatcher.find();
				while (found) {
					String argName = argMatcher.group(1);
					String typePath = argMatcher.group(2);
					String argType = argMatcher.group(3);
					String attName = argType;
					attName = attName.toUpperCase().substring(0, 1) + attName.substring(1);
					attributeTypes.add(argType);
					attributePaths.put(argType.toLowerCase(),typePath);

					if (metaVarSubst.containsKey(argType.toLowerCase())) {
						p2.print(metaVarSubst.get(argType.toLowerCase())+" "+argName+"Var");
					}
					else
					{
						p2.print("@SimpleName(\""+argName+"Var\")MetaVar"+attName+" "+argName+"Var");
					}
					found = argMatcher.find();
					if(found){
						p2.print(",");						
					}
				}
				p2.println(");");
				p2.println("}");
				p2.close();
			}

		}

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		URL url = classLoader.getResource("com/crazyt/gmod/");
		if (url == null) {
			return;
		}
		path = "";
		try {
			path = url.toURI().getPath().replace("/build/", "/src/");
		} catch (URISyntaxException e) {
			return;
		}
		
		PrintStream p = newFile(path + "Functions.java");
		if(p==null){
			return;
		}
		
		//parse functions
		writeMainPackages(p,"Functions");
		parseFunctions(p,BASE_URL + "/page/Global");
		parseLibraries(p,BASE_URL + "/page/Libraries");
		p.println("}");
		p.close();

		//parse libraries with their functions
		for (String k : libraries) {
			String libName = k;
			libName = libName.toUpperCase().substring(0, 1)
					+ libName.substring(1);

			PrintStream p2 = newFile(path + "libs/Lib" + libName + ".java");
			p2.println("package com.crazyt.gmod.libs;");
			p2.println("import com.crazyt.gmod.IMetaVarAny;");
			p2.println("import com.crazyt.gmod.types.*;");
			p2.println("import com.crazyt.gmod.*;");
			p2.println("import com.crazyt.mcf.MetaVar;");
			p2.println("import com.crazyt.mcf.MetaVarImpl;");
			p2.println("import com.crazyt.mcf.MetaCommand;");
			p2.println("import com.crazyt.mcf.External;");
			p2.println("import com.crazyt.mcf.SimpleName;");
			p2.println("import com.crazyt.mcf.Library;");
			
			p2.println("@External");
			p2.println("@Library(\"" + k + "\")");
			p2.println("public class Lib" + libName	+ "{");
			parseFunctions(p2,
					"http://wiki.garrysmod.com" + librariesPaths.get(k.toLowerCase()));
			p2.println("}");
			p2.close();

		}

		//parse Attributes with their functions
		Set<String> attributeTypesBasicClone = new HashSet<String>();
		while(!attributeTypesBasicClone.containsAll(attributeTypes)){
			Set<String> attributeTypesNeeded = new HashSet<String>();
			attributeTypesNeeded.addAll(attributeTypes);
			attributeTypesNeeded.removeAll(attributeTypesBasicClone); 
			Set<String> attributeTypesClone = new HashSet<String>(attributeTypesNeeded);
			for (String k : attributeTypesClone) {
				if (metaVarSubst.containsKey(k.toLowerCase())) {
					attributeTypesBasicClone.add(k);
					continue;
				}
				String attName = k;
				attName = attName.toUpperCase().substring(0, 1)
						+ attName.substring(1);
				System.out.println("MetaVar    :" + k);
				PrintStream p2 = newFile(path + "types/MetaVar" + attName + ".java");
				String ext = "MetaVar";
				if (customInterfaceExtension.containsKey(k.toLowerCase())) {
					ext = customInterfaceExtension.get(k.toLowerCase());
				}
	
				p2.println("package com.crazyt.gmod.types;");
				p2.println("import com.crazyt.gmod.*;");
				p2.println("import com.crazyt.mcf.MetaVar;");
				p2.println("import com.crazyt.mcf.MetaCommand;");
				p2.println("import com.crazyt.mcf.External;");
				p2.println("import com.crazyt.mcf.SimpleName;");
				p2.println("import com.crazyt.mcf.Implementation;");
				p2.println("@External");
				p2.println("@Implementation(MetaVar" + attName
						+ "Impl.class)");
				p2.println("public interface MetaVar" + attName + " extends " + ext
						+ ",IMetaVarAny{");
				parseProperties(p2,
						BASE_URL + attributePaths.get(k.toLowerCase()),true);
				parseFunctions(p2,
						BASE_URL + attributePaths.get(k.toLowerCase()),true);
				p2.println("}");
				p2.close();

				ext = "MetaVarImpl";
				if(customExtension.containsKey(k.toLowerCase())){
					ext = customExtension.get(k.toLowerCase());
				}
				PrintStream p3 = newFile(path + "types/MetaVar" + attName + "Impl.java");
				p3.println("package com.crazyt.gmod.types;");
				p3.println("import com.crazyt.gmod.*;");
				p3.println("import com.crazyt.mcf.MetaVar;");
				p3.println("import com.crazyt.mcf.MetaVarImpl;");
				p3.println("import com.crazyt.mcf.MetaCommand;");
				p3.println("import com.crazyt.mcf.External;");
				p3.println("import com.crazyt.mcf.SimpleName;");
				p3.println("@External");
				p3.println("@SimpleName(\"" + k + "\")");
				p3.println("public class MetaVar" + attName
						+ "Impl extends " + ext + " implements MetaVar"
						+ attName + "{");
				parseProperties(p3,
						BASE_URL + attributePaths.get(k.toLowerCase()));
				parseFunctions(p3,
						BASE_URL + attributePaths.get(k.toLowerCase()));
				p3.println("	public MetaVar" + attName + "Impl(String n) {");
				p3.println("		super(n);");
				p3.println("	}");
				p3.println("}");
				p3.close();

				attributeTypesBasicClone.add(k);
			}
		}
		
		parseEnums(BASE_URL + "/page/Enums");
		
		parseHooks(BASE_URL + "/page/Hooks/Base");
	}
}
