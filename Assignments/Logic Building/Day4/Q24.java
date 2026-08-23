import java.util.Scanner;

public class Q24 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        StringBuilder reverse = new StringBuilder(str).reverse();

        System.out.println(reverse);

    }    
}
