public class Time 
{
	private int hour_12;
	private int hour_24;
	private int min;
	private String period;
	
	public Time( int hr , int m) throws TimeException
	{
		try
		{
			if( hr < 24 && hr > 0)
				hour_24 = hr;
			else
				throw new TimeException("The number of hour is wrong!"); 
			if( m < 60 && m > 0)
				min = m;
			else
				throw new TimeException("The number of minute is wrong!");
		}
		catch(TimeException e)
		{
			throw e;
		}
	}
	
	public Time( String pr,int hr , int m) throws TimeException
	{
		try
		{	if(pr.equalsIgnoreCase("AM")||pr.equalsIgnoreCase("PM"))
				period = pr;
			else
				throw new TimeException("The input of period is wrong!");
			if( hr < 12 && hr > 0)
				hour_12 = hr;
			else
				throw new TimeException("The number of hour is wrong!"); 
			if( m < 60 && m > 0)
				min = m;
			else
				throw new TimeException("The number of minute is wrong!");
		}
		catch(TimeException e)
		{
			throw e;
		}
	}
	
	public void convert12to24()
	{
		if( period.equalsIgnoreCase("PM") )
			hour_24 = hour_12 + 12;
		else
			hour_24 = hour_12;
	}
	
	public void convert24to12()
	{
		if( hour_24 > 11 )
		{
			period = "PM" ;
			hour_12 = hour_24 - 12;
		}
		else
		{
			period = "AM" ;
			hour_12 = hour_24;
		}
	}
	
	public int getHour_12()
	{
		return hour_12;
	}
	
	public int getHour_24()
	{
		return hour_24;
	}
	
	public int getMin()
	{
		return min;
	}
	
	public String getPeriod()
	{
		return period;
	}
	
	public void setHour_12(int hr) throws TimeException
	{
		try
		{
			if( hr < 12 && hr > 0)
					hour_12 = hr;
			else
				throw new TimeException("The number of hour is wrong!");
		}
		catch( TimeException e )
		{
			throw e;
		}
	}
	
	public void setHour_24(int hr) throws TimeException
	{
		try
		{
			if( hr < 24 && hr > 0)
				hour_24 = hr;
			else
				throw new TimeException("The number of hour is wrong!");
		}
		catch( TimeException e )
		{
			throw e;
		}
	}
	
	public void setMin(int m) throws TimeException
	{
		try
		{	
			if( m < 60 && m > 0)
				min = m;
			else
				throw new TimeException("The number of minute is wrong!");
		}
		catch(TimeException e)
		{
			throw e;
		}
	}
	
	public void setPeriod(String pr) throws TimeException
	{
		try
		{	if(pr.equalsIgnoreCase("AM")||pr.equalsIgnoreCase("PM"))
				period = pr;
			else
				throw new TimeException("The input of period is wrong!");
		}
		catch(TimeException e)
		{
			throw e;
		}
	}
	
	public void writeOutput()
	{
		System.out.printf("12-hr clock is %s %02d:%02d\n",period,hour_12,min);
		System.out.printf("24-hr clock is %02d:%02d\n",hour_24,min);
	}
}