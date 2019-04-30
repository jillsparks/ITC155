import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Names {

	public static void main(String[] args) {
		//Map collection associates objects called keys with objects called values
		//construct map with first name as key and last name as value
		Map<String,String> input = new HashMap<String,String>();
		input.put("Marty", "Stepp");// -------> Stepp -> 1
		input.put("Stuart", "Reges");//
		input.put("Jessica", "Miller");
		input.put("Amanda", "Camp");
		input.put("Hal", "Perkins");
		
		System.out.print(isUnique(input));
	}
	
	public static boolean isUnique(Map<String, String> input) 
	{
		//create a map that contains the last name and how many times they occur
		Map<String, Integer> valueCount = new HashMap<String, Integer>();
		//returns a collection of all values (last names) in the map named input
		Collection<String> values = input.values();
		//for each each value(last name) inside the values collection, loop over
		for (String value: values) 
		{
			String key = value;
			if(valueCount.containsKey(key))//seen before
			{
				int count = valueCount.get(value);
				
				valueCount.put(value, count + 1);
			}
			else
			{
				valueCount.put(value, 1);
			}
			
		}
		
		//create collection of value counts to see if the count is greater than 1
		Collection<Integer> counts = valueCount.values();
		//for each value(integer) inside the counts collection
		for(Integer value : counts)
		{
			if(value > 1)
			{
				return false;
			}
		}
		
		return true;
	}

}
