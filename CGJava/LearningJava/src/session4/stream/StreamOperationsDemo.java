package session4.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationsDemo {

	public static void main(String[] args) {
		
		boolean result=Stream.of("John","Jack","Tom","Andrey")
		.anyMatch((s)->s.startsWith("J"));
		System.out.println(result);
		
		boolean result1=Stream.of("John","Jack","Tom","Andrey")
				.allMatch((s)->s.startsWith("J"));
		System.out.println(result1);
		
		boolean result2=Stream.of("John","Jack","Tom","Andrey")
				.noneMatch((s)->s.startsWith("K"));
		System.out.println(result2);
		
		System.out.println(Stream.of("John","Jack","Tom","Andrey","Annie").
				filter(i->i.startsWith("A"))
				.findFirst()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*List<Integer> list=new ArrayList<>();
		for(int i=1;i<15;i++)
		{
			list.add(i);
		}
		list.stream().filter(i->i%2==0).collect(Collectors.toList())
		.forEach(System.out::println);
		
		Stream<String> names=Stream.of("John","Jack","Tom","Andrey");
		names.filter((s)->s.startsWith("J"))
		.map(String::toUpperCase)
		.sorted()
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		Map<Integer,Integer> intMap=Stream.of(1,2,3,4)
		.collect(Collectors.toMap(i->i, i->i+10));
		System.out.println(intMap);
		
		System.out.println(Stream.of(1,2,3,4,5).count());
		System.out.println(Stream.of(1,2,3,4,5)
				.reduce((i,j)->{ return i * j;}));*/
		
		
	}

}
