import java.util.Scanner;

public class Q5 {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the number for sum of odd no: ");
       int num = sc.nextInt();
       int sum = 0;
       for(int i = 1; i <= num ;i++)
       {
            if(i % 2 != 0)
            {
                sum = sum + i;
            }
       }
       System.out.println("Sum of odd numbers " + "From 1 to " + num + ": " + sum );
    }
}
