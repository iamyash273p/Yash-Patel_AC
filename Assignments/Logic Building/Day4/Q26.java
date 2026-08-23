import java.util.Scanner;

public class Q26 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        StringBuilder reverse = new StringBuilder(str).reverse();

        if(reverse.toString().equals(str))
        {
            System.out.println("Palindrome Yayy");
        }
        else
            System.out.println("Not a Palindrome Sad...");
    }
}
