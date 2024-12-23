//Remove duplicates from Sorted array
import java.util.*;

class ArrayEx4{
	//Brute force O(nlogn + n)
	public static int removeDuplicateSortedArray(int[] arr){
		int n = arr.length-1;
		int idx=0;
		HashSet<Integer> set = new HashSet<>();
		//O(nlogn) //inserting an element into set = logn ==> n element = nlogn
		for(int i=0; i<=n; i++){
			set.add(arr[i]);
		}
		System.out.println(set);

		//O(n)
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			arr[idx++]=(Integer)itr.next();
		}

		return idx;
	}


	//Optimal O(n) 2-pointer approach
	public static int removeDuplicateSortedArray(int[] arr){
		int n = arr.length-1;
		int i=0;

		for(int j=1; j<=n; j++){
			if(arr[i] != arr[j]){
				arr[++i] = arr[j];
			}
		}

		return i+1;
	}




	public static void main(String[] args){
		int[] arr = {1,2,2,3,3,3,4,4,4,4};
		int newSize = removeDuplicateSortedArray(arr);

		for(int i=0; i<newSize; i++){
			System.out.print(arr[i]+"  ");
		}
	}
}
