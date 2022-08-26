package genericsrecap;

public class Employee<T>{
	T t1;
	Employee(T t1)
	{
		this.t1=t1;
	}
	public void display()
	{
		System.out.println(t1);
	}
	public <T> void displayEmployees(T[] employee)
	{
		for(T emp:employee)
		{
			System.out.println(emp);
		}
	}
	
}
