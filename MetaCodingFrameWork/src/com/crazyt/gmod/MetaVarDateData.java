package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("DateData")
public class MetaVarDateData extends MetaVarImpl implements IMetaVarAny{
	private MetaVarNumber day;
	@SimpleName("day")
	public MetaVarNumber getDay(){ return day;}
	@SimpleName("day")
	public void setDay(MetaVarNumber value){ day=value;}
	private MetaVarNumber hour;
	@SimpleName("hour")
	public MetaVarNumber getHour(){ return hour;}
	@SimpleName("hour")
	public void setHour(MetaVarNumber value){ hour=value;}
	private MetaVarBoolean isdst;
	@SimpleName("isdst")
	public MetaVarBoolean getIsdst(){ return isdst;}
	@SimpleName("isdst")
	public void setIsdst(MetaVarBoolean value){ isdst=value;}
	private MetaVarNumber min;
	@SimpleName("min")
	public MetaVarNumber getMin(){ return min;}
	@SimpleName("min")
	public void setMin(MetaVarNumber value){ min=value;}
	private MetaVarNumber month;
	@SimpleName("month")
	public MetaVarNumber getMonth(){ return month;}
	@SimpleName("month")
	public void setMonth(MetaVarNumber value){ month=value;}
	private MetaVarNumber sec;
	@SimpleName("sec")
	public MetaVarNumber getSec(){ return sec;}
	@SimpleName("sec")
	public void setSec(MetaVarNumber value){ sec=value;}
	private MetaVarNumber wday;
	@SimpleName("wday")
	public MetaVarNumber getWday(){ return wday;}
	@SimpleName("wday")
	public void setWday(MetaVarNumber value){ wday=value;}
	private MetaVarNumber yday;
	@SimpleName("yday")
	public MetaVarNumber getYday(){ return yday;}
	@SimpleName("yday")
	public void setYday(MetaVarNumber value){ yday=value;}
	private MetaVarNumber year;
	@SimpleName("year")
	public MetaVarNumber getYear(){ return year;}
	@SimpleName("year")
	public void setYear(MetaVarNumber value){ year=value;}
	public MetaVarDateData(String n) {
		super(n);
	}
}
