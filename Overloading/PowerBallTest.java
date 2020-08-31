import java.util.Scanner;

public class PowerBallTest
{
	public static void main(String[] args){
	
		int times;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("請問需要投注幾組?");
		times = keyboard.nextInt();
		PowerBall pb = new PowerBall();
		for(int i = 0;i < times;i++)
		{
			pb.Creat1();
			pb.Creat2();
			System.out.println("第"+(i+1)+"組號碼:");
			System.out.println(pb);
			pb.clear();
		}
	}
}