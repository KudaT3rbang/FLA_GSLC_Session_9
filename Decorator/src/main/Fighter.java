package main;

public class Fighter implements Character {
	private int attack = 25;
	private int defense = 20;
	private int hp = 120;

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
		System.out.println("Fighter swings their weapon!");
	}

}
