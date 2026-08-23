import java.util.Scanner;
import java.util.Arrays;

public class Q14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Elements: ");
        int n = sc.nextInt();

        Integer arr[] = new Integer[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter Elements: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter No to search: ");
        int search = sc.nextInt();

        int index = Arrays.binarySearch(arr, search);
        System.out.println("Index of "+ search + " : " + index);
    }    
}
