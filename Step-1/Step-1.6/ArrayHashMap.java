import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayHashMap {
    public static void main(String[] s)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        //compute
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0; i<n ; i++)
        {
            int key=arr[i];
            int freq=0;
            if(h.containsKey(key)) freq=h.get(key);
            freq++;
            h.put(key,freq);
        }

        //fetch
        System.out.println("how many times you want to find freq of integer");
        int q=sc.nextInt();
        while(q-- !=0)
        {
            System.out.println("Enter the number to find freq");
            int num=sc.nextInt();
            if(h.containsKey(num)) System.out.println(h.get(num));
            else System.out.println(0);
        }
    }
}
