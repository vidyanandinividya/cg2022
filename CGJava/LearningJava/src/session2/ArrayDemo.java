package session2;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int[] numbers=new int[3];
		numbers[0]=2;
		numbers[1]=5;
		numbers[2]=10;
		System.out.println(numbers[0]);
		//System.out.println(numbers[-1]);
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		String[] names=new String[n];
		System.out.println("There are "+names.length+ "elements in the array");
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Enter the element:");
			names[i]=sc.next();
		}
		int index=0;
		System.out.println("The array elements are:");
		while(index<names.length)
		{
			System.out.print(names[index]+"\t");
			index++;
		}
		//using for-each loop for printing array
		System.out.println();
		for(String element:names)
		{
			System.out.println(element);
		}
		for (int element:numbers)
		{
			System.out.println(element);
		}

	}

}
