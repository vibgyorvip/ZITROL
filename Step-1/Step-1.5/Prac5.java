import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void reverseArray(int i,int[] arr , int n)
    {
        if(i>=n/2)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(arr,i,n);
        reverseArray(i+1,arr,n);
    }
    public static void swap(int[] arr ,int i , int n)
    {
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
    }
    static void reverseArray1(int arr[], int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray1(arr, start + 1, end - 1);
        }
    }
    public static int[] reverseArrayLoop(int n, int []nums) {
        int left=0;
        int right=n-1;
        while(left <=right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // reverse an array
        reverseArray(0,arr, arr.length);
        //reverseArray1(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
