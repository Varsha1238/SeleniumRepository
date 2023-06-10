package JavaConcepts;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuedemo {
	
	
	public static void main(String[] args) {
		
		Queue<Integer> pq = new LinkedList<Integer>();
		pq.offer(40);
		pq.offer(12);
		pq.offer(24);
		pq.offer(36);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
		
		List<Integer> pq2 = new LinkedList<Integer>();
		pq2.add(40);
		pq2.add(34);
		pq2.add(56);
		pq2.add(67);
		System.out.println(pq2);
		pq2.remove(2);
		System.out.println(pq2);
		System.out.println(pq2.get(2));
		
		
		Queue<Integer> pq1 = new PriorityQueue<Integer>();
		pq1.offer(40);
		pq1.offer(12);
		pq1.offer(24);
		pq1.offer(36);
		System.out.println(pq1);
		pq1.poll();
		System.out.println(pq1);
		System.out.println(pq1.peek());
		
		
	}

}
