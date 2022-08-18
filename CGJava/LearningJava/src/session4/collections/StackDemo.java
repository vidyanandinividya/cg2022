package session4.collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args)
	{
		Stack<String> vehicles=new Stack<>();
		vehicles.push("car");
		vehicles.push("bike");
		vehicles.push("bus");
		vehicles.push("auto");
		System.out.println("Stack: "+vehicles);
		System.out.println(vehicles.peek());
		vehicles.pop();
		System.out.println("Stack: "+vehicles);
		System.out.println(vehicles.peek());
	}

}
