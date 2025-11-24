package main;

public class Main {

	public static void main(String[] args) {
		Character fighter = new Fighter();
        
        // Apply Buff Logic
		// Fighter base attack stat = 25
		// Bloodlust wraps Fighter -> 25 * 2.05 = 51.25 = 51
		// Frostbite wraps Fighter -> 51 * 1.1 = 56.1 = 56
        fighter = new BloodLustBuff(fighter);
        fighter = new FrostbiteBuff(fighter);

        System.out.println("Battle Log");
        
        fighter.attackEnemy();
        
        int finalDamage = fighter.getAttack();
        
        System.out.println("--------------------");
        System.out.println("Total Damage: " + finalDamage);
	}

}
