
public class Program {

	public static void main(String[] args) {
		
		int real;
		int imag;
		System.out.print("Enter the Value of Real: ");
		real = ConsoleInput.getInt();
		System.out.print("Enter the Value of Imaginary: ");
		imag = ConsoleInput.getInt();
		
		Complex c1 = new Complex(real, imag);
		Complex c2 = new Complex (real, imag);
		
		Complex c3 = c2 + c1;
		

	}

}
