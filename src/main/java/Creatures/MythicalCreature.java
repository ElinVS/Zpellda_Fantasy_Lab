package Creatures;

public class MythicalCreature extends Creature {

    private int defense;


    public MythicalCreature(String name, String species, int defense) {
        super(name, species, health);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
