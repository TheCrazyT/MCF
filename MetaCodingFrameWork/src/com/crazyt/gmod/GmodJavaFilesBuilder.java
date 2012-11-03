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
public class GmodJavaFilesBuilder {
	private final static Set<String> disallowedFuncs;
	private final static HashMap<String,String> customExtension = new HashMap<String,String>();
	private static Set<String> attributeTypes = new HashSet<String>();
	private static HashMap<String,String> attributePaths = new HashMap<String,String>();
	private static HashMap<String,String> metaVarSubst = new HashMap<String,String>();

	static {
		disallowedFuncs = new HashSet<String>();
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
		
		customExtension.put("string","com.crazyt.mcf.MetaVarString");
		customExtension.put("number","com.crazyt.mcf.MetaVarInt");
		
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
			f = new File(url2.toURI().getPath().replace("/bin/", "/src/")
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
		p.println("import com.crazyt.gmod.*;");
		p.println("import com.crazyt.mcf.External;");
		p.println("import com.crazyt.mcf.MetaVar;");
		p.println("import com.crazyt.mcf.MetaCommand;");
		p.println("@External");
		p.println("public class "+name+" {");
	}
	private static void parseFunctions(PrintStream p,String urlStr){
		String pat="\\<td\\> *\\<a +href=\"[^\"]+\" +title=\"[^\"]+\">[^<]+\\</a\\>\r?\n\\</td\\>\r?\n\\<td\\> *(\\<b\\>([^<]+)\\</b\\>:)?\\<a +href=\"([^\"]+)\" title=\"[^\"]+\"\\>([^<]+)\\</a\\>";
		String pat2="\\<p\\>[^<]+\\<b\\>([^<]+)\\</b\\> *\\(<a href=\"([^\"]+)\" title=\"[^\"]+\"\\>([^<]+)\\</a\\>\\)";
		String pat3="\\<tr\\>\r?\n\\<td\\>\\<strong\\>Name:\\</strong\\>\\</td\\>\r?\n\\<td\\>([^<]+)\\</td\\>";
		String pat4="\\<b\\>Returns:\\</b\\> \\<a href=\"[^\"]+\" title=\"[^\"]+\"\\>([^<]+)\\</a\\>";
		String pat5="\\<p\\>\\<b\\>Description:\\</b\\>(([^<]|\r?\n)+)\\</p\\>";

		
		Pattern pattern = Pattern.compile(pat);
		Pattern pattern2 = Pattern.compile(pat2);
		Pattern pattern3 = Pattern.compile(pat3);
		Pattern pattern4 = Pattern.compile(pat4);
		Pattern pattern5 = Pattern.compile(pat5);

		String content = getContent(urlStr);
		
		
		Matcher matcher = pattern.matcher(content);
		Set<String> functions = new HashSet<String>();
		while (matcher.find()) {
			String entity = matcher.group(2);
			String methodPath = matcher.group(3);
			System.out.println(entity+":"+methodPath+":"+matcher.group(4));
			String path ="";
			path += methodPath;
			String content2 = getContent("http://wiki.garrysmod.com"+path);
			Matcher matcher3 = pattern3.matcher(content2);			
			Matcher matcher2 = pattern2.matcher(content2);
			if(matcher3.find()){
				String funcName = matcher3.group(1);
				if(funcName.lastIndexOf(":")>0){
					funcName = funcName.substring(funcName.lastIndexOf(":")+1);
				}
				if(!functions.contains(funcName.toLowerCase())){
					functions.add(funcName.toLowerCase());
					Matcher matcher5 = pattern5.matcher(content2);
					if(matcher5.find()){
						p.println("\t/**");
						p.println("\t"+matcher5.group(1).trim());
						p.println("\t*/");
					}
					if(!disallowedFuncs.contains(funcName.toLowerCase())){
						p.println("\t@External");
					}
					p.print("\t");
					if(disallowedFuncs.contains(funcName.toLowerCase())){
						p.print("//");
					}
					String retType = "MetaVar";
					Matcher matcher4 = pattern4.matcher(content2);
					if(matcher4.find()){
						retType = matcher4.group(1);
						if (metaVarSubst.containsKey(retType.toLowerCase())) {
							retType = metaVarSubst.get(retType.toLowerCase());
						} else {
							retType = retType.toUpperCase().substring(0, 1)
									+ retType.substring(1);
							retType = "MetaVar" + retType;
						}
					}
					p.print("public "+retType+" "+funcName+"(");
					boolean found = matcher2.find();
					while (found) {
						String argName = matcher2.group(1);
						String typePath = matcher2.group(2);
						String argType = matcher2.group(3);
						String attName = argType;
						attName = attName.toUpperCase().substring(0, 1) + attName.substring(1);
						attributeTypes.add(argType);
						attributePaths.put(argType,typePath);
						System.out.println(argName+":"+argType);
						if (metaVarSubst.containsKey(argType.toLowerCase())) {
							p.print(metaVarSubst.get(argType.toLowerCase())+" "+argName+"Var");
						}
						else
						{
							p.print("MetaVar"+attName+" "+argName+"Var");
						}
						found = matcher2.find();
						if(found){
							p.print(",");						
						}
					}
					p.println("){return null;};");
				}
			}
		}
		p.println("}");
		p.close();
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
		String path = "";
		try {
			path = url.toURI().getPath().replace("/bin/", "/src/");
		} catch (URISyntaxException e) {
			return;
		}
		
		PrintStream p = newFile(path + "Functions.java");
		if(p==null){
			return;
		}
		
//		String content = getContent("http://wiki.garrysmod.com/page/Global");

		writeMainPackages(p,"Functions");
		parseFunctions(p,"http://wiki.garrysmod.com/page/Global");
		
		for(String k:attributeTypes){
			if(metaVarSubst.containsKey(k)) {
				continue;
			}
			String attName = k;
			attName = attName.toUpperCase().substring(0, 1) + attName.substring(1);
			System.out.println("MetaVar    :"+k);
			PrintStream p2 = newFile(path + "MetaVar"+attName+".java");
			String ext = "MetaVarImpl";
			if(customExtension.containsKey(k.toLowerCase())){
				ext = customExtension.get(k.toLowerCase());
			}

			
			p2.println("package com.crazyt.gmod;");
			p2.println("import com.crazyt.gmod.IMetaVarAny;");
			p2.println("import com.crazyt.mcf.MetaVar;");
			p2.println("import com.crazyt.mcf.MetaVarImpl;");
			p2.println("import com.crazyt.mcf.MetaCommand;");
			p2.println("import com.crazyt.mcf.External;");
			p2.println("import com.crazyt.mcf.SimpleName;");
			p2.println("@External");
			p2.println("@SimpleName(\""+k+"\")");
			p2.println("public class MetaVar"+attName+" extends "+ext+" implements IMetaVarAny{");
			p2.println("	public MetaVar"+attName+"(String n) {");
			p2.println("		super(n);");
			p2.println("	}");
//			parseFunctions(p2,"http://wiki.garrysmod.com/page/Classes/"+attName);
			parseFunctions(p2,"http://wiki.garrysmod.com"+attributePaths.get(k));
			p2.println("}");
			p2.close();
		}
	}

}
