import java.util.Scanner;

public class patterns {
    public static void print2(int number)
    {
        for(int index1=0; index1<number ; index1++)
        {
            for(int index2=0; index2<=index1 ; index2++)
            {
                System.out.print("* ");
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
            print2(number1);
        }
    }
}
