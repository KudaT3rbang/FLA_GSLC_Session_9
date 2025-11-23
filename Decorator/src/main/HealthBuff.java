package main;

public class HealthBuff extends Buff {
	private int bonusHP = 50;

	public HealthBuff(Character character) {
		super(character);
	}

	@Override
	public int getHP() {
		return super.getHP() + bonusHP;
	}

	@Override
	public void attackEnemy() {
		super.attackEnemy();
		System.out.println("... main HP extended by soul HP! (+" + bonusHP + " hp)");
	}
}
