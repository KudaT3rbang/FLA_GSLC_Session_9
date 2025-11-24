package main;

public class FrostbiteBuff extends Buff {
	public FrostbiteBuff(Character character) {
		super(character);
	}

	@Override
	public int getAttack() {
		return (int) (character.getAttack() * 1.10);
	}

	@Override
	public void attackEnemy() {
		super.attackEnemy();
		System.out.println("-> Frostbite: Enemy is slowed by ice!");
	}
}
