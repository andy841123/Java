public class APP7_2
{
	public static void main(String[] args)
	{	
		int i;
		i=star(9);
		System.out.println(i+" stars printed");
		
	}
	public static int star(int n)
	{
		int i;
		for(i=1;i<=2*n;i++)
			System.out.print("*");
		System.out.println();
		return 2*n;
	}
}
