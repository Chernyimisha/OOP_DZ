package OOP_DZ7_FinalTask.calculator;


import OOP_DZ7_FinalTask.logger.Logger;
import OOP_DZ7_FinalTask.numbers.ComplexNumber;
import OOP_DZ7_FinalTask.numbers.ImaginaryPartComplexNumber;
import OOP_DZ7_FinalTask.numbers.RealPartComplexNumber;

public class Calculator implements Calculable {

    private ComplexNumber primaryComplexNumber;

    private ComplexNumber result = null;

    Logger logger;


    public Calculator(ComplexNumber primaryComplexNumber, Logger logger) {
        this.primaryComplexNumber = primaryComplexNumber;
        this.logger = logger;
        logger.writeLog("Calculable primary arg: " + primaryComplexNumber);
    }


    @Override
    public ComplexNumber sum(ComplexNumber arg) {
        float realNumResult = primaryComplexNumber.getRealNumber().getNumber()
                + arg.getRealNumber().getNumber();
        float imageNumResult = primaryComplexNumber.getImageNumber().getNumber() + arg.getImageNumber().getNumber();
        result = new ComplexNumber(new RealPartComplexNumber(realNumResult),
                new ImaginaryPartComplexNumber(imageNumResult));
        logger.writeLog("Calculable operation: sum ");
        logSecondArgResult(arg);
        return result;
    }

    @Override
    public ComplexNumber multi(ComplexNumber arg) {
        float realNumResult = primaryComplexNumber.getRealNumber().getNumber() * arg.getRealNumber().getNumber()
                + (primaryComplexNumber.getImageNumber().getNumber() * arg.getImageNumber().getNumber()) * -1;
        float imageNumResult = primaryComplexNumber.getRealNumber().getNumber() * arg.getImageNumber().getNumber()
                + primaryComplexNumber.getImageNumber().getNumber() * arg.getRealNumber().getNumber();
        result = new ComplexNumber(new RealPartComplexNumber(realNumResult),
                new ImaginaryPartComplexNumber(imageNumResult));
        logger.writeLog("Calculable operation: multi ");
        logSecondArgResult(arg);
        return result;
    }

    private void logSecondArgResult(ComplexNumber arg) {
        logger.writeLog("Calculable second arg: " + arg);
        logger.writeLog("Calculable result: " + result);
    }

    @Override
    public ComplexNumber result() {
        return result;
    }

}
