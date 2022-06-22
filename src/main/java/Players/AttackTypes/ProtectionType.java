package Players.AttackTypes;

public enum ProtectionType {

    HELMET(5),
    SHIELD(4),
    ARMOUR(7),
    BANANA_GLOVES(9);

    private final int protection;

    ProtectionType(int protection) {
        this.protection = protection;
    }
}
