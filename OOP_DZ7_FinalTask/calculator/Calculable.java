package OOP_DZ7_FinalTask.calculator;

import OOP_DZ7_FinalTask.numbers.ComplexNumber;

public interface Calculable {
    ComplexNumber sum(ComplexNumber arg);

    ComplexNumber multi(ComplexNumber arg);

    ComplexNumber result();

}
