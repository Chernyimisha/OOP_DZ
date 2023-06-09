package OOP_DZ4.warriors;

import OOP_DZ4.shilds.Paveza;
import OOP_DZ4.shilds.Shielded;
import OOP_DZ4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Shielded> {
    public Archer(String name, Ranged weapon, Shielded shield, int healthPoint) {
        super(name, weapon, shield,healthPoint);
    }

    public int distance(){
        return (super.getWeapon()).distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, DistanceAttack: %d", super.toString(), distance());
    }
}
