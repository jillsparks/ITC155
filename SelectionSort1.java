
import java.util.Arrays;
import java.util.Random;

//because it's a nested loop, the complexity is O(N^2)

public class SelectionSort1 {
	
	public static void main(String[] args) {
		
		// selection sort
		// place elements of array into a sorted order
		// post: array is sorted in decreasing order
	        int[] numbers = {2, 5, -2, 4, 3, 42};
	        
	        selectionSort(numbers);
	        System.out.println(Arrays.toString(numbers));
	    } 
	

	public static void selectionSort(int[]a) {
	        for (int i=a.length-1; i >=0; i--) {
	            //find index of largest remaining value
	            int largest = i;
	            for( int j = 0; j < i; j++) {
	                //if a at index j is greater than a at index largest
	                if (a[j] > a[largest]) {
	                    largest = j;
	                }
	            }
	            //swap largest value its proper place, i[1]
	            swap(a, i, largest);
	        }
	    } // swap a[i] with a[j]
	

	private static void swap(int[] a, int i, int largest) {
	        if (i != largest) {
	            int temp = a[i];
	            a[i] = a[largest];
            a[largest] = temp;	        
            }
	}
}