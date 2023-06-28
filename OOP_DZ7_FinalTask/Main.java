package OOP_DZ7_FinalTask;


import OOP_DZ7_FinalTask.calculator.CalculableFactory;
import OOP_DZ7_FinalTask.calculator.ICalculableFactory;
import OOP_DZ7_FinalTask.logger.Log;
import OOP_DZ7_FinalTask.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {

        ICalculableFactory calculableFactory = new CalculableFactory(new Log());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();

    }
}
