import java.util.Scanner;

class Table
{
    public void multiplication(int n)
    {
        for(int i = 1; i <= 10;i++)
        {
            System.out.println(n + " X " + i + " = " + i*n);
        }
    }
}public class PrintMul {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int num = sc.nextInt();

        Table obj = new Table();
        obj.multiplication(num);
    }
}
