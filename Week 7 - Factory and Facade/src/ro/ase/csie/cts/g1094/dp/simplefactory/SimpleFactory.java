package ro.ase.csie.cts.g1094.dp.simplefactory;

public class SimpleFactory {

	public static void main(String[] args) {


	/*	SuperHero superman = new SuperHero("Superman", new Pistol("Pisto", 100));
		superman.setWeapon(new MachineGun(500,1000));
		superman.setWeapon(new Bazooka());  */
		
		
		SuperHero batman = new SuperHero("Batman", WeaponsFactory.getWeapon(WeaponType.PISTOL, "Pisto"));
		batman.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "Machine Gun"));
		batman.setWeapon(WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "BUUM"));

	}

}
