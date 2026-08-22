import java.util.Scanner;
class Sum
{
    public void calculateSum(int n)
    {
        int sum = 0;
        for(int i = 0; i<=n;i++)
        {
            sum = sum + i;
        }
        System.out.println("The Sum of N: " + sum);
    }
}

public class SumOfN {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        Sum obj = new Sum();
        obj.calculateSum(num);

    }
}
