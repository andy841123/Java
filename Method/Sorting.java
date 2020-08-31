public class Sorting
{
	public static void main(String[] args)
	{	
		int[] a= {-15,2,10,9,-3};
		sort(a);
		for(int i =0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}
	public static void sort(int[] arr)
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
		
	}
}
