import java.util.*;

class Sorting{

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int[] arr, int low, int high){
		int i=low;
		int j=high;
		int pivot = arr[low];

		while(i<j){

			while(arr[i] <= pivot && i<=high-1){
				i++;
			}

			while(arr[j] > pivot && j >= low+1){
				j--;
			}
			if(i<j)
				swap(arr, i, j);

		}
		swap(arr, low, j);
		return j;
	}


	public static void quickSort(int[] arr, int low, int high){
		if(low<high){
			int pivotIndex = partition(arr, low, high);

			quickSort(arr, low, pivotIndex-1);
			quickSort(arr, pivotIndex+1, high);
		}
	}
	public static void main(String [] args){
		int[] arr = {5,8,7,2,9,6,4,1};
    
		//Quick Sort
		int[] arr4 = {2,4,1,3,5,6,8,2};
		quickSort(arr4,0,arr.length-1);
		System.out.println(Arrays.toString(arr4));
	}

}
