import java.util.Scanner;

public class Recursion {

    //Sum of first N Natural Numbers Parameterized way
    static void sumOfNaturalNumbers(int n,int sum)
    {
        if(n ==0)
        {
            System.out.println(sum);
            return;
        }

        sum=sum+n;
        sumOfNaturalNumbers(n-1,sum);
    }

  ////Sum of first N Natural Numbers funcational way
    static int sumOfNaturalNumbers_functional(int n)
    {
        if(n ==0) return 0;

        return n + sumOfNaturalNumbers_functional(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        sumOfNaturalNumbers(n,sum);
        System.out.println(sumOfNaturalNumbers_functional(n));
    }
}
