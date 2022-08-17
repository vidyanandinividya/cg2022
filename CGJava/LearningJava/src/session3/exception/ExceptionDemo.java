package session3.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args)  {
		//Calculator obj=new Calculator();
		//obj.calculation();
		//Try .. Catch .. Finally
		/*Scanner sc=null;
		try
		{
			sc=new Scanner(new File("test.txt"));
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if(sc!=null)
			{
				sc.close();
			}
		}*/
		
		//Try - with - resource
		/*try(Scanner sc=new Scanner(new File("test.txt"));
			PrintWriter pw=new PrintWriter(new File("testwrite.txt"))
			)
		{
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}*/
		try(MyResource first=new MyResource();
			MyResource1 second=new MyResource1())
		{
			first.doSomething();
			second.doSomething();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		

	}

}
