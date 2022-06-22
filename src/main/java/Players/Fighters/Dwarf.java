package Players.Fighters;

import Players.AttackTypes.ProtectionType;
import Players.AttackTypes.WeaponType;

public class Dwarf extends Fighter {

    private ProtectionType protectionType;


    public Dwarf(String name, int healthPoints, int level, WeaponType weaponType, ProtectionType protectionType) {
        super(name, healthPoints, level, weaponType);
        this.protectionType = ProtectionType.HELMET;
    }

    public ProtectionType getProtectionType() {
        return protectionType;
    }
}
