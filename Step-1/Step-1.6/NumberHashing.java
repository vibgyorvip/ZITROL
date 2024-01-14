import java.util.Arrays;
import java.util.Scanner;

public class Hashing {

    public static int[] countFrequency(int n, int x, int []nums){
        int[] hash=new int[x+1];
        for(int i=0;i<n;i++)
        {
            hash[nums[i]]+=1;
        }
        return hash;
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the elements of Array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array : "+ Arrays.toString(arr));

        int[] frequencyArray = countFrequency(n,12,arr);

//        //Pre-compute
//        int[] hash = new int[13];
//        for(int i=0; i<n ; i++)
//        {
//            hash[arr[i]] +=1;
//        }

        //Fetching
        System.out.println("How many times you want to find frequency");
        int q=sc.nextInt();

        while(q-- !=0)
        {
            System.out.println("Enter the number to count frequency");
            int index = sc.nextInt();
            //System.out.println(hash[index]);
            System.out.println(frequencyArray[index]);
        }


    }
}
