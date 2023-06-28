package OOP_DZ7_FinalTask.numbers;

public class ComplexNumber {
    private RealPartComplexNumber realNumber;
    private ImaginaryPartComplexNumber imageNumber;

    public ComplexNumber(RealPartComplexNumber realNum, ImaginaryPartComplexNumber imageNum) {
        this.realNumber = realNum;
        this.imageNumber = imageNum;
    }

    public RealPartComplexNumber getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(RealPartComplexNumber realNumber) {
        this.realNumber = realNumber;
    }

    public ImaginaryPartComplexNumber getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(ImaginaryPartComplexNumber imageNumber) {
        this.imageNumber = imageNumber;
    }

    @Override
    public String toString() {
        return String.format("%.1fi+(%.1f)", imageNumber.getNumber(), realNumber.getNumber());
    }
}
