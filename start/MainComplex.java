package by.htp.less10.complex.start;

import by.htp.less10.complex.entity.ComplexNumber;
import by.htp.less10.complex.logic.ComplexLogic;
import by.htp.less10.complex.presentation.ComplexView;

public class MainComplex {

	public static void main(String[] args) {

		ComplexNumber number1 = new ComplexNumber(4.4, 8.1);
		ComplexNumber number2 = new ComplexNumber(9.6, 4.3);

		ComplexNumber resultSum = new ComplexNumber();

		ComplexLogic logic = new ComplexLogic();
		resultSum = logic.sum(number1, number2);

		ComplexView view = new ComplexView();
		view.printComplexSum(number1, number2, resultSum);

		ComplexNumber resultSubstract = new ComplexNumber();
		resultSubstract = logic.subctract(number1, number2);
		view.printComplexSubctract(number1, number2, resultSubstract);
	}
}
