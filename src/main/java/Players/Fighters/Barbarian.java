package Players.Fighters;

import Players.AttackTypes.ProtectionType;
import Players.AttackTypes.WeaponType;

public class Barbarian extends Fighter{

    private ProtectionType protectionType;

    public Barbarian(String name, int healthPoints, int level, WeaponType weaponType, ProtectionType protectionType){
        super(name, healthPoints, level, weaponType);
        this.protectionType = ProtectionType.SHIELD;
    }

    public ProtectionType getProtectionType() {
        return protectionType;
    }
}
