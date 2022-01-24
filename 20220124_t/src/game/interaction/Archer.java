package game.interaction;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv; // 멤버변수

	public Archer() {
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.lv = 1;
		this.exp = 0; // 생성자
	}
	public void huntOrc(Orc orc) {
		if(orc.getHp() <= 0) {// 교전 전에 이미 죽은 상태
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}
		
		orc.doBattle(this.atk);

		if(orc.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 10;
			System.out.println("오크를 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("궁수의 경험치 : " + this.exp);
		}else {
			this.hp -= orc.getAtk();			
		}

		System.out.println("궁수의 남은 체력 : " + this.hp);
	}
	
	public void huntMonster1(Monster1 monster1) {
		if(monster1.getHp() <= 0) {// 교전 전에 이미 죽은 상태 검사
			System.out.println("몬스터1이 이미 죽은 상태입니다.");
			return;
		}
		
		monster1.doBattle1(this.atk); // doBattle을 호출해 먼저 체력을 깎고

		if(monster1.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 10;
			System.out.println("몬스터1를 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("궁수의 경험치 : " + this.exp);
		}else {
			this.hp -= monster1.getAtk();			
		}

		System.out.println("궁수의 남은 체력 : " + this.hp);
	}
	
	
	public void huntMonster2(Monster2 monster2) {
		if(monster2.getHp() <= 0) {// 교전 전에 이미 죽은 상태 검사
			System.out.println("몬스터2이 이미 죽은 상태입니다.");
			return;
		}
		
		monster2.doBattle2(this.atk); // doBattle을 호출해 먼저 체력을 깎고

		if(monster2.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 10;
			System.out.println("몬스터2를 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("궁수의 경험치 : " + this.exp);
		}else {
			this.hp -= monster2.getAtk();			
		}

		System.out.println("궁수의 남은 체력 : " + this.hp);
	}
	
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp() <= 0) {// 교전 전에 이미 죽은 상태 검사
			System.out.println("토끼가 이미 죽은 상태입니다.");
			return;
		}
		
		rabbit.doBattle(this.atk); // doBattle을 호출해 먼저 체력을 깎고

		if(rabbit.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 10;
			System.out.println("토끼를 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("궁수의 경험치 : " + this.exp);
		}else {
			this.hp -= rabbit.getAtk();		
		}

		System.out.println("궁수의 남은 체력 : " + this.hp);
	}
	
	
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}
	
}
