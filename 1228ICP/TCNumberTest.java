import java.util.Scanner;

public class TCNumberTest
{	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i = 0,j = 0;
		String[] s= new String[2];
		String s3,s4;
		String[] ans = new String[2]; 
		
		for(String ss : s)
		{
			ss = input.next();
			if(ss.indexOf("i") != -1)
			{	
				int a = ss.indexOf(")");
				Double num1 = 0.0;
				Double num2 = 0.0;
				
				//Cnum1
				s3 = ss.substring(1,a);
				
				int b = s3.indexOf("+");
				int c = s3.indexOf("-");
				int i2 ;
				
				
				if( b != -1 )//x+yi
				{
					i2 = s3.indexOf("i");
					num1 = Double.parseDouble(s3.substring(0,b));
					num2 = Double.parseDouble(s3.substring(b+1,i2));
				}
				else if(c != -1 && c == 0)//-x?yi
				{
					String s5 = s3.substring(1);
					int d = s5.indexOf("+");
					int e = s5.indexOf("-");
					
					if( d != -1 )
					{
						i2 = s3.indexOf("i");
						num1 = Double.parseDouble(s3.substring(0,d+1));
						num2 = Double.parseDouble(s3.substring(d+2,i2));
					}
					else if( e != -1)
					{
						i2 = s3.indexOf("i");
						num1 = Double.parseDouble(s3.substring(0,e+1));
						num2 = Double.parseDouble(s3.substring(e+2,i2));
						num2 = num2 - 2 * num2;
					}
				}
				else if(c != -1 && c > 0)//x-yi
				{
					i2 = s3.indexOf("i");
					num1 = Double.parseDouble(s3.substring(0,c));
					num2 = Double.parseDouble(s3.substring(c+1,i2));
					num2 = num2 - 2 * num2;
				}
			
				TCNumber number1 = new ComplexNumber(num1,num2);
				
				
				//Cnum2
				s4 = ss.substring(a+2);
				i2 = s4.indexOf("i");
				b = s4.indexOf("+");
				
				num1 = Double.parseDouble(s4.substring(1,b));
				num2 = Double.parseDouble(s4.substring(b+1,i2));
				
				TCNumber number2 = new ComplexNumber(num1,num2);
				

				//calculator
				int R = ss.indexOf(")");
				String sign = ss.substring(R+1,R+2);
				ComplexNumber result = new ComplexNumber();
				
				if(sign.equals("+"))
					result = (ComplexNumber)number1.add(number2);
				else if(sign.equals("-"))
					result = (ComplexNumber)number1.minus(number2);
				else if(sign.equals("*"))
					result = (ComplexNumber)number1.multiplication(number2);
				else if(sign.equals("/"))
					result = (ComplexNumber)number1.division(number2);
				else
					System.out.println("This is a bug");
					
				ans[j] = String.format( "Complex Number : "+ss + "=" + result );
				//System.out.println(ans[j]);
			}
			else if(ss.indexOf("i") == -1)
			{
				int a = ss.indexOf(")");
				
				//Rnum1
				s3 = ss.substring(1,a);
				int i2 = s3.indexOf("/");
				Integer num1 = Integer.parseInt(s3.substring(0,i2));
				Integer num2 = Integer.parseInt(s3.substring(i2+1));
				
				TCNumber number1 = new RationalNumber(num1,num2);
				
				//Rnum2
				s4 = ss.substring(a+2);
				i2 = s4.indexOf("/");
				int i3 = s4.indexOf(")");
				num1 = Integer.parseInt(s4.substring(1,i2));
				num2 = Integer.parseInt(s4.substring(i2+1,i3));
				
				TCNumber number2 = new RationalNumber(num1,num2);
				
				
				//calculator
				int R = ss.indexOf(")");
				String sign = ss.substring(R+1,R+2);
				RationalNumber result = new RationalNumber();
				
				if(sign.equals("+"))
					result = (RationalNumber)number1.add(number2);
				else if(sign.equals("-"))
					result = (RationalNumber)number1.minus(number2);
				else if(sign.equals("*"))
					result = (RationalNumber)number1.multiplication(number2);
				else if(sign.equals("/"))
					result = (RationalNumber)number1.division(number2);
				else
					System.out.println("This is a bug");
					
				ans[j] = String.format( "Rational Number : "+ss + "=" + result);
				//System.out.println(ans[j]);
				
			}
			
			j++;
		}
		
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		
	}
}
