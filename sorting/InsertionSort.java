//sorted and unsorted part
//take an ele from unsorted part and put in sorted part at right pos
//in starting take arr[0] as sorted part and rest unsorted
//start the loop on rest ele then unsorted part
// put ele in sorted array at right pos
//we do this by comparing and pushing element of sorted arr

package sorting;

public class InsertionSort {
	public static void InsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int current =arr[i];
			int j =i-1;
			//j is used to iterate over sorted part and make place
			while(j>=0 && current<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
	}

}
