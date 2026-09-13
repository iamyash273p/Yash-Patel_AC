import java.io.Console;

public class Complex {

	private int real;
	private int imag;
	
	Complex(int real, int imag){
		
		this.real = real;
		this.imag = imag;
	}
	
	public Complex add(Complex c) {
		
		Complex result = new Complex(0, 0);
		 
		result.real = this.real + c.real;
		result.imag = this.imag + c.imag;
		
		return result;
		
	}
	
	public Complex sub(Complex c) {
		
		Complex result = new Complex(0, 0);
		 
		result.real = this.real - c.real;
		result.imag = this.imag - c.imag;
		
		return result;
		
	}
	
	public Complex mul(Complex c) {
		
		Complex result = new Complex(0, 0);
		 
		result.real = this.real * c.real;
		result.imag = this.imag * c.imag;
		
		return result;
	}
	
	public void display() {
		System.out.println(this.real + " + " + this.imag + "i");
	}
	
	public static void main(String[] args) {
		
		int real;
		
		int imag;
		
		System.out.print("Enter the Value of Real: ");
		real = ConsoleInput.getInt();
		System.out.print("Enter the Value of Imaginary: ");
		imag = ConsoleInput.getInt();
		
		Complex c1 = new Complex(real, imag);
		
		Complex c2 = new Complex(4, 5);
		
		Complex c3 = c1.add(c2);
		c3.display();
		Complex c4 = c1.sub(c2);
		c4.display();
		Complex c5 = c1.mul(c2);
		c5.display();
		
	}

}
