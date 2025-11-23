package main;

public class Main {

	public static void printStats(Character c) {
		System.out.println("Stats: [HP: " + c.getHP() + " | ATK: " + c.getAttack() + " | DEF: " + c.getDefense() + "]");
	}

	public static void main(String[] args) {
		Character myFighter = new Fighter();
		printStats(myFighter);
		myFighter.attackEnemy();

		myFighter = new AttackBuff(myFighter);
		printStats(myFighter);
		myFighter.attackEnemy();

		printStats(myFighter);
		myFighter.attackEnemy();

		Character myMage = new Mage();
		myMage = new ManaBuff(myMage);
		myMage = new HealthBuff(myMage);

		printStats(myMage);
		myMage.attackEnemy();
	}

}
