import java.util.Scanner;

public class patterns {
    public static void print8(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            //stars
            for(int k=1;k<2*i;k++)
            {
                System.out.print("*");
            }
            //spaces
            for(int l=1;l<=n-i;l++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int number,number1;
        Scanner scanner = new Scanner(System.in);
        number=scanner.nextInt();

        for(int i=0; i<number ; i++)
        {
            number1=scanner.nextInt();
            print8(number1);
        }
    }
}
