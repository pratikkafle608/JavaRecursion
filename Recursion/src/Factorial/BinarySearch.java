
/*Binary search is an algorithm to search for an element in a sorted list.
 * It works on a recursive principle
 * the steps of binary searching searching algorithm are:
 * 1. First we divide the data into two halves with a mid-value, 
 * 2. Mid-value can be determined by adding first index and last index divided by 2
 * 3. then when we get mid-point then compare the value at midpoint index with the target element
 * 4. if it matches then return the index 
 * 5. if mid is small then ignore the right half and take the left half for comparison
 * 6. then change the last element index as the mid-point index-1, first index being the same
 * 7. then again divide that into two halves 
*/
package Factorial;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		int number= input.nextInt();
		int size = input.nextInt();
		int[] array = new int[size];
		
		for(int i=0;i<array.length;i++) {
			array[i] = input.nextInt();
		}
		
		int low = 0;
		int high = array.length-1;
		
		System.out.println(number+" is in index " + binarySearch(array, number,0,array.length-1));
	}
	
	public static int binarySearch(int[] data, int target, int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid = (low+high)/2;
		
		if(target==data[mid]) {
			return mid;
		}
		if(target>data[mid]) {
			return binarySearch(data, target, mid+1, high);
		}
		else {
			return binarySearch(data, target,low, mid-1 );
		}
		
		
	}
	
}
