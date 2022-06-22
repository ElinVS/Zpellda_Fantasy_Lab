package CreatureTests;

import Creatures.MonsterCreature;
import Creatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterCreatureTest {

   MonsterCreature monsterCreature;

    @Before
    public void before(){
        monsterCreature = new MonsterCreature("Mark", "Ogre", 8);
    }

    @Test
    public void hasAName(){
        assertEquals("Mark", monsterCreature.getName());
    }

    @Test
    public void hasSpecies(){
        assertEquals("Ogre", monsterCreature.getSpecies());

    }

    @Test
    public void hasDamageStrength(){
        assertEquals(8, monsterCreature.getDamage());

    }



}
