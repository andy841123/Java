import java.util.Scanner;

public class Array_ICP01
{
	public static void main(String[] args)
	{	
		int[][] g = new int[5][2];
		int mbe = 0,ebm = 0,mee = 0;
		
		Scanner keyboard = new Scanner(System.in);
		for(int i =0;i<5;i++){
			for(int j=0;j<2;j++){
				if(j==0)
					System.out.printf("請輸入%d號的數學成績:",i+1);
				else
					System.out.printf("請輸入%d號的英文成績:",i+1);
				g[i][j] = keyboard.nextInt();
			}
		}
		for(int i =0;i<5;i++ ){
			if(g[i][0] > g[i][1])
				mbe++;
			else if(g[i][0] <g[i][1])
				ebm++;
			else
				mee++;
				
		}
		System.out.printf("數學比英文好的人數:");
		for(int i = 0;i<mbe;i++)
			System.out.printf("*");
		System.out.printf("\n");
		System.out.printf("英文比數學好的人數:");
		for(int i = 0;i<ebm;i++)
			System.out.printf("*");
		System.out.printf("\n");
		System.out.printf("數學跟英文一樣好的人數:");
		for(int i = 0;i<mee;i++)
			System.out.printf("*");
		
	}
}