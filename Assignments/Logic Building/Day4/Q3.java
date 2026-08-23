import java.util.Scanner;

public class Q3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for factorial: ");
        int num = sc.nextInt();
        int sum = 1;

        for(int i = 1; i <= num ;i++)
        {
            sum = sum * i;
        }
        System.out.println("The Factorial of " + num +": " + sum);

    }    
}
