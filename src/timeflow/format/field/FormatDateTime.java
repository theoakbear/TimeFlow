/**
 * 
 */
package timeflow.format.field;

import java.text.ParseException;
import java.util.Calendar;

import timeflow.data.time.RoughTime;
import timeflow.data.time.TimeUnit;
import timeflow.data.time.TimeUtils;

public class FormatDateTime extends FieldFormat
{
	private final DateTimeGuesser dateGuesser=new DateTimeGuesser();
	
	@Override
	public String format(Object o) {
		return ((RoughTime)o).format();
	}

	@Override
	public Object _parse(String s) throws Exception {
		if (s.length()==0)
			return null;
		Object o= readTime(s);
		if (o==null)
			throw new IllegalArgumentException();
		return o;
	}
	
	
	public RoughTime readTime(String o) throws ParseException
	{
		return dateGuesser.guess(o);
	}
	
	@Override
	public double scoreFormatMatch(String s) {
		DateTimeGuesser g=new DateTimeGuesser();

		if (s==null || s.length()==0)
			return -.05;
		try
		{
			RoughTime f=g.guess(s);
			if (f==null)
				return -1;
			if (g.getLastGoodFormat().getUnits()==TimeUnit.YEAR)
			{
				int year=TimeUtils.cal(f.getTime()).get(Calendar.YEAR);
				if (year>2100)
					return -1;
				if (year>1900 && year<2050)
					return 1;
				if (year>2050 || year<1600)
					return .1;
				return .5;
			}
			return 2;
		}
		catch (Exception e)
		{
			return -1;
		}
	}


	@Override
	public Class<?> getType() {
		return RoughTime.class;
	}

	@Override
	public String getHumanName() {
		return "Date/Time";
	}		
}