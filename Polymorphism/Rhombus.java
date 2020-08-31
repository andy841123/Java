abstract class Rhombus implements Parallelogram
{
	private int side;
	
	public Rhombus(int s)
	{
		side = s;
	}
	
	public int getSide()
	{
		return side;
	}
	
	public double perimeter()
	{
		return side * 4;
	}
	
	public void set(int side1,int side2)
	{
		side = side1;
		System.out.println("Pick the first number for the side of rhombus");
	}
	
}