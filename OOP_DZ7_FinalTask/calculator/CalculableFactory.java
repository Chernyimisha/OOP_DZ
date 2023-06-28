package OOP_DZ7_FinalTask.calculator;


import OOP_DZ7_FinalTask.logger.Logger;
import OOP_DZ7_FinalTask.numbers.ComplexNumber;

public class CalculableFactory implements ICalculableFactory {

    Logger logger;

    public CalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(ComplexNumber primaryComplexNumber) {
        return new Calculator(primaryComplexNumber, logger);
    }
}
