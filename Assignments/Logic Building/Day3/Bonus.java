import java.util.Scanner;

class Choices
{
    public void grade()
    {
        System.out.println("Enter the Avg Marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks >= 90)
            System.out.println("Grade A");
        else if(marks <= 80 && marks >= 70)
            System.out.println("Grade B");
        else if(marks <= 60 && marks >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Grade D/F");
    }

    public void leapYear()
    {
        System.out.println("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 4 != 0 || year % 400 == 0)
            System.out.println("Leap Year: " + year);
        else
            System.out.println("Not a LeapYear: " + year);
    }
    
    public void dayOfWeek()
    {
        System.out.println("Enter the day: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
    public void identityVariableValues()
    {
        byte a = 0;
        short b = 0;
        int c = 0;
        long d = 0L;
        float e = 0.0f;
        double f = 0.0d;
        char g = '\u0000';
        boolean h = false;
        
        System.out.println("byte: "+ a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: "+ d);
        System.out.println("float: "+ e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }

}

public class Bonus {

    public static void main(String[] args)
    {
        System.out.println("For Grade Enter 1: ");
        System.out.println("For Leap Year Enter 2: ");
        System.out.println("For Day of the week Enter 3: ");
        System.out.println("For Variables Enter 4: ");
        System.out.println("For Exit Enter 5: ");

        Scanner sc = new Scanner(System.in);
        Choices obj = new Choices();

        int choice = sc.nextInt();

        switch(choice){
            
            case 1:
                obj.grade();
                break;
            case 2:
                obj.leapYear();
                break;
            case 3:
                obj.dayOfWeek();
                break;
            case 4:
                obj.identityVariableValues();
                break;
            case 5:
                System.out.println("Exit");
                break;
        }
        System.out.println("Thank You for using me");
    }
}
