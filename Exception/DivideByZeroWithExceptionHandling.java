import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling
{
	public static int quotient( int numerator, int denominator )
	{
		return numerator / denominator;
	}
	
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer numerator: ");
		int denominator = 1;
		try
		{
			int numerator = scanner.nextInt();
			System.out.print("Please enter an integer denominator: ");
			denominator = scanner.nextInt();
			int result = quotient( numerator, denominator );
			System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result );
		}
		catch(ArithmeticException e)
		{
			System.out.printf("\n Inside the Arithmetic Exception\n");
		}
		catch(InputMismatchException e2)
		{
			System.out.printf("\n Input mismatch!!!\n");
			System.out.printf("\n 分母 is \n" + denominator);
		}
		System.out.println("Last!!!");
	}		
}