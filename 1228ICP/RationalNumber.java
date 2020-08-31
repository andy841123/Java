public class RationalNumber implements TCNumber <RationalNumber>
{
	private int num;
	private int den;
	
	public RationalNumber(int initinalNum,int initinalDen)
	{
		if(initinalDen!=0)
		{
			num = initinalNum;
			den = initinalDen;
		}
		else
		{
			System.out.println("error");
			System.exit(0);
		}
	}
	public RationalNumber(int initinalNum)
	{
		num = initinalNum;
		den = 1;
	}
	public RationalNumber()
	{
		num = 0;
		den = 1;
	}
	
	public int getNum()
	{
		return num;
	}
	public int getDen()
	{
		return den;
	}
	public void setNum(int n1)
	{
		num = n1;
	}
	public void setDen(int d1)
	{
		den = d1;
	}
	
	public RationalNumber add(RationalNumber z)
	{
		RationalNumber obj = new RationalNumber(); 
		obj.num = num * z.den + den * z.num;
		obj.den = den * z.den;
		return (obj);
	}
	public RationalNumber minus(RationalNumber z)
	{
		RationalNumber obj = new RationalNumber(); 
		obj.num = num * z.den - den * z.num;
		obj.den = den * z.den;
		return (obj);
	}
	public RationalNumber multiplication(RationalNumber z)
	{
		RationalNumber obj = new RationalNumber();
		obj.num = num * z.num;
		obj.den = den * z.den;
		return (obj);
	}
	public RationalNumber division(RationalNumber z)
	{
		RationalNumber obj = new RationalNumber();
		obj.num = num * z.den;
		obj.den = den * z.num;
		return (obj);
	}
	
	public String toString()
	{
		return ("("+num+"/"+den+")");
	}
}