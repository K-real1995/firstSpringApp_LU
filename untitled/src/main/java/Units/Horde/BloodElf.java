package Units.Horde;

import org.springframework.stereotype.Component;

@Component("bloodElfBean")
public class BloodElf implements Horde{

    @Override
    public void create() {
        System.out.println("Эльф крови создан");
    }
}
