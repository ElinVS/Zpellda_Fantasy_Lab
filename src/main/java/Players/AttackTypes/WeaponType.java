package Players.AttackTypes;

public enum WeaponType {

    SWORD(5),
    AXE(4),
    BOW(6),
    BANANA_GUN(9);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
