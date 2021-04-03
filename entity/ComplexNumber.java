package by.htp.less10.complex.entity;

public class ComplexNumber {

	private double real;
	private double imaginary;

	public ComplexNumber() {

	}

	public ComplexNumber(double real, double imaginary) {

		this.real = real;
		this.imaginary = imaginary;

	}

	public ComplexNumber newComplexNumber(double real, double imaginary) {
		return new ComplexNumber(real, imaginary);
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	@Override
	public String toString() {
		return real + "+" + imaginary + "i";
	}

}
