package session5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVDemo {

	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("src/resources/employee.csv"));
			sc.useDelimiter(",");
			while(sc.hasNext())
			{
				System.out.print(sc.next()+"\t");
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
