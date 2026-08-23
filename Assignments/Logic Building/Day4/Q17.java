import java.util.Scanner;

public class Q17 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n;i=i+2)
        {
            for(int j = 1; j <= i; j = j+2)
            {
                System.out.print(j);
                if(j < i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }  
}
