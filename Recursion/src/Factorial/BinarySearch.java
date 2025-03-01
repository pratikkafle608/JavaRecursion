
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
		int number= input.nextInt();	//asking user to enter the number to search in an array  
		int size = input.nextInt();	//asking user to enter the size of the array
		int[] array = new int[size];
		
		for(int i=0;i<array.length;i++) {
			array[i] = input.nextInt(); //asking the user to add data in the array "array[i]" until i <length of an array
		}
		
		int low = 0;	// initializing the lowest array index
		int high = array.length-1;	//initializing the index of the last index in an array
		
		System.out.println(number+" is in index " + binarySearch(array, number,0,array.length-1));	//displaying the index of the number in an array using binarySearch method
	}
	
	public static int binarySearch(int[] data, int target, int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid = (low+high)/2;	//mid index is hald of low plus high
		
		if(target==data[mid]) {	//checking if the number we are searching is the middle of the array
			return mid;	//if yes, returning the mid index
		}
		if(target>data[mid]) { //checking id the target number is greater to the mid, 
			return binarySearch(data, target, mid+1, high);	//if true, then recursively run the method binarysearch to initialize the lowest/left index to mid+1
		}
		else {	//if target is less than the mid value
			return binarySearch(data, target,low, mid-1 );//if true recursively run the binary search method, and in this case change the last/right index to mid-1
		}
		
		
	}
	
}
