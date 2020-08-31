import java.util.Scanner;

public class EA_HW
{
	public static void main(String[] args)
	{	
		int a = 0,b = 0,c = 0;
		double ans1 = 0,ans2 = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("a:");
		a = keyboard.nextInt();
		System.out.println("b:");
		b = keyboard.nextInt();
		System.out.println("c:");
		c = keyboard.nextInt();
		
		ans1 = Math.sqrt(b*b-4*a*c);
		ans1 = (-b + ans1)/(2*a);
		ans2 = Math.sqrt(b*b-4*a*c);
		ans2 = (-b - ans2)/(2*a);
		
		System.out.println("Solution: "+ans1+", "+ans2);
		
		
		
		
	}
}