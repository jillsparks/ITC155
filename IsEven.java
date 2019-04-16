import java.io.FileNotFoundException;
import java.util.ArrayList;

public class IsEven {
	//throws clause included  in the header for the main method to state that main method
	//might generate this exception
	public static void main(String[] args) throws FileNotFoundException{
		
		//build the list of words
		ArrayList<String> list = new ArrayList<String>();
		list.add("Winston");
		list.add("Franklin");
		list.add("cats");
		list.add("icecream");
		list.add("flowers");
		list.add("perfume");
		
		System.out.println("list = " +list);
		removeEvenLength(list);
		System.out.println(list);
		
		
}
	//removes all strings of even length from the given list.
	public static void removeEvenLength(ArrayList<String> list) {
		int i = 0;
		while (i < list.size()) {
			String element = list.get(i);
			if (element.length() % 2 ==0) {
				list.remove(i);
			}else {
				i++;
			}
		}
	}
}
	