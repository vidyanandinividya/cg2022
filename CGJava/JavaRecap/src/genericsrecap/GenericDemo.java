package genericsrecap;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee<String> e1=new Employee<>("john");
Employee<Integer> e2=new Employee<>(2);
//e1.display();
//e2.display();
Integer[] empId= {2,3,4,5,6};
String[] empName= {"john","annie","cielo","henry","glen"};
Double[] empSal= {1000.23,3400.45,5669.67,3456.12,5478.98};
e1.displayEmployees(empId);
e1.displayEmployees(empName);
e1.displayEmployees(empSal);
	}

}
