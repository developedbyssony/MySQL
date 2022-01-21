package game.interaction;

public class Orc {
	private int hp;
	private int atk;
	
	public Orc() {
		this.hp = 5;
		this.atk = 3;
	}
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("오크의 남은 체력 :" + this.hp);
	}
	
	
	/// 상호작용으로 인해서 게터세터필수
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
