import java.util.Scanner;

public class EA_ICP
{
	public static void main(String[] args)
	{	
		int num1 = 0;
		float num2 = 1.2F,plus = 0,sub = 0,mul = 0,div = 0;
		System.out.println("Input:");
		Scanner keyboard = new Scanner(System.in);
		num1 = keyboard.nextInt();
		
		plus = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		
		System.out.println("--Plus:"+plus);
		System.out.println("--Minus:"+sub);
		System.out.println("--Multiplication:"+mul);
		System.out.println("--Division:"+div);
		
		
	}
}