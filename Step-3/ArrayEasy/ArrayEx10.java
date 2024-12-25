//Find the Intersection of two sorted arrays

import java.util.*;

class ArrayEx10{

	//Burte Force T.C.=O(n^2) S.C.=O(n)
	public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2){
		int n1=arr1.length;
		int n2=arr2.length;

		int[] visited = new int[n2];
		ArrayList<Integer> answer = new ArrayList<Integer>();

		//i pointing to the arr1 index
		for(int i=0; i<n1; i++){
			for(int j=0; j<n2; j++){
				if(arr1[i] == arr2[j]  && visited[j] == 0){
					answer.add(arr2[j]);
					visited[j] =1;
					break;
				}

				if(arr2[j] > arr1[i])
					break;
			}
		}

		return answer;
	}

	//Optimal O(n)
	public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2){
		int n1 = arr1.length;
		int n2 = arr2.length;

		int i=0;
		int j=0;

		ArrayList<Integer> answer = new ArrayList<>();

		while(i<n1 && j<n2){
			if(arr1[i] < arr2[j]){
				i++;
			}else if(arr1[i] > arr2[j]){
				j++;
			}else{
				answer.add(arr1[i]);
				i++;
				j++;
			}
		}

		return answer;
	}


	public static void main(String[] args){
		int[] arr1 = {1,2,2,3,3,4,5,6};
		int[] arr2 = {2,3,3,5,6,6,7};

		ArrayList<Integer> list = findIntersection(arr1, arr2);
		for(int number: list){
			System.out.print(number+"  ");
		}
	}
}
