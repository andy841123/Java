public class EmployeeTest{
	public static void main(String[] args){
		Manager m1 = new Manager(9453, "Eric", "Sales", 1500, "Sagittarius");
		Clerk c2 = new Clerk(9527, "Elsa", "IT", 1050, "Aries");
		Manager m3 = new Manager(5487, "Edwary", "Human Resources", 1800, "Gemini");
		Manager m4 = new Manager(8745, "Allen", "Marketing", 1750, "Libra");
		Clerk c5 = new Clerk(9487, "Train", "Procurement", 1350, "Sagittarius"); 
		
		Employee[] emp = new Employee[5];
		emp[0] = m1;
		emp[1] = c2;
		emp[2] = m3;
		emp[3] = m4;
		emp[4] = c5;
		
		for(Employee e : emp){
			System.out.println(m1.equals(e));
		}
		
		System.out.println();
		System.out.println("Before Adding Bonus\n");
		
		for(Employee e : emp){
			e.writeOutput();
			e.addBonus();
		}
		
		System.out.println("After Adding Bonus\n");
		
		for(Employee e : emp){
			e.writeOutput();
		}
	}
}