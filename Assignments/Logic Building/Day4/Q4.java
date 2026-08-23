import java.util.Scanner;

public class Q4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++)
        {
            if(i % 2 == 0)
                System.out.print(i+ " ");
        }

    }    
}
