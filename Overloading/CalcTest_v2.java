import java.util.Scanner;

public class CalcTest_v2{
	public static void main(String[] args){
		double d1,d2;
		Scanner input = new Scanner(System.in);
		Calc_v2 c = new Calc_v2();
		System.out.print("Please input first number : ");
		d1 = input.nextDouble();
		c.setNum1(d1);
		System.out.print("Please input second number : ");
		d2 = input.nextDouble();
		c.setNum2(d2);
		
		System.out.println("The first number is " + c.getNum1());
		System.out.println("The second number is " + c.getNum2());
		System.out.println("Num1 + Num2 = " + c.plus());
		System.out.println("Num1 - Num2 = " + c.minus());
		System.out.println("Num1 * Num2 = " + c.multiplication());
		System.out.println("Num1 / Num2 = " + c.division());
		System.out.println("Num2 + Num1 = " + c.plus(d1,d2));
		System.out.println("Num2 - Num1 = " + c.minus(d1,d2));
		System.out.println("Num2 * Num1 = " + c.multiplication(d1,d2));
		System.out.println("Num2 / Num1 = " + c.division(d1,d2));
	}
}