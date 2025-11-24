package main;

public class Buff implements Character {
	protected Character character;

	public Buff(Character character) {
		this.character = character;
	}

	@Override
	public int getAttack() {
		return character.getAttack();
	}

	@Override
	public int getDefense() {
		return character.getDefense();
	}

	@Override
	public int getHP() {
		return character.getHP();
	}

	@Override
	public void attackEnemy() {
		character.attackEnemy();
	}
}
