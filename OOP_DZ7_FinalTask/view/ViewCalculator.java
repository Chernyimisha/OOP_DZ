package OOP_DZ7_FinalTask.view;

import OOP_DZ7_FinalTask.calculator.ICalculableFactory;
import OOP_DZ7_FinalTask.calculator.Calculable;
import OOP_DZ7_FinalTask.numbers.ComplexNumber;
import OOP_DZ7_FinalTask.numbers.ImaginaryPartComplexNumber;
import OOP_DZ7_FinalTask.numbers.RealPartComplexNumber;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            System.out.println("Введите первый аргумент: ");
            ComplexNumber primaryArg = inputComplexNumber();
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +) : ");
                System.out.println("Введите второй аргумент: ");
                if (cmd.equals("*")) {
                    ComplexNumber secondArg = inputComplexNumber();
                    calculator.multi(secondArg);
                }
                if (cmd.equals("+")) {
                    ComplexNumber secondArg = inputComplexNumber();
                    calculator.sum(secondArg);
                }
                System.out.printf("Результат: " + calculator.result());
                break;
            }
            String cmd = prompt("\nЕще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private float promptFloat(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Float.parseFloat(in.nextLine());
    }

    private ComplexNumber inputComplexNumber(){
        float arg1 = promptFloat("Введите вещественную часть комплексного числа: ");
        float arg2 = promptFloat("Введите мнимую часть комплексного числа: ");
        return new ComplexNumber(new RealPartComplexNumber(arg1), new ImaginaryPartComplexNumber(arg2));
    }

}
