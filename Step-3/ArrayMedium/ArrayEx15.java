//2Sum Problem
import java.util.*;

class ArrayEx15{

	//Brute force O(n^2)
	public static ArrayList<Integer> find2Sum(int[] arr, int target){
		int n=arr.length;
		ArrayList<Integer> indexes = new ArrayList<>();

		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(arr[i]+arr[j] == target){
					indexes.add(i);
					indexes.add(j);
				}
			}
		}

		return indexes;
	}

	// Hashing Unsing Map O(nlogn)
	public static ArrayList<Integer> find2Sum(int[] arr, int target){
		int n = arr.length;
		ArrayList<Integer> indexes = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();

		for(int i=0; i<n; i++){
			int key = arr[i];
			int value = i;

			if(map.containsKey(target - key)){
				indexes.add(map.get(target-key));
				indexes.add(i);
			}

			map.put(key,value);
		}

		return indexes;
	}


	//Greedy approach 2 pointer O(n)
	public static String find2Sum2Pointer(int[] arr, int target){
		int n = arr.length;
		Arrays.sort(arr);
		//ArrayList<Integer> indexes = new ArrayList<>();
		int left =0;
		int right = n-1;

		while(left < right){
			if(arr[left] + arr[right] < target){
				left++;
			}else if(arr[left] + arr[right] > target){
				right--;
			}else{
				return "YES";
			}
		}

		return "NO";
	}



	public static void main(String[] args){
		int[] arr = {2,6,5,8,11};
		int target = 14;

		ArrayList<Integer> indexes = find2Sum(arr,target);
		System.out.println("Element indexes : "+ indexes);


		String str = find2Sum2Pointer(arr,target);
		System.out.println(str);
	}
}
