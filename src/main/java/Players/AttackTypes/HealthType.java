package Players.AttackTypes;

public enum HealthType {

    POTION(4),
    ELIXIR(3),
    BALM(6),
    BANANOINTMENT(9);

    private final int healthStrength;

    HealthType(int healthStrength) {
        this.healthStrength = healthStrength;
    }

    public int getHealthStrength() {
        return healthStrength;
    }
}
