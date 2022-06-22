package Players.Magicians;

import Creatures.MythicalCreature;
import Players.AttackTypes.SpellType;

public class Warlock extends Magician {

    private int forcefieldStrength;

    public Warlock(String name, int healthPoints, int level, MythicalCreature mythicalCreature, SpellType spellType, int forcefieldStrength) {
        super(name, healthPoints, level, mythicalCreature, spellType);
        this.forcefieldStrength = forcefieldStrength;
    }

    public int getForcefieldStrength() {
        return forcefieldStrength;
    }

    public void setForcefieldStrength(int forcefieldStrength) {
        this.forcefieldStrength = forcefieldStrength;
    }
}
