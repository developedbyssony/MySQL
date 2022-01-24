package game.interaction;

public class Monster2 {
	private int hp;
	private int atk;
	
	public Monster2() {
		this.hp = 5;
		this.atk = 3;
	}
	
	public void doBattle2(int uAtk) {
		this.hp -= uAtk;
		System.out.println("몬스터2의 남은 체력 :" + this.hp);
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
}
