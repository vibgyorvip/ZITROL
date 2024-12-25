//Find the number that appears once, and other numbers twice.
import java.util.*;

class ArrayEx13{

	//Brute Force T.C.= O(n^2) S.C.=O(1)
	public static int getSingleElement(int[] arr){
		int n = arr.length;

		for(int i=0; i<n; i++){
			int number = arr[i];
			int count = 0;

			for(int j=0; j<n; j++){
				if(arr[j] == number){
					count++;
				}
			}

			if(count == 1){
				return number;
			}
		}

		return -1;
	}


	//Better O(n) T.C.= O(n) S.C.=O(n)
	public static int getSingleElement(int[] arr){
		int n = arr.length;

		int max=arr[0];

		for(int i=0; i<n; i++){
			// max = Math.max(arr[i],max);
			if(arr[i] > max) max = arr[i];
		}

		int[] hash = new int[max+1];
		for(int i=0; i<n; i++){
			hash[arr[i]] += 1; 
		}

		for (int i=0; i<hash.length; i++) {
			if(hash[i] == 1){
				return i;
			}
		}
		return -1;
	}


	//Better :  Hashing using HashMap T.C.= O(nlogn+n) S.C.=O(n)
	public static int getSingleElement(int[] arr){
		int n = arr.length;

		HashMap<Integer,Integer> map = new HashMap<>();

		for (int i=0; i<n; i++) {
			int key = arr[i];
			int value = 0;

			if(map.containsKey(key)) value=map.get(key);
			value++;

			map.put(key,value);
		}


		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();

			if(value == 1){
				return key;
			}
		}

		return -1;
	}

	//Optimal
	public static int getSingleElement(int[] arr){
		int n = arr.length;

		int xor=0;
		for(int i=0; i<n; i++){
			xor = xor^arr[i];
		}
		return xor;
	}


	public static void main(String[] args){
		int[] arr = {1,1,2,2,3,4,4,5,5};

		int number = getSingleElement(arr);
		System.out.println("the number that appears once "+ number);
	}
}
