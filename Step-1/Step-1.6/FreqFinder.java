import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Find the highest/lowest frequency element
public class FreqFinder {
    public static void main(String[] args)
    {
        //creating an array
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //Creating HashMap object to store the array's element as key and value as frequency
        HashMap<Integer,Integer> m= new HashMap<>();
        for (int x: arr) {
            int key=x;
            int freq=0;
            if(m.containsKey(key)) freq=m.get(key);
            freq++;
            m.put(key,freq);
        }

        //finding highest and lowest freq element
        int highest_freq=Integer.MIN_VALUE;
        int lowest_freq=Integer.MAX_VALUE;
        int highest_freq_element=-1;
        int lowest_freq_element=-1;

        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            int element=entry.getKey();
            int frequency=entry.getValue();

            if(frequency > highest_freq)
            {
                highest_freq=frequency;
                highest_freq_element=element;
            }
            if(frequency < lowest_freq)
            {
                lowest_freq=frequency;
                lowest_freq_element=element;
            }
        }
        System.out.println("Highest frequency element: " + highest_freq_element +
                " with frequency: " + highest_freq);
        System.out.println("Lowest frequency element: " + lowest_freq_element+
                " with frequency: " + lowest_freq);
    }
}

