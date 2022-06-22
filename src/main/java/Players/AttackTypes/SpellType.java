package Players.AttackTypes;

public enum SpellType {

    FIREBALL(5),
    LIGHTNING_STRIKE(4),
    KISS_OF_BETRAYAL(3),
    BANANA_SPLIT(9);


    private final int damageStrength;

    SpellType(int damageStrength) {
        this.damageStrength = damageStrength;
    }

    public int getDamageStrength() {
        return damageStrength;
    }
}
