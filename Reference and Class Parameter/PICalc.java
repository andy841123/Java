public class PICalc
{	
	public static double calcVolume(double r)
	{
		return (r*r*r*4/3*Math.PI);
	}
	public static double calcSurface(double r)
	{
		return (r*r*4*Math.PI);
	}
	public static double calcVolume(double r,double h)
	{
		return (r*r*Math.PI*h);
	}
	public static double calcSurface(double r,double h)
	{
		return ((2*r*Math.PI*h)+(2*r*r*Math.PI));
	}
}