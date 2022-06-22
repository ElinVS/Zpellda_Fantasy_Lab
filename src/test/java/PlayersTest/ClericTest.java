package PlayersTest;

import Players.AttackTypes.HealthType;
import Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;


    @Before
    public void before(){

        cleric = new Cleric("Jebuz", 12, 4, HealthType.BALM );
    }

    @Test
    public void hasHealthType(){
        assertEquals(HealthType.BALM, cleric.getHealthType());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(12, cleric.getHealthPoints());
    }
    @Test
    public void hasALevel(){
        assertEquals(4, cleric.getLevel());
    }


    @Test
    public void canChangeHealthType(){
        cleric.setHealthType(HealthType.ELIXIR);
        assertEquals(HealthType.ELIXIR, cleric.getHealthType());
    }
}
