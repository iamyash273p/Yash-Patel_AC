import java.util.Scanner;
import java.util.Arrays;

public class Q13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of Elements for array: ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];

        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("Enter the Elements: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the No You want to Search: ");
        int search = sc.nextInt();

        for(int i : arr)
            System.out.print(i+ " ");

        if(Arrays.asList(arr).contains((int)(search)))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
