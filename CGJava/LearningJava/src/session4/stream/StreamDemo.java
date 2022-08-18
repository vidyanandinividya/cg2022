package session4.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.*;

public class StreamDemo {
	private static int sumIterator(List<Integer> list)
	{
		/*Iterator<Integer> iterator=list.iterator();
		int sum=0;
		while(iterator.hasNext())
		{
			int num=iterator.next();
			if(num>10)
			{
				sum+=num;
			}
		}
		return sum;*/
		return list.stream().
				filter(i->i>10).
				mapToInt(i->i).
				sum();
	}
	
	public static void main(String[] args) {
		//List<Integer> list=Arrays.asList(20,10,15,15,3);
		//System.out.println(sumIterator(list));
		
		//Stream<Integer> stream=Stream.of(1,2,3,4);
		//stream.forEach(System.out::println);
		//Stream<Integer> stream=Stream.of(new Integer[] {12,2,4,56,7});
		//stream.forEach(System.out::println);
		/*List<Integer> myList=new ArrayList<>();
		for(int i=0;i<5;i++)
			myList.add(i);
		//sequential stream
		Stream<Integer> seqStream=myList.stream();
		seqStream.forEach(System.out::println);
		System.out.println("===================");
		//Parallel stream
		Stream<Integer> parStream=myList.parallelStream();
		parStream.forEach(System.out::println);*/

		//Stream<String> stream1=Stream.generate(()->{return "abc";});
		//stream1.forEach(System.out::println);
		//Stream<String> stream2=Stream.iterate("xyz",(i)->i);
		//stream2.forEach(System.out::println);
		/*Stream<Integer> randomNumbers=Stream.generate(
				()->(new Random().nextInt(100)));
		randomNumbers.limit(10).forEach(System.out::println);*/
		List<Integer> intList=Stream.of(1,2,4,5)
				.collect(Collectors.toList());
		System.out.println(intList);
		Integer[] intArray=Stream.of(2,3,4,5)
					.toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray));
		
		
		
	}

}
