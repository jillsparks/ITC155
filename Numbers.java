
public class Numbers {

	public static void main(String[] args) {
		writeNums(7);
		

	}
	
	public static void writeNums(int n) {
		if (n ==1) {
			//base case
			System.out.print(n);;
		}else {
			//recursive case 
			writeNums(n-1);
			
		
			System.out.print("," + n);
		}
	}

}
