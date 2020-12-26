package paretchildabs10;

public class Employee {
	private String Name;
	private float salary;
	private  float netsalary;
	
	public Employee(String name, float salary, float netsalary) {
		super();
		Name = name;
		this.salary = salary;
		this.netsalary = netsalary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(float netsalary) {
		this.netsalary = netsalary;
	}
	
	

}
