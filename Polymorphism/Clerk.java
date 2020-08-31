public class Clerk extends Employee
{
	public Clerk(int ID,String nm,String dp,int sa,String ds)
	{
		super(ID,nm,dp,sa,ds);
	}
	
	public void addBonus()
	{
		super.setSalary(super.getSalary()+100);
	}
}