package Players.Fighters;

import Players.AttackTypes.ProtectionType;
import Players.AttackTypes.WeaponType;
import Players.Player;

public abstract class Fighter extends Player {

    private WeaponType weaponType;



    public Fighter(String name, int healthPoints, int level, WeaponType weaponType) {
        super(name, healthPoints, level);
        this.weaponType = weaponType;

    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
