package OOP_DZ4;

import OOP_DZ4.shilds.Hoplon;
import OOP_DZ4.shilds.NullShield;
import OOP_DZ4.shilds.Paveza;
import OOP_DZ4.warriors.Archer;
import OOP_DZ4.warriors.Infantryman;
import OOP_DZ4.warriors.Warrior;
import OOP_DZ4.weapons.meleeWeapon.Axe;
import OOP_DZ4.weapons.meleeWeapon.Sword;
import OOP_DZ4.weapons.rangedWeapon.Bow;
import OOP_DZ4.weapons.rangedWeapon.CrossBow;


public class Program {
    public static void main(String[] args) {

        Team<Warrior> horns = new Team<>();
        Team<Archer> hooves = new Team<>();
        Team<Infantryman> tails = new Team<>();

        horns.add(new Archer("Robin", new Bow(), new NullShield(),100));
        horns.add(new Archer("Michail", new CrossBow(), new Paveza(15),120));
        horns.add(new Infantryman("Denis", new Sword(), new Hoplon(10),150));

        hooves.add(new Archer("Alex", new Bow(), new NullShield(),100));
        hooves.add(new Archer("Michail", new Bow(), new Paveza(13),90));
        hooves.add(new Archer("Denis", new CrossBow(), new Paveza(18),150));

        tails.add(new Infantryman("John", new Axe(), new NullShield(),110));
        tails.add(new Infantryman("Piter", new Axe(), new NullShield(),140));
        tails.add(new Infantryman("Donald", new Sword(), new NullShield(),130));

        System.out.println(horns);
        System.out.println(hooves);
        System.out.println(tails);

        Battle<Axe, Hoplon, CrossBow, Paveza> battle1 = new Battle<>(hooves.getWarrior(1), horns.getWarrior(2));
        battle1.fight();


    }
}
