import java.util.Scanner;

public class ComplexNumberTest
{	
	public static void main(String[] args)
	{
		double r,i;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("請依序輸入一個複數的實數與虛數");
		r = keyboard.nextDouble();
		i = keyboard.nextDouble();
		ComplexNumber c1 = new ComplexNumber(r,i);	
		
		System.out.println("請輸入一個實數");
		r = keyboard.nextDouble();
		ComplexNumber c2 = new ComplexNumber(r);
		
		ComplexNumber cs = new ComplexNumber();
		
		cs = c1.add(c2);
		System.out.println(c1 + "+" + c2 + "=" + cs);
		cs = c1.minus(c2);
		System.out.println(c1 + "-" + c2 + "=" + cs);
		cs = c1.multiplication(c2);
		System.out.println(c1 + "*" + c2 + "=" + cs);
		cs = c1.division(c2);
		System.out.println(c1 + "/" + c2 + "=" + cs);
	}	
}
