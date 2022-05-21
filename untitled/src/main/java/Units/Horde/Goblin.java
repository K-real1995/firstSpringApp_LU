package Units.Horde;

import Weapons.Sword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("goblinBean")
public class Goblin implements Horde {
    private Sword sword;

    @Autowired
    public Goblin(Sword sword) {
        System.out.println("Персонаж гоблин создан");
        this.sword = sword;
    }

    @Override
    public void create() {
        System.out.println("Персонаж гоблин создан");
    }
}
