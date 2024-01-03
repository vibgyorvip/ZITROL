import java.util.Scanner;

public class Recursion {
    static int count =0;
    static void printNumbers()
    {
        if(count == 3) return;

        System.out.println(count);
        count++;
        printNumbers();
    }

     static void printNumbers1(int n)
    {
        if(n <= 0) return;

        printNumbers1(n-1); //non-tail recursion
        System.out.println(n);

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printNumbers();
        printNumbers1(n);
    }
}
