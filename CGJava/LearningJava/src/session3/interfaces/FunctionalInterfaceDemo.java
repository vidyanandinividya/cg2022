package session3.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo  {

	public static void main(String[] args) {
		//create a list of Strings
		/*List<String> names=Arrays.asList("John","Jack","Harry","James","Tom");
		
		//get the names start from J
		Predicate<String> p=(s)->s.startsWith("J");
		System.out.println("Names starting with J:");
		for(String st:names)
		{
			//test each entry with predicate
			if(p.test(st))
				System.out.println(st);
		}*/
	//lambda expression to define the calc method
	functional_interface<Integer> add=(a,b)-> {
				return a+b;
		};
	functional_interface<Integer> mul=(a,b)-> {
			return a*b;
	};
	functional_interface<Double> multiplication=(a,b)-> {
		return a*b;
	};
	
	System.out.println("Addition: "+add.calc(2, 3));
	System.out.println("Multiplication "+mul.calc(5, 4));
	System.out.println("Multiplication "+multiplication.calc(5.2, 4.5));
	

	}

}
