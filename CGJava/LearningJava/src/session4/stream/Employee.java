package session4.stream;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private String dept;
	public Employee(int id, String name, int age, String gender, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public double getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary
				+ ", dept=" + dept + "]";
	}
	

}
