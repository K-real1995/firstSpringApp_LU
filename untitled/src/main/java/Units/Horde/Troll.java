package Units.Horde;

import Weapons.Sword;

public class Troll {
    private Sword sword;
    private String name;
    private int hp;


    public Troll() {
        System.out.println("Троль создан");
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSword(Sword sword){
        this.sword = sword;
    }

    public void create() {
        System.out.println("Троль создан");
    }
}
