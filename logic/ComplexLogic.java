package by.htp.less10.complex.logic;

import by.htp.less10.complex.entity.ComplexNumber;

public class ComplexLogic {

	public ComplexNumber sum(ComplexNumber number1, ComplexNumber number2) {

		return new ComplexNumber(number1.getReal() + number2.getReal(),
				number1.getImaginary() + number2.getImaginary());
	}

	public ComplexNumber subctract(ComplexNumber number1, ComplexNumber number2) {

		return new ComplexNumber(number1.getReal() - number2.getReal(),
				number1.getImaginary() - number2.getImaginary());
	}
}
