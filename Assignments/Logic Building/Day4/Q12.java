import java.util.Scanner;
import java.util.Arrays;

public class Q12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No for array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n; i++)
        {
            System.out.print("Enter elements: ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
