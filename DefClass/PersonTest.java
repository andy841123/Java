import java.util.Scanner;

public class PersonTest
{
	public static void main(String[] args)
	{	
		Scanner keyboard = new Scanner(System.in);
		Person per = new Person();
		
		System.out.println("請輸入名字:");
		per.setName(keyboard.next());
		System.out.println("請輸入電話:");
		per.setPhone(keyboard.next());
		System.out.println("喜歡做的事:");
		per.setHobby(keyboard.next());
		
		System.out.printf("%s",per.toString());
	}
}

