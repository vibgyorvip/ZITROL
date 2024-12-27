//Longest subarray with given sum K(positives)

class ArrayEx14{

	//Brute force O(n^3)
	public static int longestSubArraySum(int[] arr, int k){
		int n =arr.length;
		int length=0;

		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				int sum =0;
				for (int l=i; l<=j; l++) {
					sum += arr[l];
				}
				if(sum == k){
					if(j-i+1 > length) length = j-1+1;
				}
			}
		}

		return length;
	}


	//Brute force O(n^2)
	public static int longestSubArraySum(int[] arr, int k){
		int n =arr.length;
		int length=0;

		for(int i=0; i<n; i++){
			int sum =0;
			for(int j=i; j<n; j++){
				sum = sum + arr[j];
				
				if(sum == k){
					if(j-i+1 > length) length = j-1+1;
				}
			}
		}

		return length;
	}


	//Better O(n) but s.c. also O(n)
	public static int longestSubArraySum(int[] arr, int k){
		int n =arr.length;
		int maxLen=0;
		int prefixSum=0;

		HashMap<Integer,Integer> map = new HashMap<>();

		for(int i=0; i<n; i++){
			prefixSum = prefixSum + arr[i];

			if(prefixSum == k){
				maxLen = Math.max(maxLen, i+1);
			}

			if(map.containsKey(prefixSum-k)){
				maxLen = Math.max(maxLen, i - map.get(prefixSum-k));
			}

			if(!map.containsKey(prefixSum)){
				map.put(prefixSum,i);
			}
		}

		return maxLen;
	}


	//Optimal O(n)
	public static int longestSubArraySum(int[] arr, int k){
		int n =arr.length;
		int left=0;
		int right=0;
		int maxLen=0;
		int prefixSum=arr[0];

		while(right < n){

			while(left <= right && prefixSum > k){
				prefixSum -= arr[left];
				left++;
			}
			if(prefixSum == k){
				maxLen = Math.max(maxLen, right-left+1);
			}

			right++;
			if(right < n){
				prefixSum += arr[right];
			}
		}

		return maxLen;
	}


	public static void main(String[] args){
		int[] arr = {1,2,1,1,1,1,3,1,2,1,3};
		//int k =3;
		int[] a = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

		int sum = longestSubArraySum(a, k);
		System.out.println("Longest subarray sum : "+ sum);
	}
}
