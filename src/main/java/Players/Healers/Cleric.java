package Players.Healers;

import Players.AttackTypes.HealthType;
import Players.Player;

public class Cleric extends Player {

    private HealthType healthType;

    public Cleric(String name, int healthPoints, int level, HealthType healthType) {
        super(name, healthPoints, level);
        this.healthType = healthType;
    }

    public HealthType getHealthType() {
        return healthType;
    }

    public void setHealthType(HealthType healthType) {
        this.healthType = healthType;
    }

    @Override
    public int attack() {
        return 0;
    }
}
