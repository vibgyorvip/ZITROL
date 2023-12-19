import java.util.Scanner;

public class Maths {
    static int countDigits(int number)
    {
        int count=0;
        int temp=number;
        while(temp != 0)
        {
            temp=temp/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("Number of digits in "+number+" is "+countDigits(number));
    }
}
