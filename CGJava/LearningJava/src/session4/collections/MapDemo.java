package session4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	//Exercise 1
	public static List<Integer> getValues(HashMap<String, Integer> map)
	{
		// Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list
            = new LinkedList<Map.Entry<String, Integer> >(
                map.entrySet());
 
        // Sort the list using lambda expression
        Collections.sort(
            list,
            (i1,
             i2) -> i1.getValue().compareTo(i2.getValue()));
 
        // put data from sorted list to hashmap
        List<Integer> temp
            = new ArrayList<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.add(aa.getValue());
            
        }
		return temp;
	}
	//Exercise 2
	
	public static Map<Character, Integer> countCharacter(Character[] chars) {
		HashMap<Character, Integer> returnMap = new HashMap<>();
		
		for(Character c : chars) {
			//returnMap.put(c, returnMap.containsKey(c) ? returnMap.get(c)+1 : 1);
			if(returnMap.containsKey(c)) {
				returnMap.put(c, returnMap.get(c)+1);
			} else {
				returnMap.put(c, 1);
			}
		}
		
		return returnMap;
	} 
	//Exercise 3
	public static Map<Integer, Integer> getSquares(Integer[] chars) {
		HashMap<Integer, Integer> returnMap = new HashMap<>();
		
		for(Integer c : chars) {
			returnMap.put(c, c*c);
		}
		
		return returnMap;
	} 
	public static void main(String[] args) {
		HashMap<String, Integer> numbers=new HashMap<>();
		numbers.put("one", 3);
		numbers.put("two", 1);
		numbers.put("three", 5);
		System.out.println(getValues(numbers));
		Character[] ch= new Character[] {'A','A','B','C','C','D'};
		System.out.println(countCharacter(ch));
		Integer[] arr=new Integer[] {2,3,4,5,6};
		System.out.println(getSquares(arr));
		/*Map<String, Integer> numbers=new TreeMap<>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		System.out.println(numbers);
		System.out.println(numbers.containsValue(3));
		System.out.println(numbers.isEmpty());
		if(!numbers.containsKey("two"))
		{
		numbers.put("two", 4);
		}
		numbers.putIfAbsent("four", 45);
		System.out.println(numbers);
		for(Map.Entry<String, Integer> e:numbers.entrySet())
		{
			System.out.println(e);
			//System.out.println(e.getKey());
			//System.out.println(e.getValue());
		}
		for(String key:numbers.keySet())
		{
			System.out.println(key);
		}
		for(Integer value:numbers.values())
		{
			System.out.println(value);
		}*/

	}

}
