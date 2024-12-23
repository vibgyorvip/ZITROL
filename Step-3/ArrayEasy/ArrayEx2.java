//Second Largest Element in an Array without sorting
import java.util.*;

class ArrayEx2{


	//using sorting O(nlogn) Brute force
	public static int findSecondLargest(int[] arr){

		int n = arr.length;

		Arrays.sort(arr);

		//Largest Elmenet
		int largest = arr[n-1];

		//Second Largest Element

		int secondLargest=0;
		for(int i=n-2; i>=0; i--){
			if(arr[i] != largest){
				secondLargest=arr[i];
				break;
			} 
		}
		return secondLargest;

	}

	//Better solution
	//2 passes needed ==> 1st pass for largest element + 2nd pass for second largest element =>O(n+n)=>O(2n)
	public static int findSecondLargest(int[] arr){
		int n = arr.length;

		//finding largest
		int largest = arr[0];
		for(int i=0; i<=n-1; i++){
			if(arr[i] > largest) largest = arr[i];
		}

		//second largest
		int secondLargest = -1;
		for(int i=0; i<=n-1; i++){
			if(arr[i] > secondLargest && arr[i] != largest) secondLargest = arr[i];
		}

		return secondLargest;
	}


	//Optimal
	public static int findSecondLargest(int[] arr){
		int largest = arr[0];
		int secondLargest =-1;

		for(int i=0; i<=arr.length-1; i++){
			if(arr[i] > largest ){
				secondLargest = largest;
				largest = arr[i];
			}else if (arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}


	public static void main(String[] args){

		int[] arr = {12, 35, 1, 10, 34, 1};
		
		int secondLargest = findSecondLargest(arr);
		System.out.println("Second Largest Element in the Array : "+secondLargest);

	}
}
