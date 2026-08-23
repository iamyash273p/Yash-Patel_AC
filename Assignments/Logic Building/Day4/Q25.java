import java.util.Scanner;

public class Q25 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        int count = 0;
        for(int i : str.toCharArray())
        {
            if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
            {
                count = count + 1;
            }
        }
        System.out.println("Count of Vowels in String: " + count);
    }
}
