package session1;

import java.util.Scanner;

public class ReadingValues {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scanner.nextLine();
		System.out.println("Enter integer value");
		int integer=scanner.nextInt();
		System.out.println("Enter double value");
		double floatingPoint=scanner.nextDouble();
		System.out.println("Enter Boolean Value");
		boolean trueOrFalse=scanner.nextBoolean();
		System.out.println("Enter Character value");
		char singleCharacter=scanner.next().charAt(0);
		System.out.println(name);
		System.out.println(integer);
		System.out.println(floatingPoint);
		System.out.println(trueOrFalse);
		System.out.println(singleCharacter);

	}

}
