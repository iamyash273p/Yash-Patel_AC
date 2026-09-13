
public class Complex {

	private int real;
	private int imag;
	
	Complex(int real, int imag){
		this.real = real;
		this.imag = imag;
		
		System.out.print(this.real + " + " + this.imag + "i");
	}
	
	public Complex add(Complex c) {
		this.real = this.real + c.real;
		this.imag = this.imag + c.imag;
		
		return this;
	}
	
	public Complex sub(Complex c) {
		this.real = this.real - c.real;
		this.imag = this.imag - c.imag;
		
		return this;
	}
	
	public Complex mul(Complex c) {
		this.real = this.real * c.real;
		this.imag = this.imag * c.imag;
		
		return this;
	}
	
	
}
