package CreatureTests;

import Creatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MythicalCreatureTest {

    MythicalCreature mythicalCreature;

    @Before
    public void before(){
        mythicalCreature = new MythicalCreature("Smoggel", "dragon", 6);
    }

    @Test
    public void hasAName(){
        assertEquals("Smoggel", mythicalCreature.getName());
    }

    @Test
    public void hasSpecies(){
        assertEquals("dragon", mythicalCreature.getSpecies());

    }

    @Test
    public void hasDefenseStrength(){
        assertEquals(6, mythicalCreature.getDefense());

    }


}
