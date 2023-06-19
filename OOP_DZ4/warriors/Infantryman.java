package OOP_DZ4.warriors;

import OOP_DZ4.shilds.Hoplon;
import OOP_DZ4.shilds.Shielded;
import OOP_DZ4.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, Shielded> {
    public Infantryman(String name, Melee weapon, Shielded shield, int healthPoint) {
        super(name, weapon, shield, healthPoint);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
