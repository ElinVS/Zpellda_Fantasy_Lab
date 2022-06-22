package Players.Fighters;

import Players.AttackTypes.ProtectionType;
import Players.AttackTypes.WeaponType;

public class Knight extends Fighter{

    private ProtectionType protectionType;

    public Knight(String name, int healthPoints, int level, WeaponType weaponType, ProtectionType protectionType) {
        super(name, healthPoints, level, weaponType);
        this.protectionType = ProtectionType.ARMOUR;
    }

    public ProtectionType getProtectionType() {
        return protectionType;
    }
}
