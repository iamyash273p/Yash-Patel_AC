import java.util.Scanner;

public class Q2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Multiple of ?: ");
        int num = sc.nextInt();

        System.out.print("No of multiples ?: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n;i++)
        {
            System.out.print(num*i + " ");
        }
        System.out.println("End...");


    }
}
