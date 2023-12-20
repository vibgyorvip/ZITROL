import java.util.Scanner;

public class Maths {
    static boolean isArmstrong(int number)
    {
        int original=number;
        int sum=0;
        int count=0;
        int temp=number;
        while(temp >0)
        {
            count++;
            temp=temp/10;
        }

        while(number >0)
        {
            int digits = number%10;
            sum = sum + (int) Math.pow(digits,count);
            number=number/10;
        }
        if(sum == original)
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
        System.out.println(isArmstrong(number));
    }
}
