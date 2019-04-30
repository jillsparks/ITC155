import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Unique {

	public static void main(String[] args) {
		//adding integers to the HashSet
		Set<Integer> list = new HashSet<Integer>();
		list.add(3);
		list.add(7);	
		list.add(3);
		list.add(-1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(2);
		list.add(15);
		list.add(15);
		
		//System.out.println("The list contains: " +list);
		
		countUnique(list);
		System.out.println("Number of unique numbers in the list is: " +list.size());
		

	}
	
	public static void countUnique(Set<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer total = itr.next();
					
		}
	}
	

}
