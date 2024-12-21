import java.util.*;

class Sorting{
  
	public static void merge(int[] arr,int low, int mid, int high){
		ArrayList<Integer> temp = new ArrayList<>();

		int left=low;
		int right=mid+1;

		while(left<=mid && right<=high){
			if(arr[left] <= arr[right]){
				temp.add(arr[left]);
				left++;
			}else{
				temp.add(arr[right]);
				right++;
			}
		}


		while(left<=mid){
			temp.add(arr[left]);
			left++;
		}


		while(right<=high){
			temp.add(arr[right]);
			right++;
		}


		for(int i=low; i<=high; i++){
			arr[i]=temp.get(i-low);
		}

	}

	public static void mergeSort(int[] arr, int low, int high){
		//Base Condition
		if(low == high) return;

		//Divide
		int mid = (low + high)/2;

		//Conqure
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);

		//Combine ==> Merge Algo.
		merge(arr,low,mid,high);

	}

	

public static void main(String [] args){
		int[] arr = {5,8,7,2,9,6,4,1};

		//Merge Sort
		int[] arr3 = {3,2,4,1,6,7,3,9,5};
		mergeSort(arr3,0,arr.length);
		System.out.println(Arrays.toString(arr3));
}
