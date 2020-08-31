public class EM01
{
	enum MovieRating {E, A, B};
	public static void main(String[] args)
	{	
		MovieRating rating;
		rating = MovieRating.B;
		
		switch(rating)
		{
			case E:
				System.out.println("One");
				break;
			case A:
				System.out.println("Two");
				break;
			case B:
				System.out.println("Three");
				break ;
			default:
				System.out.println("No");
		}
	}
}