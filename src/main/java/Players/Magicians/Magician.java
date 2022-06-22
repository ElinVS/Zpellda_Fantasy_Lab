package Players.Magicians;

import Creatures.MythicalCreature;
import Players.AttackTypes.SpellType;
import Players.Player;

public abstract class Magician extends Player {

    private MythicalCreature mythicalCreature;
    private SpellType spellType;

    public Magician(String name, int healthPoints, int level, MythicalCreature mythicalCreature, SpellType spellType) {
        super(name, healthPoints, level);
        this.mythicalCreature = mythicalCreature;
        this.spellType = spellType;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }
}
