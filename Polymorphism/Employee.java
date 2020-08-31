abstract class Employee
{
	private String department;
	private String designation;
	private int employeeID;
	private String name;
	private int salary;
	
	public Employee(int ID,String nm,String dp,int sa,String ds)
	{
		department = dp;
		designation = ds;
		employeeID = ID;
		name = nm;
		salary = sa;
	}
	
	public boolean equals(Employee e)
	{
		if(designation.equalsIgnoreCase(e.getDesignation()))
			return true;
		else
			return false;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public String getDesignation()
	{
		return designation;
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setDepartment(String dp)
	{
		department = dp;
	}
	
	public void setDesignation(String ds)
	{
		designation = ds;
	}
	
	public void setEmployeeID(int ID)
	{
		employeeID = ID;
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public void setSalary(int sa)
	{
		salary = sa;
	}
	
	public void writeOutput()
	{
		System.out.println("--- Personal Information ---");
		System.out.printf("Employee ID : %d\nName: %s\nDepartment: %s\nSalary: %d\nDesignation: %s\n",employeeID,name,department,salary,designation);
	}
	
	abstract void addBonus();
}