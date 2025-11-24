package main;

public class Main {

	public static void main(String[] args) {
		Character fighter = new Fighter();
        
        // Apply Buff Logic
		// Fighter base attack stat = 25
		// Frostbite wraps Fighter -> 25 * 1.1 = 27
		// Bloodlust wraps Frostbite -> 27 * 2.05 = 55
        fighter = new FrostbiteBuff(fighter);
        fighter = new BloodLustBuff(fighter);

        System.out.println("Battle Log");
        
        fighter.attackEnemy();
        
        int finalDamage = fighter.getAttack();
        
        System.out.println("--------------------");
        System.out.println("Total Damage: " + finalDamage);
	}

}
