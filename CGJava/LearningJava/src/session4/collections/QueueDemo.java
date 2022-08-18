package session4.collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		/*Queue<Integer> queue=new LinkedList<>();
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);
		queue.offer(48);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());*/
		Queue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
		queue.offer(40);
		queue.offer(12);
		queue.offer(24);
		queue.offer(48);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.peek());
		
		

	}

}
