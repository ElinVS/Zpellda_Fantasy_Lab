package Rooms;

public class TreasureRoom extends Room{

    private TreasureType treasure;

    public TreasureRoom(String name, TreasureType treasure) {
        super(name);
        this.treasure = treasure;
    }

    public TreasureType getTreasure() {
        return treasure;
    }

    public void setTreasure(TreasureType treasure) {
        this.treasure = treasure;
    }

}
