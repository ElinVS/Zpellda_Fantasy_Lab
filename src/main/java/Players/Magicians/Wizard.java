package Players.Magicians;

import Creatures.MythicalCreature;
import Players.AttackTypes.SpellType;

public class Wizard extends Magician{

    private int invisibilityCloak;

    public Wizard(String name, int healthPoints, int level, MythicalCreature mythicalCreature, SpellType spellType, int invisibilityCloak) {
        super(name, healthPoints, level, mythicalCreature, spellType);
        this.invisibilityCloak = invisibilityCloak;
    }

    public int getInvisibilityCloak() {
        return invisibilityCloak;
    }

    public void setInvisibilityCloak(int invisibilityCloak) {
        this.invisibilityCloak = invisibilityCloak;
    }
}
