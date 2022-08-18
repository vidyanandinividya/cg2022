package session4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(50);
		list.add(30);
		list.add(10);
		System.out.println(list);
		//for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println("The element is:"+ list.get(i));
		}
		//for each loop
		for(Integer element:list)
		{
			System.out.println("foreach element is:"+element);
		}
		//Iterator interface
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println("iterator:"+ it.next());
		}
		//Java 8 (method reference
		list.forEach(System.out::println);
		//lambda expression
		list.forEach(l->System.out.println(l));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(list);
		list.add(6); //This will add 6 at the end of the list
		System.out.println(list);
		list.add(2,30);//This will add 30 at index number 2
		System.out.println(list);
		//list.add(8,10);
		//System.out.println(list);
		List<Integer> newList=new ArrayList<>();
		newList.add(150);
		newList.add(160);
		list.addAll(newList); //This will add all the elements from newList
		System.out.println(list);
		System.out.println(list.get(7));
		//list.remove(2); //This will remove the element form the index value
		//System.out.println(list);
		//list.remove(Integer.valueOf(150)); //This will remove the element directly
		//System.out.println(list);
		//list.clear();
		//System.out.println(list);
		System.out.println(list.contains(30));
		list.set(1, 50);
		System.out.println(list);*/

	}

}
