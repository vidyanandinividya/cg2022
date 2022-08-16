package session2.inheritance;

import java.util.ArrayList;
import java.util.List;

class Organization
{
	ArrayList<Employee> employeeList; //Association(Composition)
	private String org_name;

	public Organization(String org_name) {
		super();
		this.org_name = org_name;
	}

	public String getOrg_name() {
		return org_name;
	}

	public List<String> getEmployeeList() {
		List<Employee> employees=this.employeeList;
		List<String> names=new ArrayList<>();
		for(Employee e:employees)
		{
			names.add(e.getName());
		}
		return names;
	}

	public void setEmployeeList() {
		//Create three Employees
		Employee e1=new Employee("John");
		Employee e2=new Employee("Jack");
		Employee e3=new Employee("Tom");
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		this.employeeList = emps;
	}
	
	
}
class Employee
{
private String name;

public Employee(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

}
public class CompositionDemo {

	public static void main(String[] args) {
		
		Organization capgem=new Organization("CapGemini");
		capgem.setEmployeeList();
		System.out.println("The Employees working in "+
		capgem.getOrg_name()+ " are "+ capgem.getEmployeeList());
	}

}
