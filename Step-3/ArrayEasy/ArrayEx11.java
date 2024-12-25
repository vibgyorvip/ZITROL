//Find missing number in an array

class ArrayEx11{

	//Brute Force O(n^2)
	public static int findMissingNumber(int[] arr,int N){
		int n = arr.length;

		for(int i=1; i<=N; i++){
			int flag=0;
			for(int j=0; j<n; j++){
				if(arr[j] == i){
					flag = 1;
					break;
				}
			}

			if(flag == 0){
				return i;
			}
		}

		return -1;
	}

	//Better O(N) but space O(N)
	public static int findMissingNumber(int[] arr,int N){
		int n = arr.length;

		int[] hash = new int[N+1];
		for(int i=0; i<n; i++){
			hash[arr[i]] = 1;
		}

		for(int i=1; i<=hash.length; i++){
			if(hash[i] == 0){
				return i;
			}
		}

		return -1;
	}

	//Optimal O(n)
	public static int findMissingNumber(int[] arr,int N){
		int n = arr.length;

		int xor1 =0;
		int xor2 =0;

		for(int i=0; i<n; i++){
			xor2 = xor2 ^ arr[i];
			xor1 = xor1 ^ (i+1);
		}

		xor1 = xor1 ^ N;
		return xor1 ^ xor2;


	}

	public static void main(String[] args){
		int[] arr = {1,2,4,5};
		int N = 5;

		int number = findMissingNumber(arr, N);
		System.out.println("Missing Number : "+ number);
	}
}
