public class OverloadingDemo
{
	public static void main(String[] args)
	{
		DateThirdTry date1 = new DateThirdTry(),date2=new DateThirdTry();
		date1.setDate(1,2,2008);
		date2.setDate("May",2,2008);
		
		//date1.writeOutput();
		//date2.writeOutput();
		
		System.out.println(date1);
		System.out.println(date2);
	}
}