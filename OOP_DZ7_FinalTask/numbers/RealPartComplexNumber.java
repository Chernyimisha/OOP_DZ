package OOP_DZ7_FinalTask.numbers;

public class RealPartComplexNumber {

    private float number;

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public RealPartComplexNumber(float number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%f", number);
    }
}
