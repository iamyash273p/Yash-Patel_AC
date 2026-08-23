import java.util.Scanner;

public class Q11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of elements for array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int countP = 0;
        int countN = 0;

        for(int i :arr)
        {
            System.out.print("Enter the Elements: ");
            i = sc.nextInt();
        }
        for(int i : arr)
        {
            if(i > 0)
                countP++;
            else
                countN++;
        }
        System.out.println("Positive No: " + countP);
        System.out.println("Negative No: " + countN);
    }    
}