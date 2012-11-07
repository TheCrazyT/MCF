package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarDateDataImpl.class)
public interface MetaVarDateData extends MetaVar,IMetaVarAny{
	@SimpleName("day")
	public MetaVarNumber getDay();
	@SimpleName("day")
	public void setDay(MetaVarNumber value);
	@SimpleName("hour")
	public MetaVarNumber getHour();
	@SimpleName("hour")
	public void setHour(MetaVarNumber value);
	@SimpleName("isdst")
	public MetaVarBoolean getIsdst();
	@SimpleName("isdst")
	public void setIsdst(MetaVarBoolean value);
	@SimpleName("min")
	public MetaVarNumber getMin();
	@SimpleName("min")
	public void setMin(MetaVarNumber value);
	@SimpleName("month")
	public MetaVarNumber getMonth();
	@SimpleName("month")
	public void setMonth(MetaVarNumber value);
	@SimpleName("sec")
	public MetaVarNumber getSec();
	@SimpleName("sec")
	public void setSec(MetaVarNumber value);
	@SimpleName("wday")
	public MetaVarNumber getWday();
	@SimpleName("wday")
	public void setWday(MetaVarNumber value);
	@SimpleName("yday")
	public MetaVarNumber getYday();
	@SimpleName("yday")
	public void setYday(MetaVarNumber value);
	@SimpleName("year")
	public MetaVarNumber getYear();
	@SimpleName("year")
	public void setYear(MetaVarNumber value);
}
