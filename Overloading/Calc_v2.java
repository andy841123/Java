class Calc_v2
{
	private double f;
	private double c;
	private char type;
	public void setType(char type)
	{
		this.type = type;
	}
	public void setF(double f)
	{
		this.f = f;
	}
	
	public void setC(double c)
	{
		this.c = c;
	}
	public void getType()
	{
		return type;
	}
	public double getF()
	{
		return f;
	}
	public double C()
	{
		return c;
	}
	public void tempConvert()
	{
		if(type = 'C')
			f = c*9/5+32;
		else
			c = (f-32)*5/9;
	}
	public void tempConvert(char type,double t)
	{
		this.type = type;
		if(type = 'C')
			c = t;
		else
			f = t;
		tempConvert();
	}
}
