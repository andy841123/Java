public class RightTrapezoid implements Quadrilateral
{
	private int downBase;
	private int height;
	private int leg;
	private int upBase;
	
	public RightTrapezoid(int ub,int db,int h,int l)
	{
		downBase = db ;
		height = h;
		leg = l ;
		upBase = ub ;
	}
	
	public double area()
	{
		return (downBase+upBase)*height/2;
	}
	
	public double perimeter()
	{
		return downBase + height + leg + upBase;
	}
	
	public void writeOutput()
	{
		System.out.printf("This is Right Trapezoid\nArea: %.1f\nPerimeter: %.1f\n\n",area(),perimeter());
	}
}