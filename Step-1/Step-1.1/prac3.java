import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3 {
    public  static void main(String[] args) throws IOException {
        InputStreamReader is= new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(is);
        int number = Integer.parseInt(bf.readLine());

        System.out.println("The entered number is : "+ number);
    }
}
