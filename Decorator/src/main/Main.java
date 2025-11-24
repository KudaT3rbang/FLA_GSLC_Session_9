package main;

public class Main {

	public static void main(String[] args) {
		Character fighter = new Fighter();

		fighter = new FrostbiteBuff(fighter);
		fighter = new SuckerPunchBuff(fighter);

		System.out.println("Combat Log");
		fighter.attackEnemy();

		System.out.println("\nDamage Calculation");
		// Base: 25
		// Frostbite: 25 * 1.1 = 27
		// SuckerPunch: 27 + 10 = 37
		System.out.println("Total Damage Dealt: " + fighter.getAttack());
	}

}
