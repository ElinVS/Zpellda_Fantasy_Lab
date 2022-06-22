package Game;

import Creatures.MonsterCreature;
import Players.Fighters.Blobby;
import Players.Player;
import Rooms.Room;
import Rooms.TreasureType;

import java.util.ArrayList;

public class PlayGame {

    private Player player;
    private ArrayList<Room> roomArrayList;
    private Room currentRoom;

    public PlayGame(Player player, ArrayList<Room> roomArrayList, Room currentRoom) {
        this.player = player;
        this.roomArrayList = roomArrayList;
        this.currentRoom = currentRoom;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Room> getRoomArrayList() {
        return roomArrayList;
    }

    public void setRoomArrayList(ArrayList<Room> roomArrayList) {
        this.roomArrayList = roomArrayList;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
        
    }

    public void moveRoom() {
        int index = roomArrayList.indexOf(getCurrentRoom());
        int next = index + 1;
        Room nextRoom = roomArrayList.get(next);
        setCurrentRoom(nextRoom);
    }

    public void fightMonster(Blobby blobby, MonsterCreature scaryBeast) {
        while (blobby.getHealthPoints() > 0 && scaryBeast.getHealth()>0){
            blobby.attack();


        }

    }
}
