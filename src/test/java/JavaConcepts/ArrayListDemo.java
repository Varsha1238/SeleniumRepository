package JavaConcepts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<String>();
		students.add("varsha");
		students.add("kulkarni");
		students.add("30");
		System.out.println(students);
		students.remove(1);
		//students.remove(String.valueOf("varsha"));
		System.out.println(students);
		students.set(1, "100");
		System.out.println(students);
		System.out.println(students.contains("10"));
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println("Print with for "+students.get(i));
		}
		
		for (String string : students) {
			System.out.println("For each Print with for "+string);
			
		}
		
		Iterator<String> it = students.iterator();
		
		while(it.hasNext())
		
		{
			System.out.println("Iterator Print with for "+it.next());
		}
				
		ArrayList<String> studentsnew = new ArrayList<String>();
		studentsnew.add("new1");
		studentsnew.add("new2");
		students.addAll(studentsnew);
		System.out.println(students);
		
		students.clear();
		System.out.println(students);
		Stack <String> animals=new Stack<String>();
		animals.push("cat");
		animals.push("horse");
		System.out.println(animals);
		System.out.println(animals.peek());	
		animals.pop();		
		System.out.println(animals);
		
		Queue<Integer> q = new LinkedList<Integer>();
		
	q.offer(10);
	q.offer(20);
	q.offer(45);	
	System.out.println(q);
	q.poll();
	System.out.println(q);	
	System.out.println(q.peek());
	
	
	LinkedList<String> LinkList = new LinkedList<String>();
	LinkList.add("100");
	LinkList.add("200");
	LinkList.add("300");
	
	System.out.println(LinkList);
	
	LinkList.remove(1);
	
	System.out.println(LinkList);
	
	Queue<Integer> pq = new PriorityQueue<Integer>();
	pq.offer(40);
	pq.offer(12);
	pq.offer(24);
	pq.offer(36);

	
	System.out.println(pq.peek());
		
  pq.poll();
  System.out.println(pq);
		  	
}

}
