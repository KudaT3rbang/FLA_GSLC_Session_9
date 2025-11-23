package main;

public class AttackBuff extends Buff {
	
	private int bonusDamage = 20;

	public AttackBuff(Character character) {
		super(character);
	}
	
	@Override
    public int getAttack() {
        return super.getAttack() + bonusDamage;
    }
	
	@Override
	public void attackEnemy() {
		super.attackEnemy();
        System.out.println("... with extra power! (+" + bonusDamage + " dmg)");
	}
}
