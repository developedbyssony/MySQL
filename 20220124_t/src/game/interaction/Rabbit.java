package game.interaction;

public class Rabbit {
	// 토끼는 hp, atk를 가집니다.
	private int hp;
	private int atk;
	
	// 생성자는 토끼에게 hp는 2, atk은 1를 부여합니다.
	public Rabbit() {
		this.hp = 5;
		this.atk = 3;
	}
	
	// doBattle() 메서드를 만들겠습니다.
	// 유저의 공격력을 입력받아 토끼의 체력을 차감합니다.
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("토끼의 남은 체력 :" + this.hp);
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
