import java.util.Scanner;

public class Maths {
    
    public static void printAllDivisors(int n){
        for(int i=1; i<=n ;i++)
            {
                if(n%i ==0)
                {
                    System.out.println(i);
                }
            }
    }
    public static void main(String[] args)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        printAllDivisors(number);
    }
}
