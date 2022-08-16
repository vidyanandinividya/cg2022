package session2;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "Harry");
		Employee e2=new Employee(2, "John");
		Employee e3=new Employee(3, "Thomas");
		//declaring array of objects
		Employee emp[]=new Employee[3];
		emp[0]=e1;
		emp[1]=new Employee(2,"lily");
		emp[2]=new Employee(3,"cielo");
		for(Employee e:emp)
		{
		System.out.println(e);
		}
		

	}

}
