package main;

public class BloodLustBuff extends Buff {

	private double attackMultiplier = 2.05;

	public BloodLustBuff(Character character) {
		super(character);
	}

	@Override
	public int getAttack() {
		return (int) (character.getAttack() * attackMultiplier);
	}

	@Override
	public void attackEnemy() {
		super.attackEnemy();
		System.out.println("-> BloodLust: Eyes turn red (x2.05 Dmg)");
	}
}
