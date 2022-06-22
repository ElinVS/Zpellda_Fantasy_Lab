package Creatures;

public class MonsterCreature extends Creature{


    private int damage;

    public MonsterCreature(String name, String species, int damage, int health) {
        super(name, species, health);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
