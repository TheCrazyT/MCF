package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarHTTPRequestImpl.class)
public interface MetaVarHTTPRequest extends MetaVar,IMetaVarAny{
	@SimpleName("failed")
	public MetaVarFunction getFailed();
	@SimpleName("failed")
	public void setFailed(MetaVarFunction value);
	@SimpleName("success")
	public MetaVarFunction getSuccess();
	@SimpleName("success")
	public void setSuccess(MetaVarFunction value);
	@SimpleName("method")
	public MetaVarString getMethod();
	@SimpleName("method")
	public void setMethod(MetaVarString value);
	@SimpleName("url")
	public MetaVarString getUrl();
	@SimpleName("url")
	public void setUrl(MetaVarString value);
	@SimpleName("parameters")
	public MetaVarTable getParameters();
	@SimpleName("parameters")
	public void setParameters(MetaVarTable value);
}
