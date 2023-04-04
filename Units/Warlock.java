package OOP_java.Units;

public class Warlock extends BaseHero {

    // Конструктор с параметрами
    public Warlock(String name) {
        super(17, 12, 0, "-5", 30, 9, 0, 1, name);
    }

    // Второй конструктор с возможностью задания всех характеристик героя
    public Warlock(int attack, int defense, int shots, String damage, int health, int speed, int delivery, int magic, String name) {
        super(attack, defense, shots, damage, health, speed, delivery, magic, name);
    }

}