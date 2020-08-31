import java.util.Scanner;

public class PICalcTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入球體半徑:");
		double r1 = input.nextDouble();
		System.out.println("請輸入圓柱半徑:");
		double r2 = input.nextDouble();
		System.out.println("請輸入圓柱高:");
		double h = input.nextDouble();
		
		System.out.printf("球體體積:%.2f\n",PICalc.calcVolume(r1));
		System.out.printf("球體表面積:%.2f\n",PICalc.calcSurface(r1));
		System.out.printf("圓柱體積:%.2f\n",PICalc.calcVolume(r2,h));
		System.out.printf("圓柱表面積:%.2f\n",PICalc.calcSurface(r2,h));
		
	}
}