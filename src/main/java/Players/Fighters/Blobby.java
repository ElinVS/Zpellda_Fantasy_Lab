package Players.Fighters;

import Players.AttackTypes.ProtectionType;
import Players.AttackTypes.WeaponType;

public class Blobby extends Fighter{

    private ProtectionType protectionType;

    public Blobby(String name, int healthPoints, int level, WeaponType weaponType) {
        super(name, healthPoints, level, weaponType );
        this.protectionType = ProtectionType.BANANA_GLOVES;
    }

    public ProtectionType getProtectionType() {
        return protectionType;
    }
}
