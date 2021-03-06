package Players;

import Behaviours.IFight;
import Rooms.Room;
import Rooms.TreasureType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Player implements IFight {

    private String name;
    private int healthPoints;
    private int level;

    private ArrayList<TreasureType> collectionOfTreasures;
    private ArrayList<Room> roomsVisited;

    public Player(String name, int healthPoints, int level) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.level = level;
        this.collectionOfTreasures = new ArrayList<TreasureType>();
        this.roomsVisited = new ArrayList<Room>();
    }

    public void addTreasureToPlayer(TreasureType treasure){
        this.collectionOfTreasures.add(treasure);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCollectionOfTreasuresCOUNT() {
        return collectionOfTreasures.size();
    }


    public int getRoomsVisitedCOUNT() {
        return roomsVisited.size();
    }

    public void collectTreasure(TreasureType somethingShiny) {
        addTreasureToPlayer(somethingShiny);

    }


}
