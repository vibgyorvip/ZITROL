import java.util.Scanner;

public class Maths {
  static boolean isPrime(int number)
    {
        int count=0;
        for(int i=1; i*i<=number ; i++)
        {
            if(number%i == 0)
            {
                count++;
                if(number/i != i)
                {
                    count++;
                }
            }
        }
        if(count == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println(isPrime(number));
    }
}
