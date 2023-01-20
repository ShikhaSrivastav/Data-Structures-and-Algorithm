//pivot and partition
//pivot--central point around which things revolve
//choosing pivot--1>random 2>median 3>1st ele 4>last ele
//place pivot at right pos
//to the left of pivot all ele shpuld be smaller than it
//to the right of pivot all ele should be greater then it
//then do the partioning and call quuick sort recursively
//low--1st ele 
//high--last ele
//i--work is to make place for ele which are smaller than pivot
//i=low-1(in starting)
//compare ele with pivot
//if less than pivot then swap 
//if greater dont do anything
//i++
//low should be less than high

package sorting;

public class QuickSort {
	
	public static int partition(int[] arr, int low, int high) {
		int pivot =arr[high];
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		//pivot to correct pos;
		//swap with pivot
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i; //pivot index
	}
	public static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int pidx=partition(arr,low,high);
			quickSort(arr,low,pidx-1);
			quickSort(arr,pidx+1,high);
		}
		
	}

}


//Time complexity
//worst case occurs when pivot is always the smallest or the largest ele
//worst case--O(n2)
//when we get a sorted array that time the time complexity comes worst case
//as we go on partioning the array n times and run 1 loop on each level
//which gives worst time complexity
