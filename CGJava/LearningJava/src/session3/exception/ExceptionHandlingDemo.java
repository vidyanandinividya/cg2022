package session3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{ 
				System.out.println("Try Block");
			
			try {
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				System.out.println("Result: "+num1/num2);
				
			}
			catch(ArithmeticException | NullPointerException | InputMismatchException e)
			{
				System.out.println("provide positive value");
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
			try
			{
				int arr[]=new int[2];
				System.out.println("Array element:"+arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println(ae.getMessage());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Free the resources");
		}

	}
}


