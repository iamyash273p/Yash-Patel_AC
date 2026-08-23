import java.util.Scanner;

public class Q8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of name you want to enter: ");
        int n = sc.nextInt();

        String arr[] = new String[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the " + i + " name: ");
            arr[i] = sc.next();
        }
        for(String i : arr)
        {
            System.out.print(i+ " ");
        }

    }
}
