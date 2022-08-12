package session1;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		//that prints the sum of 5 numbers
		Scanner sc=new Scanner(System.in);
		int numOfInput=0;
		int sum=0;
		/*while(num<=5)
		{
			sum+=num;
			num++;
		}
		System.out.println("The sum is:"+sum);*/
		while(true)
		{
			
			if(numOfInput==5)
				break;
		
		System.out.println("Input Number");
		sum+=sc.nextInt();
		numOfInput++;
		}
		
		System.out.println("The sum of the number is "+sum);

	}

}
