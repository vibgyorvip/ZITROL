//Check if the array is sorted

class ArrayEx3{

	public static boolean isArraySorted(int[] arr){
		//Asumming the Array in non-decreasing order

		int n = arr.length-1;

		for(int i=1; i<=n; i++){
			if(arr[i-1] <= arr[i]){

			}else{
				return false;
			}
		}
		return true;
	}



	public static void main(String[] args){
		int[] arr = {1,3,7,7,8,9,9};

		if(isArraySorted(arr))
			System.out.println("Array is sorted");
		else
			System.out.println("Array not sorted");
	}
}
