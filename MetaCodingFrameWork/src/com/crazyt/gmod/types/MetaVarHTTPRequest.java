package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("HTTPRequest")
public class MetaVarHTTPRequest extends MetaVarImpl implements IMetaVarAny{
	private MetaVarFunction failed;
	@SimpleName("failed")
	public MetaVarFunction getFailed(){ return failed;}
	@SimpleName("failed")
	public void setFailed(MetaVarFunction value){ failed=value;}
	private MetaVarFunction success;
	@SimpleName("success")
	public MetaVarFunction getSuccess(){ return success;}
	@SimpleName("success")
	public void setSuccess(MetaVarFunction value){ success=value;}
	private MetaVarString method;
	@SimpleName("method")
	public MetaVarString getMethod(){ return method;}
	@SimpleName("method")
	public void setMethod(MetaVarString value){ method=value;}
	private MetaVarString url;
	@SimpleName("url")
	public MetaVarString getUrl(){ return url;}
	@SimpleName("url")
	public void setUrl(MetaVarString value){ url=value;}
	private MetaVarTable parameters;
	@SimpleName("parameters")
	public MetaVarTable getParameters(){ return parameters;}
	@SimpleName("parameters")
	public void setParameters(MetaVarTable value){ parameters=value;}
	public MetaVarHTTPRequest(String n) {
		super(n);
	}
}
