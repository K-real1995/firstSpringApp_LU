package Units.Horde;

import Weapons.Sword;

public class Undead implements Horde{
    private Sword sword;
    private String name;
    private int hp;


    public Undead() {
        System.out.println("Персонаж нежить создан");
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

    @Override
    public void create() {
        System.out.println("Персонаж нежить создан");
    }
}
