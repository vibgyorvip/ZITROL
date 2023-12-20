import java.util.Scanner;

public class Maths {
  static int reverseInteger(int number)
    {
        int n=number;
        int reverse=0;
        while(n != 0)
        {
            int digits = n%10;
            reverse = reverse *10 +digits;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("The reverse of the number "+number+" is " + reverseInteger(number));
    }
}
