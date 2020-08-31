import java.util.Scanner;

public class SortingByMethod
{
	public static void main(String[] args)
	{	
		int[] s ;
		s = new int[15];
		Scanner keyboard = new Scanner(System.in);
		for(int i= 0;i<15;i++){
			System.out.printf("請輸入%d號成績:",i+1);
			s[i]=keyboard.nextInt();
		}
			
		score(s);
	}
	public static void score(int[] arr)
	{
		for(int i=(arr.length-1);i>0;i--){
			for(int j=0;j<(arr.length-1);j++){
				if(arr[j]>arr[j+1]){
					int a;
					a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
				
			}
			
		}
		System.out.println("排序後結果:");
		for(int i = 0;i<15;i++){
			System.out.print(arr[i]+" ");
		}
		
		double avg;
		int total = 0;
		for(int i=0;i<15;i++){
			total+=arr[i];
		}
		avg = total/15.0;
		System.out.println();
		System.out.printf("最大值: %d\n",arr[14]);
		System.out.printf("最小值: %d\n",arr[0]);
		System.out.printf("平均值: %.2f\n",avg);
		System.out.printf("中位數: %d",arr[7]);
	}
}
