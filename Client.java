
public class Client {

	public static void main(String[] args) {
		int[] data = {11, -7, 3, 42, 3, 0, 14, 3};
		//construct two lists
		ArrayIntList list1 = new ArrayIntList();
		for(int n : data) {
		
			list1.add(n);
		}
		System.out.println("Original list: " +list1);
	
		list1.replaceAll(3, 999);
		//new list with replaceAll method
		System.out.println("New list: " +list1);
		

	}

}
