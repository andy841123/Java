import java.util.Scanner;

class Pet
{
	private String type;
	private double dosageA;
	private double dosageB;
	private double weight;
	
	public void setDosage(double a , double b)
	{
		dosageA = a;
		dosageB = b;
	}
	
	public void setWeight(double w)
	{
		weight = w;
	}
	
	public void setType(String t)
	{
		type = t;
	}
	
	public double getDosageA()
	{
		return dosageA;
	}
	public double getDosageB()
	{
		return dosageB;
	}
	public double getWeight()
	{
		return weight;
	}
	public String getType()
	{
		return type;
	}
	public void cal()
	{
		if(type.equalsIgnoreCase("dog"))
		{
			dosageA = (weight / 2.2)*((weight*0.03)/(weight*10));
			dosageB = (weight / 2.2)*((weight*0.5)/(weight*12));
		}
		else if(type.equalsIgnoreCase("cat"))
		{
			dosageA = (weight / 2.2)*((weight*0.002)/(weight*10));
			dosageB = (weight / 2.2)*((weight*0.25)/(weight*12));
		}
		else
		{
			System.out.println("error");
			System.exit(1);
		}
		
	}
}
public class PetInjection
{
	public static void main(String[] args)
	{	
		Scanner keyboard = new Scanner(System.in);
		Pet pet =new Pet();
		
		System.out.println("請設置寵物種類(cat or dog):");
		pet.setType(keyboard.next());
		System.out.println("請設置寵物體重(磅) :");
		pet.setWeight(keyboard.nextDouble());
		
		pet.cal();
		
		System.out.printf("%s, 體重%.2f磅\n",pet.getType(),pet.getWeight());
		System.out.printf("需要注射藥劑A %.5f ml與藥劑B %.5f ml",pet.getDosageA(),pet.getDosageB());
		
		
	}
}

