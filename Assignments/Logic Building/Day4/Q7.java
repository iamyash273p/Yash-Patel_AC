import java.util.Scanner;

public class Q7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Elements for Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the " + i +" Index of Array: ");
            arr[i] = sc.nextInt();
        }
        for(int i : arr)
        {
            sum = sum + i;
        }
        System.out.println("The Sum of all no of array: " + sum);

    }    
}
