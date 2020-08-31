public class fe01
{	
	enum Suit {CLUBS , DIA , HEARTS , SPAD};
	public static void main(String[] args)
	{	
		for(Suit nextSuit:Suit.values())
			System.out.print(nextSuit+" ");
			
	}
}