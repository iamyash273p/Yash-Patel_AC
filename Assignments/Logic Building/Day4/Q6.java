import java.util.Scanner;

public class Q6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element you want in array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the "+ i + " index: ");
            arr[i] = sc.nextInt();
        }
        for(int i : arr)
            System.out.print(i + " ");
        
    }    
}
