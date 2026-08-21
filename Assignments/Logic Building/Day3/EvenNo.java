import java.util.Scanner;

class Even
{
    public void printEvenNumbers(int n)
    {
        int i = 0;
        while(i <= n ){
            if(i % 2 == 0)
            System.out.print(i + ",");
            i++;
        };
    }
}
public class EvenNo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No: ");
        int num = sc.nextInt();

        Even obj = new Even();
        obj.printEvenNumbers(num);
    }
}
