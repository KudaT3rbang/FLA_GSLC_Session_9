package main;

public class Mage implements Character {
	private int attack = 15;
    private int defense = 8;
    private int hp = 80;

	@Override
	public int getAttack() {
		return attack;
	}

	@Override
	public int getDefense() {
		return defense;
	}

	@Override
	public int getHP() {
		return hp;
	}

	@Override
	public void attackEnemy() {
		System.out.println("Mage casts a fire spell!");
	}

}
