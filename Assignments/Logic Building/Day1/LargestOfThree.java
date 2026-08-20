package Day1;
public class LargestOfThree{
    public static void main(String args[])
    {
        int a = 1;
        int b = 2;
        int c = 3;

        if(a > b && a > c)
            System.out.println(a + ": a is the largest");
        else if(b > c && b > a)
            System.out.println(b + ": b is the largest");
        else
            System.out.println(c + ": c is the largest");
    }
}