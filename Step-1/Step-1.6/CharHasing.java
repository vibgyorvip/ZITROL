import java.util.Scanner;

public class CharHasing {

    public static int[] countFrequencyLower(int n,String s,int size)
    {
        int[] hash = new int[26];

        for(int i=0; i<n; i++)
        {
            hash[s.charAt(i)-'a'] +=1;
        }
        return hash;

    }
    public static int[] countFrequencyUpper(int n,String s,int size)
    {
        int[] hash = new int[26];

        for(int i=0; i<n; i++)
        {
            hash[s.charAt(i)-'A'] +=1;
        }
        return hash;

    }
    public static int[] countFrequencyLowerUpperBoth(int n,String s,int size)
    {
        int[] hash = new int[256];

        for(int i=0; i<n; i++)
        {
            hash[s.charAt(i)] +=1;
        }
        return hash;

    }
    public static void main(String[] args)
    {
        System.out.print("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //if all are lower case
        int[] hash= countFrequencyLower(s.length(),s,26);

        //fetch
        System.out.println("how many times you want to count freq");
        int q = sc.nextInt();
        while (q-- !=0)
        {
            System.out.println("enter the char");
            char ch=sc.next().charAt(0);
            System.out.println(hash[ch-'a']);

        }


    }
}
