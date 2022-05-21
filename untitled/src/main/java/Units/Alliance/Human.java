package Units.Alliance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("humanBean")
public class Human implements Alliance{
    @Value("${human.name}")
    private String name;
    @Value("${human.hp}")
    private int hp;
    @Value("${human.attack}")
    private int attack;


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public void create() {
        System.out.println("Персонаж человек создан");
    }
}
