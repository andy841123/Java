public class Square extends Rhombus
{
	public Square(int s)
	{
		super(s);
	}
	
	public double area()
	{
		return super.getSide() * super.getSide();
	}
	
	public void writeOutput()
	{
		System.out.printf("This is Square\nArea: %.1f\nPerimeter: %.1f\n\n",area(),perimeter());
	}
}