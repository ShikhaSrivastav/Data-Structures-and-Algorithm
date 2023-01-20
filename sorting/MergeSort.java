//divide and conquer
//divide structure till unit
//then conquer (sort) solve smaller part
//while merging we sort(compare)
//take new array ...merge the array there and sort
//then add them to original array(takes extra memory)
//



package sorting;
//nlogn
public class MergeSort {
	//O(n)
	public static void conquer(int arr[],int si,int mid,int ei) {
		int merged[] = new int[ei-si+1];
		
		int idx1=si;//array1
		int idx2 = mid+1;//array 2
		int x=0;
		
		while(idx1<=mid && idx2 <=ei) {
			if(arr[idx1] <=arr[idx2]) {
				merged[x++]=arr[idx1++];
//				x++;
//				idx1++;
				
			}
			else {
				merged[x++]=arr[idx2++];
//				x++;
//				idx2++;
			}
		}
		while(idx1 <=mid) {
			merged[x++]=arr[idx1++];
		}
		while(idx2 <=ei) {
			merged[x++]=arr[idx2++];
//			x++;
//			idx2++;
		}
		//copying in original array
		for(int i=0,j=si;i<merged.length;i++,j++) {
			arr[j]=merged[i];
		}
		
	}
	//O(logn)
	public static void divide(int[] arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2; //(si+ei)/2
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conquer(arr,si,mid,ei);
		
	}

}
