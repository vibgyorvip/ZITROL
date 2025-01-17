//Find the Majority Element that occurs more than N/2 times

import java.util.*;

class ArrayEx17{

	//Brute-Force O(n^2)
	public static int findMajorityElementOccurs(int[] arr){
			int n = arr.length;

			for(int i=0; i<n; i++){
				int count =0;
				for(int j=0; j<n; j++){
					if(arr[i] == arr[j])
						count++;
				}

				if(count > (n/2))
					return arr[i];
			}

			return -1;
	}


	//Better
	public static int findMajorityElementOccurs(int[] arr){
		int n = arr.length;
		int number = -1;
		int max = -1;

		for(int i=0; i<n; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}

		int[] hash = new int[max+1];

		for(int i=0; i<n; i++){
			hash[arr[i]] +=1;
		}

		for(int i=0; i<hash.length; i++){
			if(hash[i] > n/2)
				number = i;
		}

		return number;
	}

	// Better O(nlogn + n)
	public static int findMajorityElementOccurs(int[] arr){
		int n = arr.length;
		int number = -1;
	

		HashMap<Integer,Integer> map = new HashMap<>();

		for(int i=0; i<n; i++){
			int key =arr[i];
			int value = 0;

			if(map.containsKey(key))
				value = map.get(key);

			value++;

			map.put(key,value);
		}


		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			int key = entry.getKey();
			int freq = entry.getValue();

			if(freq > n/2)
				number = key;
		}

		return number;
	}



	//optimal  O(n)
	public static int findMajorityElementOccurs(int[] arr){
		int n= arr.length;
		int count=0;
		int number=0;

		for(int i=0; i<n; i++){
			if(count == 0){
				count++;
				number = arr[i];
			}else if(number == arr[i]){
				count++;
			}else{
				count--;
			}
		}

		int count1=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == number){
				count1++;
			}
		}

		if(count1 > n/2){
			return number;
		}

		return -1;

	}



	public static void main(String[] args){
		int[] arr = {1,2,3,4,1,1,2,1,2,3,2,1,1,1,1};
		int number = findMajorityElementOccurs(arr);
		System.out.println(number);

	}
}
