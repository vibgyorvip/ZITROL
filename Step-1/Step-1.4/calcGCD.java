import java.util.Scanner;

public class Maths {
    static int calcGCD(int number1,int number2)
    {
        while(number1 >0 && number2 >0)
        {
            if(number1>number2)
            {
                number1=number1%number2;
            }
            else
            {
                number2=number2%number1;
            }
        }
        if(number1 == 0)
        {
            return number2;
        }
        else
        {
            return number1;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(calcGCD(15,250));
    }
}
