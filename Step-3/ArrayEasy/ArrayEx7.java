//Move Zeros to end of an array
import java.util.*;

class ArrayEx7{

	//Brute force O(2n) extra space O(n)
	public static void moveZeroToEndArray(int[] arr, int n){
		List<Integer> list = new ArrayList<>();

		//O(n)
		for(int i=0; i<n; i++){
			if(arr[i] != 0) list.add(arr[i]);
		}

		//O(x)
		for(int i=0; i<list.size(); i++){
			arr[i] = list.get(i);
		}

		//O(n-x)
		for(int i=list.size(); i<n; i++){
			arr[i] = 0;
		}
	}

	//Optimal
	public static void moveZeroToEndArray(int[] arr, int n){
		int j = -1;
		//Identifying the 0th element index = j
		for(int i=0; i<n; i++){
			if(arr[i] == 0){
				j = i;
				break;
			}
		}

		//if no non zero numbers
		if(j == -1) return;

		//
		for(int i=j+1; i<n; i++){
			if(arr[i] != 0){
				swap(arr, i, j);
				j++;
			}
		}

	}

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


	public static void main(String[] args){
		int[] arr = {1,2,3,4,0,5,0,6,0,7};
		int n = arr.length;
		moveZeroToEndArray(arr,n);

		System.out.println(Arrays.toString(arr));


	}
}
