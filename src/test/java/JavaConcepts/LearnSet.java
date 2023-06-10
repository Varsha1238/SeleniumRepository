package JavaConcepts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Set<Integer> hashSet = new HashSet<Integer>();
	hashSet.add(100);
	hashSet.add(40);
	hashSet.add(67);
	System.out.println(hashSet);
	System.out.println(hashSet.contains(67));
	System.out.println(hashSet.isEmpty());
	System.out.println(hashSet.size());	
	

	Set<Integer> hashSet1 = new LinkedHashSet<Integer>();
	hashSet1.add(100);
	hashSet1.add(40);
	hashSet1.add(67);
	System.out.println(hashSet1);
	System.out.println(hashSet1);
	System.out.println(hashSet1.contains(67));
	System.out.println(hashSet1.isEmpty());
	System.out.println(hashSet1.size());	
	
	Set<Integer> hashSet11 = new TreeSet<Integer>();
	hashSet11.add(100);
	hashSet11.add(40);
	hashSet11.add(67);
	//hashSet1.remove(78);
	System.out.println(hashSet11);
	System.out.println(hashSet11.contains(67));
	System.out.println(hashSet11.isEmpty());
	System.out.println(hashSet11.size());	
	
	}

}
