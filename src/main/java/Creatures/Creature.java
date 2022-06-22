package Creatures;

public abstract class Creature {

    private String name;
    private String species;
    private int health;

    public Creature(String name, String species, int health) {
        this.name = name;
        this.species = species;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
