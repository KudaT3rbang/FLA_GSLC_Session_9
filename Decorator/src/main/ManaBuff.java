package main;

public class ManaBuff extends Buff {

	private int bonusDefense = 30;

	public ManaBuff(Character character) {
		super(character);
	}

	@Override
	public int getDefense() {
		return super.getDefense() + bonusDefense;
	}

	@Override
	public void attackEnemy() {
		super.attackEnemy();
		System.out.println("... protected by a Mana Shield! (+" + bonusDefense + " def)");
	}
}
