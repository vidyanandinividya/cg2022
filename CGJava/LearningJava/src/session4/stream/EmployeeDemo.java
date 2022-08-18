package session4.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1,"john",32,"Male",2500.00,"HR"));
		empList.add(new Employee(2,"andrew",30,"Male",1500.00,"IT"));
		empList.add(new Employee(3,"annie",29,"Female",3500.00,"HR"));
		empList.add(new Employee(4,"cielo",28,"Female",2500.00,"HR"));
		empList.add(new Employee(5,"thomas",24,"Male",2500.00,"Sales"));
		empList.add(new Employee(6,"jack",23,"Male",5000.00,"Marketing"));
		empList.add(new Employee(7,"henry",33,"Male",2300.00,"Sales"));
		empList.add(new Employee(8,"glen",35,"Male",2000.00,"IT"));
		empList.add(new Employee(9,"mario",32,"Male",3500.00,"IT"));
		empList.add(new Employee(10,"isabela",32,"Female",3500.00,"Sales"));
		//System.out.println(empList);
		
		/*empList.stream().
		map(Employee::getDept).distinct().
		forEach(System.out::println);*/
		
	/*Map<String,Long> malefemale=empList.stream().
		collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	System.out.println(malefemale);*/
		
		/*Map<String,Long> empdept=empList.stream().
				collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
			System.out.println(empdept);*/
	
		Map<String,Double> avgsaldept=empList.stream().
				collect(Collectors.groupingBy(Employee::getDept,
						Collectors.averagingDouble(Employee::getSalary)));
			System.out.println(avgsaldept);
	
		

	}

}
