package OOP_DZ4.shilds;

public class NullShield implements Shielded {

    @Override
    public int armorReserve() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String toString() {
        return "not shield";
    }
}