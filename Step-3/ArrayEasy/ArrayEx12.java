//Maximum Consecutive Ones

class ArrayEx12{

	//optimal
	public static int countMaxConsecutiveOnes(int[] arr){
		int n= arr.length;
		int max =0;
		int count =0;

		for(int i=0; i<n; i++){
			if(arr[i] == 1){
				count++;
			}else{
				count = 0;
			}

			if(count > max) max=count;
		}

		return max;
	}

	public static void main(String[] args){
		int[] arr = {1,1,1,0,1,1,0,1,1,1,1,0,1,1};
		int number = countMaxConsecutiveOnes(arr);

		System.out.println("Maximum consecutive ones : " + number);
	}
}
