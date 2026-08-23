import java.util.Scanner;

public class Q10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        float sum = 0;

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter Elements: ");
            arr[i] = sc.nextInt();
        }
        for(int i: arr)
        {
            sum = sum + i;
        }
        System.out.println("Average of the Array: " + (sum/n));

    }    
}
