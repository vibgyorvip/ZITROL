import java.util.Scanner;

public class Maths {
   
    public static int sumOfAllDivisors(int n){
        int sum=0;
        for(int j=1; j<=n ;j++)
        {
            for(int i=1; i<=j ;i++)
            {
                if(j%i ==0)
                {
                    sum = sum + i;
                }
            }
        }
        return sum;
    }

   
    public static void main(String[] args)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println(sumOfAllDivisors(number));
    }
}
