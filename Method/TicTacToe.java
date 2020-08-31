import java.util.Scanner;

public class TicTacToe
{
	public static void main(String[] args)
	{	
		char[][] TTT = {{'0','|','0','|','0'},{'-','+','-','+','-'},{'0','|','0','|','0'},{'-','+','-','+','-'},{'0','|','0','|','0'}};
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to play 3x3 Tic-Tac-Toe");
		System.out.println("O go first");
		System.out.println("Please input the row and column sequentially");
		
		while(true){
			int ox,oy,xx,xy;
			System.out.println("row column =");
			ox=keyboard.nextInt();
			oy=keyboard.nextInt();
			
			if(ox==2)
				ox+=1;
			else if(ox==3)
				ox+=2;
			if(oy==2)
				oy+=1;	
			else if(oy==3)
				oy+=2;
			TTT[ox-1][oy-1] = 'O';
			
			
			for(int i = 0;i<5;i++){
				for(int j = 0;j<5;j++){
					if(TTT[i][j]!='0')
						System.out.printf("%c",TTT[i][j]);
					else
						System.out.printf("%c",' ');
				}
				System.out.println();
			}
			
			
			
			for(int i = 0;i<5;i+=2){ //判斷誰贏
				if(TTT[i][0]==TTT[i][2]&&TTT[i][4]==TTT[i][2]){
					if(TTT[i][0]=='0')
						break;
					else{	
						System.out.printf("Player %c wins!",TTT[i][0]);
						System.exit(0);
					}	
				}
				else if(TTT[0][i]==TTT[2][i]&&TTT[4][i]==TTT[2][i]){
					if(TTT[0][i]=='0')
						break;
					else{	
						System.out.printf("Player %c wins!",TTT[0][i]);
						System.exit(0);
					}	
				}
				else if(TTT[0][0]==TTT[2][2]&&TTT[2][2]==TTT[4][4]){
					if(TTT[2][2]=='0')
						break;
					else{	
						System.out.printf("Player %c wins!",TTT[0][0]);
						System.exit(0);
					}	
				}
				else if(TTT[4][0]==TTT[2][2]&&TTT[2][2]==TTT[0][4]){
					if(TTT[2][2]=='0')
						break;
					else{	
						System.out.printf("Player %c wins!",TTT[2][2]);
						System.exit(0);
					}	
				}
			}
			
			
			
			if(TTT[0][0]!='0'&&TTT[0][2]!='0'&&TTT[0][4]!='0'&&TTT[2][0]!='0'&&TTT[2][2]!='0'&&TTT[2][4]!='0'&&TTT[4][0]!='0'&&TTT[4][2]!='0'&&TTT[4][4]!='0'){
				System.out.printf("Tie!");//平手情況
				break;
			}
				
			//上面圈下面叉
			
			System.out.println("row column =");
			xx=keyboard.nextInt();
			xy=keyboard.nextInt();
			
			if(xx==2)
				xx+=1;
			else if(xx==3)
				xx+=2;
			if(xy==2)
				xy+=1;
			else if(xy==3)
				xy+=2;
				
			TTT[xx-1][xy-1] = 'X';
				
			for(int i = 0;i<5;i++){
				for(int j = 0;j<5;j++){
					if(TTT[i][j]!='0')
						System.out.printf("%c",TTT[i][j]);
					else
						System.out.printf("%c",' ');
				}
				System.out.println();
			}
			
			for(int i = 0;i<5;i+=2){ //判斷誰贏
				if(TTT[i][0]==TTT[i][2]&&TTT[i][4]==TTT[i][2]){
					if(TTT[i][0]=='0')
						break;
					else{	
						System.out.printf("Player %c wins!",TTT[i][0]);
						System.exit(0);
					}	
				}
				else if(TTT[0][i]==TTT[2][i]&&TTT[4][i]==TTT[2][i]){
					if(TTT[0][i]=='0')
						break;
					else{	
						System.out.printf("Player %c wins!",TTT[0][i]);
						System.exit(0);
					}	
				}
				else if(TTT[0][0]==TTT[2][2]&&TTT[2][2]==TTT[4][4]){
					if(TTT[2][2]=='0')
						break;
					else{	
						System.out.printf("Player %c wins!",TTT[0][0]);
						System.exit(0);
					}	
				}
				else if(TTT[4][0]==TTT[2][2]&&TTT[2][2]==TTT[0][4]){
					if(TTT[2][2]=='0')
						break;
					else{	
						System.out.printf("Player %c wins!",TTT[2][2]);
						System.exit(0);
					}	
				}
			}
			
			if(TTT[0][0]!='0'&&TTT[0][2]!='0'&&TTT[0][4]!='0'&&TTT[2][0]!='0'&&TTT[2][2]!='0'&&TTT[2][4]!='0'&&TTT[4][0]!='0'&&TTT[4][2]!='0'&&TTT[4][4]!='0'){
				System.out.printf("Tie!");//平手情況
				break;
			
			}
		}
	}
}