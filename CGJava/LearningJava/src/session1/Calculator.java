package session1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//creating the scanner
		Scanner sc=new Scanner(System.in);
		//identify the input values and declare the variables for them
		int num1,num2;
		//Assign the user input to the variables
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter the second number");
		num2=sc.nextInt();
		int result=num1+num2;
		System.out.println("The Sum:"+result);
		//System.out.println("The Average:"+(result/2));
		//use this result in the conditional operations
		if(result>100) //if the sum is over 100
		{
			System.out.println("too much");
		} 
		else if(result<0) //if the sum is less than 0
		{
			System.out.println("too little");
		}
		else //othewise
		{
			System.out.println("OK");
		}
		

	}

}
