package OOP_DZ2.terrarium.invertebrates;

import OOP_DZ2.terrarium.interfaces.Soundable;
import OOP_DZ2.terrarium.interfaces.SpeedSwimming;

public class Birdman extends Invertebrates implements SpeedSwimming, Soundable {
    public Birdman(String name) {
        super(name);
    }


    @Override
    public String feed() {
        return "meat and small spiders";
    }

    @Override
    public String toString() {
        return String.format("Birdman: %s, Feed: %s", super.toString(), feed());
    }


    @Override
    public String getSound() {
        return "Ш-ш-ш";
    }

    @Override
    public int getSwimSpeed() {
        return 0;
    }
}
