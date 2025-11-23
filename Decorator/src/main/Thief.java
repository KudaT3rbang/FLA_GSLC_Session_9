package main;

public class Thief implements Character {
	private int attack = 18;
    private int defense = 10;
    private int hp = 90;
	
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
		System.out.println("Thief lands a quick strike with " + attack + " damage!");
	}

}
