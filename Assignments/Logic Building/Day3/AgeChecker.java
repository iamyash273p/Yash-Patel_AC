import java.util.Scanner;

class Age
{
    public void checkAgeCatgory(int age)
    {
        if(age < 18)
            System.out.println("You are a minor");
        else if(age >= 18 && age < 60)
            System.out.println("You are an adult");
        else if(age > 60)
            System.out.println("Yout are a Senior Citizen");
    }
}

public class AgeChecker {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        Age obj = new Age();
        obj.checkAgeCatgory(age);

        sc.close();
    }
}
