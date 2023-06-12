package OOP_DZ2.terrarium.amphibians;

import OOP_DZ2.terrarium.Animal;

public abstract class Amphibians extends Animal {
    public Amphibians (String name){
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Amphibian: %s", super.toString());
    }


}
