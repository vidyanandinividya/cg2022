package session5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Path path=Paths.get("src/resources/employee.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of records you want to save");
		Employee[] emp=new Employee[sc.nextInt()];
		try
		{
			Files.write(path,"Employee Details:\n".getBytes(),StandardOpenOption.APPEND);
			for(int i=0;i<emp.length;i++)
			{
				emp[i]=new Employee();
				System.out.println("Enter Employee ID");
				emp[i].setId(sc.nextInt());
				System.out.println("Enter Employee Name");
				emp[i].setName(sc.next());
				Files.write(path, emp[i].toString().getBytes(),
						StandardOpenOption.APPEND);
				Files.write(path, "\n".getBytes(),
						StandardOpenOption.APPEND);
				
				System.out.println("Employee Record saved successfully");
			}
		}
		catch(IOException ioe)
		{
			System.out.println("An erro occured");
		}

	}

}
