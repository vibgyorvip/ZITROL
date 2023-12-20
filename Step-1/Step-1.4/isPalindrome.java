import java.util.Scanner;

public class Maths {
    static boolean isPalindrome(int x) {
        int original = x;
        int reverse=0;

        while(x>0)
        {
            int digits = x%10;
            reverse = reverse *10 +digits;
            x=x/10;
        }

        if(reverse == original)
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
        System.out.println(isPalindrome(number));
    }
}
