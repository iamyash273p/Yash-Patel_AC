import java.util.Scanner;

class Sum
{
    public int TwoSum(int a, int b)
    {
        return a+b;
    }
    public int TwoSub(int a,int b)
    {
        return a-b;
    }
}
public class SumOfTwo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();

        Sum obj = new Sum();
        System.out.println(obj.TwoSum(n1, n2));
        System.out.println(obj.TwoSub(n1, n2));

    }
}
