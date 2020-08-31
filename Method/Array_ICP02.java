import java.util.Scanner;

public class Array_ICP02
{
	public static void main(String[] args)
	{	
		int[] sc = new int[10];
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0;i<10;i++)
			sc[i] = keyboard.nextInt();
		for(int i=0 ; i<110;i+=10){
			if(i==100)
				System.out.printf("100:");
			else
				System.out.printf("%d-%d:",i,i+9);
			for(int j = 0;j<10;j++){
				if(sc[j]>=i&&sc[j]<i+10)
					System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}
}