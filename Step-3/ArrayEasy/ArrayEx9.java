//Find the Union of two sorted arrays

import java.util.*;

class ArrayEx9{

	//Brute Force O(nlogn)
	public static int[] findUnion(int[] arr1, int[] arr2){
		HashSet<Integer> set = new HashSet<>();

		for(int i=0; i<arr1.length; i++){
			set.add(arr1[i]);
		}

		for(int i=0; i<arr2.length; i++){
			set.add(arr2[i]);
		}

		int[] union = new int[set.size()];
		int i=0;
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			union[i++]=(Integer)itr.next();
		}

		return union;
	}


	//Optimal using 2 pointer approach
	public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2){
		int n1=arr1.length;
		int n2=arr2.length;
		int i =0;
		int j =0;

		ArrayList<Integer> list = new ArrayList<>();

		while(i < n1 && j < n2){
			if(arr1[i] <= arr2[j]){
				if(list.size() == 0 || list.get(list.size()-1) != arr1[i]){
					list.add(arr1[i]);
				}
				i++;
			}else{
				if(list.size() == 0 || list.get(list.size()-1) != arr2[j]){
					list.add(arr2[j]);
				}
				j++;
			}
		}

		while(i<n1){
			if(list.get(list.size()-1) != arr1[i]){
					list.add(arr1[i]);
			}
			i++;
		}

		while(j<n2){
			if(list.get(list.size()-1) != arr2[j]){
				list.add(arr2[j]);
			}
			j++;
		}

		return list;
	}
	

	public static void main(String[] args){
		int[] arr1 = {1,1,2,3,4,5};
		int[] arr2 = {2,3,4,4,5,6,7,8,9};

		// int[] union = findUnion(arr1, arr2);
		// System.out.println(Arrays.toString(union));

		ArrayList<Integer> union = findUnion(arr1, arr2);
		for(int n: union){
			System.out.print(n+" ");
		}
	}
}
