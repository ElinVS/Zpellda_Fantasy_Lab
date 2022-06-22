package RoomsTest;

import Creatures.MonsterCreature;
import Rooms.TraumaRoom;
import Rooms.TreasureRoom;
import Rooms.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;


    @Before
    public void before(){


        treasureRoom = new TreasureRoom("Gold digger", TreasureType.GOLD );
    }

    @Test
    public void hasAName(){
        assertEquals("Gold digger", treasureRoom.getName());
    }

    @Test
    public void hasAMonster(){
        assertEquals(TreasureType.GOLD, treasureRoom.getTreasure());
    }

    @Test
    public void canRemoveTreasure(){
        treasureRoom.setTreasure(TreasureType.NONE);
        assertEquals(TreasureType.NONE, treasureRoom.getTreasure());
    }



}
