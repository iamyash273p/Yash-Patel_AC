
public class Rectangle {

	private int l;
	private int b;
	
	Rectangle(int l, int b){
		System.out.println("Area: " + area(l, b));
	}
	
	public int area(int l, int b) {
		return(l*b);
	}
	
}
