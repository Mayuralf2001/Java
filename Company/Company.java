package fundamentals;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee employee = new Employee(101, "Mayur", "GET", 50000);
//		System.out.println(employee);
		
//		Employee employee = new Employee();
//		employee.setId(26190);
//		employee.setName("Mayur");
//		employee.setDesignation("GET");
//		employee.setSalary(50000);
//		
//		System.out.printf("Employee [id=%d, name=%s, designation=%s, salary=%.2f]\n",
//				employee.getId(), employee.getName(), employee.getDesignation(), employee.getSalary());
		
		Employee employee1 = new Employee(101, "Mayur", "GET", 50000);
		Employee employee2 = new Employee(101, "Atharva", "GET", 50000);
		
		System.out.printf("Employee1 [id=%d, name=%s, designation=%s, salary=%.2f]\n",
				employee1.getId(), employee1.getName(), employee1.getDesignation(), employee1.getSalary());
	}

}
