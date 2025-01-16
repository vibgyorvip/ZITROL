//Sort an array of 0's 1's and 2's

import  java.util.*;

class ArrayEx16{

	//Brute Force O(2N)
	public static void sort(int[] arr){
		int n = arr.length;
		int count0 =0;
		int count1 =0;
		int count2 =0;

		for(int i=0; i<n; i++){
			if(arr[i] == 0) count0++;
			else if(arr[i] == 1) count1++;
			else count2++;
		}

		for(int i=0; i<count0; i++){
			arr[i] =0;
		}

		for(int i=count0; i<count0+count1; i++){
			arr[i] =1;
		}

		for(int i=count0+count1; i<n; i++){
			arr[i] =2;
		}
	}

	//Dutch National Flag Algo
	public static void sort(int[] arr){
		int n = arr.length;
		int low = 0;
		int mid = 0;
		int high = n-1;

		while(mid < high){
			if(arr[mid] == 0){
				//swap(arr[low], arr[mid]);
				int temp =arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;

				low++;
				mid++;
			}else if(arr[mid] == 1){
				mid++;
			}else{
				//swap(arr[mid], arr[high]);
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;

				high--;
			}
		}
	}

	public static void main(String[] args){
		int[] arr = {0,1,2,0,0,1,2,2,1,0,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
