package PlayersTest;

import Players.AttackTypes.ProtectionType;
import Players.AttackTypes.WeaponType;
import Players.Fighters.Blobby;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlobbyTest {

    Blobby blobby;


    @Before
    public void before(){

        blobby = new Blobby("Mr Blobby", 18, 2, WeaponType.BANANA_GUN);
    }

    @Test
    public void hasProtectionType(){
        assertEquals(ProtectionType.BANANA_GLOVES, blobby.getProtectionType());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(18, blobby.getHealthPoints());
    }
    @Test
    public void hasALevel(){
        assertEquals(2, blobby.getLevel());
    }
    @Test
    public void hasAWeaponType(){
        assertEquals(WeaponType.BANANA_GUN, blobby.getWeaponType());
    }

    @Test
    public void canChangeWeapon(){
        blobby.setWeaponType(WeaponType.BOW);
        assertEquals(WeaponType.BOW, blobby.getWeaponType());
    }

}
