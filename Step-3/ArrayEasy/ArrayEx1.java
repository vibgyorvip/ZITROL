//Largest Element in an Array
import java.util.*;

class ArrayEx1{

	//Brute force O(n) Optimized only
	public static int findLargestElementArray(int[] arr){

		//handle the case when the array is empty
		if(arr == null || arr.length == 0){
			throw new IllegalArgumentException("Array can not be empty !!");
		}

		int max=arr[0];
		for(int number : arr){
			if(number > max){
				max = number;
			}
		}

		return max;
	}

	//Sorting the Array (Used when Sorting is essential) O(nlogn) using QS
	public static int findLargestElementArray(int[] arr){
		int max=0;
		Arrays.sort(arr);
		max=arr[arr.length-1];

		return max;
	}

	//Using Collections.max() (Used with ArrayList)
	public static int findLargestElementArray(int[] arr){
		int max=0;

		List<Integer> list = new ArrayList<>();
		for(int number : arr){
			list.add(number);
		}

		max = Collections.max(list);

		return max;
	}

	//Using Java8 Stream O(n)
	public static int findLargestElementArray(int[] arr){
		int max=0;

		max = Arrays.stream(arr).max().getAsInt();

		return max;
	}



	public static void main(String[] args){
		int[] arr = {12,34,13,89,67,90,34,67};
		System.out.println("Array :"+ Arrays.toString(arr));
		System.out.println("Largest element in Array : "+findLargestElementArray(arr));
	}
}
