package Day1;
public class CheckTime {
    public static void main(String args[])
    {
        int hour = 11;
        int min = 30;

        if(hour < 12)
            System.out.println("Good Morning: " + hour + ":" + min);
        else
            System.out.println("Good Afternoon: " + hour + ":" + min);
    }
}
