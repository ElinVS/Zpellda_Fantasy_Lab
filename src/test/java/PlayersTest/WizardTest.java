package PlayersTest;

import Creatures.MythicalCreature;
import Players.AttackTypes.SpellType;
import Players.Magicians.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    MythicalCreature mythicalCreature;


    @Before
    public void before(){

        mythicalCreature = new MythicalCreature("Kermit", "Magic Frog", 6);
        wizard = new Wizard("Job", 20, 3, mythicalCreature, SpellType.KISS_OF_BETRAYAL, 3);
    }

    @Test
    public void hasAName(){
        assertEquals("Job", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, wizard.getHealthPoints());
    }

    @Test
    public void hasAMythicalCreature(){
        assertEquals(mythicalCreature, wizard.getMythicalCreature());
    }

    @Test
    public void hasASpellType(){
        assertEquals(SpellType.KISS_OF_BETRAYAL, wizard.getSpellType());
    }

    @Test
    public void canChangeSpellType(){
        wizard.setSpellType(SpellType.BANANA_SPLIT);
        assertEquals(SpellType.BANANA_SPLIT, wizard.getSpellType());
    }

    @Test
    public void hasAInvisibilityCloak(){
        assertEquals(3, wizard.getInvisibilityCloak());
    }



}
