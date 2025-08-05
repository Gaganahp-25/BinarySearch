package sample;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
	
	    int[] numbers = {10, 20, 30, 40, 50, 60};
		int key = 40;

	    Arrays.sort(numbers);
        int result = binarySearch(numbers, key);

		if (result == -1) {
		     System.out.println("Element not found.");
		} 
		else {
		     System.out.println("Element found at index: " + result);
		}
	}
    
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
		     int mid = (low + high) / 2;

		     if (arr[mid] == key) {
		         return mid;  
		     } 
		     else if (arr[mid] < key) {
		         low = mid + 1;  
		     } 
		     else {
		         high = mid - 1; 
		     }
		 }

		 return -1;  
		    
	}
}


