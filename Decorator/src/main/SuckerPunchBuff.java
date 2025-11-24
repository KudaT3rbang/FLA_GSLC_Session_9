package main;

public class SuckerPunchBuff extends Buff {

	private int bonusDamage = 10;

	public SuckerPunchBuff(Character character) {
		super(character);
	}

	@Override
	public int getAttack() {
		return character.getAttack() + bonusDamage;
	}

	@Override
	public void attackEnemy() {
		System.out.println("[Sucker Punch] Charging up a cheap shot...");
		super.attackEnemy();
	}
}
