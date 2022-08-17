package session3.exception;


import java.util.Scanner;

public class Calculator {
	Scanner sc=new Scanner(System.in);
		public void calculation() 
		{
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				System.out.println("Result: "+num1/num2);
	
		}
}
