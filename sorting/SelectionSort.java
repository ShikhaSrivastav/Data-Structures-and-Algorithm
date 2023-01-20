//take smallest and put in front
//run a loop and find smallest element
//1 swap per iteration , smallest in front
//arr[0] as smallest
//start loop from i+1 to find smaller element than smallest
//if found one make it smallest-----like this do till last ele of arr
//now swap smallest with first pos
//now for second pass smallest arr[0] and repeat steps

package sorting;

public class SelectionSort {

	public static void SelectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}
}
