import java.util.Scanner;

public class Q9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of elements for array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int largest = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter Elements: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ;i++)
        {
            if(arr[0] > arr[i])
                    largest = 0;

                else{
                    largest = i;
                }
        }
        System.out.println(arr[largest]);

    }    
}
