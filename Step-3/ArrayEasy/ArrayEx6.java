//Left Rotate an array by D place
import java.util.*;

class ArrayEx6{

	//Brute force O(n+d)
	public static void leftRotateArrayByDPlace(int[] arr, int d){
		int n = arr.length;
		d = d % n;

		//O(d)
		List<Integer> list = new ArrayList<>();
		//int[] temp = new int[d];
		for(int i=0; i<d; i++){
			list.add(arr[i]);
			//temp[i] = arr[i];
		}

		//shifting O(n-d)
		for(int i=d; i<n; i++){
			arr[i-d]=arr[i];
		}

		//push back from list O(d)
		for(int i=n-d; i<n; i++){
			arr[i]=list.get(i-(n-d));
			//arr[i] = temp[i-(n-d)];
		}
	}

	//Optimal
	public static void leftRotateArrayByDPlace(int[] arr, int d){
		int n = arr.length;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}

	public static void reverse(int[] arr, int i, int j){
		while(i <= j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8};
		int d = 3; //3 places

		leftRotateArrayByDPlace(arr,d);
		System.out.println(Arrays.toString(arr));
	}
}
