import java.util.Scanner;

public class QuadrilateralsTest{
	public static void main(String[] args){
		int[] in = new int[7];		//有7個由鍵盤輸入的數字存放在in
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter right trapezoid's upBase, downBase, height and leg in sequence.");
		for(int i=0; i<4; i++)		//in[0]~in[3]
			in[i] = input.nextInt();
		
		System.out.println("Please enter rectangle's two sides.");
		for(int i=4; i<6; i++)		//in[4]&in[5]
			in[i] = input.nextInt();
		
		System.out.println("Please enter square's side.");
		in[6] = input.nextInt();	//in[6]
		
		RightTrapezoid Q1 = new RightTrapezoid(in[0],in[1],in[2],in[3]); 
		Rectangle Q2 = new Rectangle(in[4],in[5]);
		Square Q3 = new Square(in[6]);
		
		Quadrilateral[] Quads = new Quadrilateral[3];
		Quads[0] = Q1;	//RightTrapezoid
		Quads[1] = Q2;	//Rectangle
		Quads[2] = Q3;	//Square
		
		for(Quadrilateral Q : Quads){
			Q.writeOutput();
			
			if( Q instanceof Parallelogram ){
				Parallelogram para = (Parallelogram)Q;
				para.set(8,7);
				para.writeOutput();
			}
		}
		
	}
}