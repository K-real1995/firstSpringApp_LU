package Units.Horde;

import Weapons.Sword;

public class Tauren implements Horde {
    private Sword sword;


    public Tauren() {
        System.out.println("Таурен создан");
    }


    public void setSword(Sword sword){
        this.sword = sword;
    }

    @Override
    public void create() {
        System.out.println("Таурен создан");
    }

}
