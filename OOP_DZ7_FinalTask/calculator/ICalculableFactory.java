package OOP_DZ7_FinalTask.calculator;


import OOP_DZ7_FinalTask.numbers.ComplexNumber;

public interface ICalculableFactory {
    Calculable create(ComplexNumber primaryComplexNumber);
}
