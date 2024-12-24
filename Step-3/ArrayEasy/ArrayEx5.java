//Left Rotate an array by one place
import java.util.*;

class ArrayEx5{

	public static void leftRotateByOnePlace(int[] arr){
		int n = arr.length-1;

		//copying 1st element into temp[]
		int temp = arr[0];

		//shifting
		for(int i=1; i<=n; i++){
			arr[i-1] = arr[i];
		}

		//pushing back element from temp
		arr[n]=temp;
	}




	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};

		leftRotateByOnePlace(arr);
		System.out.println(Arrays.toString(arr));
	}
}
