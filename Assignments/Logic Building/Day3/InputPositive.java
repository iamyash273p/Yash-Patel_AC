import java.util.Scanner;

public class InputPositive {

    public static  void askForPositive()
    {
        int num;
        do
        {   
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a No: ");
            num = sc.nextInt();
            
        }while(num <= 0);
        System.out.println("Positive No: " + num);
    }
    public static void main(String[] args)
    {
        askForPositive();
    }
}
