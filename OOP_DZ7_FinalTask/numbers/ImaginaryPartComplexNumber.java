package OOP_DZ7_FinalTask.numbers;

public class ImaginaryPartComplexNumber {

    private float number;

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public ImaginaryPartComplexNumber(float number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%fi", number);
    }

}
