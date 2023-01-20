package sorting;
import static sorting.BubbleSort.*;
import static sorting.SelectionSort.*;
import static sorting.InsertionSort.*;
import static sorting.QuickSort.*;
import static sorting.MergeSort.*;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[] arr = {23,45,24,78,99,44};
		int n= arr.length;
		
		BubbleSort.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
		SelectionSort.SelectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
		InsertionSort.InsertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
		quickSort(arr, 0,n-1);
		System.out.println(Arrays.toString(arr));
		
		divide(arr, 0, n-1);
		System.out.println(Arrays.toString(arr));
		

	}

}
