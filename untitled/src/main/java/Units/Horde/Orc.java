package Units.Horde;

import Weapons.Sword;

public class Orc implements Horde{
    Sword sword;

    public Orc(Sword sword) {
        this.sword = sword;
    }


    public void create(){
        System.out.println("Орк создан");
    }

    public void equip(){
        sword.create();
        System.out.println("Меч экипирован");
    }

}
