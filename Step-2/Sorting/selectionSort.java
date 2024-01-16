import java.util.Scanner;

public class Sorting {
    public static void selectionSort(int n, int[] arr) //get the min element and swap it
    {

        for(int i=0; i<=n-2; i++)
        {
            int min_index=i;
            for(int j=i; j<=n-1 ; j++)
            {
                if(arr[j]<arr[min_index]) min_index=j;
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;

        }

    }
    public static void main(String[] args)
    {
        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sorting : ");
        for (int x:
             arr) {
            System.out.print(x+" ");
        }

        selectionSort(n,arr);

        System.out.println("\nAfter sorting : ");
        for (int x:
                arr) {
            System.out.print(x+" ");
        }
    }
}
