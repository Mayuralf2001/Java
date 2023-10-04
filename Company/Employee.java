package fundamentals;

public class Employee {
	private static long lastId;
	private long id;
	private String name;
	private String designation;
	private double salary;
	
	public Employee(long id, String name, String designation, double salary) {
		id = ++lastId;
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	public Employee(long id, String name, String designation, double salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.designation = designation;
//		this.salary = salary;
//	}
//	
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
//	}

}
