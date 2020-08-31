import java.util.Scanner;

public class TemperatureConversion_v2{
	public static void main(String[] args){
	char scale;
	double temp;
	
	Scanner input = new Scanner(System.in);
	Temperature t = new Temperature();
	
	System.out.println("請設置溫度單位(C or F) : ");
	scale = input.next().charAt(0);
	t.setScale(scale);
	System.out.println("請設置溫度 : ");
	temp = input.nextDouble();
	
	if(t.getScale()=='C')
		t.setTempC(temp);
	else
		t.setTempF(temp);
	
	t.tempConvert();
	
	System.out.printf("現在是%.2f度C\n", t.getTempC());
	System.out.printf("也就是%.2f度F\n", t.getTempF());
	
	t.tempConvert(scale,temp);
	
	}
}

class Temperature{
    private double f;
		private double c;
		private char scale;
		public void setScale(char scale)
		{
			this.scale = scale;
		}
		public void setTempF(double f)
		{
			this.f = f;
		}
	
		public void setTempC(double c)
		{
			this.c = c;
		}
		public char getScale()
		{
			return scale;
		}
		public double getTempF()
		{
			return f;
		}
		public double getTempC()
		{
			return c;
		}
		public void tempConvert()
		{
			if(scale == 'C')
				f = c*9/5+32;
			else
				c = (f-32)*5/9;
		}
		public void tempConvert(char scale,double t)
		{
			this.scale = scale;
			if(scale == 'C')
				c = t;
			else
				f = t;
			tempConvert();
			System.out.printf("現在是%.2f度F\n",f);
	        System.out.printf("也就是%.2f度C\n",c);
			
		}
}