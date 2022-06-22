package GamesTest;

import Creatures.MonsterCreature;
import Game.PlayGame;
import Players.AttackTypes.WeaponType;
import Players.Fighters.Blobby;
import Players.Player;
import Rooms.Room;
import Rooms.TraumaRoom;
import Rooms.TreasureRoom;
import Rooms.TreasureType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    PlayGame game;
    Blobby blobby;
    ArrayList<Room> rooms;
    TreasureRoom treasureRoom1;
    TreasureRoom treasureRoom2;
    TraumaRoom traumaRoom1;
    TraumaRoom traumaRoom2;
    MonsterCreature monsterCreature1;
    MonsterCreature monsterCreature2;



    @Before
    public void before(){

        blobby = new Blobby("Mr Blobby", 18, 2, WeaponType.BANANA_GUN);

        rooms = new ArrayList<>();

        treasureRoom1 = new TreasureRoom("Gold digger", TreasureType.GOLD );
        treasureRoom2 = new TreasureRoom("Pig Palace", TreasureType.TINY_GOLDEN_PIG);
        monsterCreature1 = new MonsterCreature("Betty", "Troll", 5,20);
        monsterCreature2 = new MonsterCreature("Mark", "Ogre", 8,10);
        traumaRoom1 = new TraumaRoom("Fire of fury", monsterCreature1);
        traumaRoom2 = new TraumaRoom("Swamp of coding", monsterCreature2);

        rooms.add(treasureRoom1);
        rooms.add(traumaRoom1);
        rooms.add(treasureRoom2);
        rooms.add(traumaRoom2);

        game = new PlayGame(blobby,rooms, rooms.get(0));
    }

    @Test
    public void hasAPlayer(){
        assertEquals(blobby, game.getPlayer());
    }

    @Test
    public void hasAListOfRooms(){
        assertEquals(4, game.getRoomArrayList().size());
    }

    @Test
    public void hasACurrentRoom(){
        assertEquals(treasureRoom1, game.getCurrentRoom());
    }

    @Test
    public void canPickUpTreasure(){

        if (game.getCurrentRoom() instanceof  TreasureRoom){
            Room room = game.getCurrentRoom();
            TreasureRoom treasureRoom = (TreasureRoom) room;
            TreasureType somethingShiny = treasureRoom.getTreasure();
            blobby.collectTreasure(somethingShiny);
            assertEquals(1, game.getPlayer().getCollectionOfTreasuresCOUNT() );
        }
    }

    @Test
    public void canFightAMonster(){

        if (game.getCurrentRoom() instanceof  TraumaRoom){
            Room room = game.getCurrentRoom();
            TraumaRoom traumaRoom = (TraumaRoom) room;
            MonsterCreature scaryBeast = traumaRoom.getMonster();

            game.fightMonster(blobby,scaryBeast);
            assertEquals(0, ((TraumaRoom) game.getCurrentRoom()).getMonster().getHealth());
        }
    }
    @Test
    public void canChangeRooms(){
        game.moveRoom();
        assertEquals(traumaRoom1,game.getCurrentRoom());
    }

}

// if (game.getCurrentRoom() instanceof  TreasureRoom){
//         Room randomRoom = game.getCurrentRoom();
//         tresureRoom = (TreasureRoom) randomRoom;
//
