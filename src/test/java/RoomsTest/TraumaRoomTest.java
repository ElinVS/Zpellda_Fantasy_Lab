package RoomsTest;

import Creatures.MonsterCreature;
import Rooms.TraumaRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TraumaRoomTest {

    TraumaRoom traumaRoom;
    MonsterCreature monsterCreature;


    @Before
    public void before(){

        monsterCreature = new MonsterCreature("Betty", "Troll", 5);

        traumaRoom = new TraumaRoom("Fire of fury", monsterCreature);
    }

    @Test
    public void hasAName(){
        assertEquals("Fire of fury", traumaRoom.getName());
    }

    @Test
    public void hasAMonster(){
        assertEquals(monsterCreature, traumaRoom.getMonster());
    }



}
