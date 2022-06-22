package Rooms;

import Creatures.MonsterCreature;

public class TraumaRoom extends Room{

    private MonsterCreature monster;

    public TraumaRoom(String name, MonsterCreature monster) {
        super(name);
        this.monster = monster;
    }

    public MonsterCreature getMonster() {
        return monster;
    }

    public void setMonster(MonsterCreature monster) {
        this.monster = monster;
    }



}
