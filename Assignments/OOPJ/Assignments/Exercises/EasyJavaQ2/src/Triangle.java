import java.lang.Math;
public class Triangle {

	private int num1;
	private int num2;
	private int num3;
	
	public int perimeter(int num1, int num2, int num3) {
		return (num1+num2+num3);
	}
	
	public double area(int num1, int num2, int num3) {
		double s = ((num1 + num2 + num3)/2);
		
		return(Math.sqrt(s *(s - num1) * (s - num2) * (s - num3)));
	}
	
	Triangle(int num1, int num2, int num3){
		
		System.out.println("Perimeter: " + perimeter(num1, num2, num3));
		System.out.println("Area: " + area(num1, num2, num3));
	}
	
}
