import Units.Alliance.Dwarf;
import Units.Alliance.DwarfConfig;
import Units.Alliance.Human;
import Units.Horde.*;
import Weapons.Sword;
import Weapons.Weapon;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Создаем объект класса меч через xml файл(простой бин)
        ClassPathXmlApplicationContext xmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Weapon mySword = xmlApplicationContext.getBean("mySword", Sword.class );
        System.out.println("///////");

        //Создаем персонажа класса орк, и добавляем ему через конструктор меч с зависимостью через xml файл
        Orc myOrc = xmlApplicationContext.getBean("myOrc", Orc.class);
        myOrc.create();
        myOrc.equip();
        System.out.println("/////////");

        //Создаем персонажа класса таурен и добавляем через сеттер меч с зависимостью через xml файл
        Tauren tauren = xmlApplicationContext.getBean("myTauren", Tauren.class);
        System.out.println("/////////");

        //Создаем персонажа класса нежить установив ему поля через xml файл
        Undead undead = xmlApplicationContext.getBean("myUndead", Undead.class);
        System.out.println("Имя персонажа: " + undead.getName());
        System.out.println("Количество здоровья персонажа: " + undead.getHp());
        System.out.println("//////////////");

        //Создаем персонажа класса троль установив ему поля через properties файл
        Troll troll = xmlApplicationContext.getBean("myTroll", Troll.class);
        System.out.println("Имя персонажа: " + troll.getName());
        System.out.println("Количество здоровья персонажа: " + troll.getHp());
        System.out.println("////////////");

        //Создаем персонажа класса эльф крови через аннотацию Components
        BloodElf bloodElf = xmlApplicationContext.getBean("bloodElfBean", BloodElf.class);
        bloodElf.create();
        System.out.println("/////////");
        //Создаем персонажа класса гоблин с помощью аннотаций
        Goblin goblin = xmlApplicationContext.getBean("goblinBean", Goblin.class);
        //Создаем персонажа класса человек с помощью аннотаций Values
        Human human = xmlApplicationContext.getBean("humanBean", Human.class);
        human.create();
        System.out.println("Персонаж имя: " + human.getName());
        System.out.println("Здоровье персонажа: " + human.getHp());
        System.out.println("Атака персонажа: " + human.getAttack());
        System.out.println("///////////");
        xmlApplicationContext.close();
        //Создаем персонажа дворф в спомощью создание бина путем Java коа в файле DwarfConfig
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DwarfConfig.class);
        Dwarf dwarf = applicationContext.getBean("dwarfBean", Dwarf.class);
        dwarf.create();
        applicationContext.close();
    }
}
