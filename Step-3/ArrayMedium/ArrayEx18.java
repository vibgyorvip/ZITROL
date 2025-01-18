//Kadane's Algorithm, maximum subarray sum

class ArrayEx18{

	//Brute Force O(n^3)
	public static int findMaxSubarraySum(int[] arr){
		int n= arr.length;
		int max = Integer.MIN_VALUE;

		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				int sum=0;
				for(int k=i; k<j; k++){
					sum += arr[k];
				}
			
				if(sum > max) max = sum;
			}

		}

		return max;
	}


	//Better O(n^2)
	public static int findMaxSubarraySum(int[] arr){
		int n= arr.length;
		int max = Integer.MIN_VALUE;

		for(int i=0; i<n; i++){
			int sum =0;
			for(int j=i; j<n; j++){
				sum += arr[j];

				if(sum > max) max = sum;
			}

		}

		return max;
	}


	//Optimal
	//Kadane's Algo
	public static int findMaxSubarraySum(int[] arr){
		int n = arr.length;
		int sum =0;
		int max = Integer.MIN_VALUE;

		int start = -1;
		int ansStart = -1;
		int ansEnd = -1;

		for(int i=0; i<n; i++){

				if(sum == 0)
					start = i;

				sum += arr[i];

				if(sum > max){
					max = sum;
					ansStart = start;
					ansEnd = i;
				}

				if(sum < 0)
					sum = 0;
		}


		//Printing the maximum subArray sum
		for(int j=ansStart; j<=ansEnd; j++){
			System.out.print(arr[j] + " ");
		}

		return max;
	}


	public static void main(String[] args){
		int[] arr={-2,-3,4,-1,-2,1,5,-3};
		int max = findMaxSubarraySum(arr);
		System.out.println("max "+max);
	}
}
