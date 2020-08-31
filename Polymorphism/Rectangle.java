public class Rectangle implements Parallelogram
{
	private int side1,side2;
	
	public Rectangle(int s1,int s2)
	{
		side1 = s1;
		side2 = s2;
	}
	
	public double area()
	{
		return side1 * side2;
	}
	
	public double perimeter()
	{
		return (side1 + side2) * 2;
	}
	
	public void set(int s1,int s2)
	{
		side1 = s1;
		side2 = s2;
	}
	
	public void writeOutput()
	{
		System.out.printf("This is Rectangle\nArea: %.1f\nPerimeter: %.1f\n\n",area(),perimeter());
	}
}