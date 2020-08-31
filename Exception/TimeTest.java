import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeTest{
	public static void main(String[] args){
		System.out.println("Please input hr & min for 24-hr clock");
		time1();
		
		System.out.println("Please input period & hr & min for 12-hr clock");
		time2();
	}
	
	public static void time1(){
		Scanner input = new Scanner(System.in);
		try{
			int hr = input.nextInt();
			int min = input.nextInt();
			Time t1 = new Time(hr, min);
			t1.convert24to12();
			t1.writeOutput();
		}catch(TimeException te){
			System.out.println(te.getMessage());
		}catch(InputMismatchException ime){
			System.out.println("The type of input is wrong!");
		}
	}
	
	public static void time2(){
		Scanner input = new Scanner(System.in);
		try{
			String period = input.next();
			int hr = input.nextInt();
			int min = input.nextInt();
			Time t2 = new Time(period, hr, min);
			t2.convert12to24();
			t2.writeOutput();
		}catch(TimeException te){
			System.out.println(te.getMessage());
		}catch(InputMismatchException ime){
			System.out.println("The type of input is wrong!");
		}
	}
}