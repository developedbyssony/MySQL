package game.interaction;

public class Warrior {
	// Warrior의 특성으로
	// 체력(hp), 마나(mp), 공격력(atk), 경험치(exp), 레벨(lv)를 넣어주세요.
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;

	// 생성자를 생성해서 아무것도 입력받지 않고
	// 체력은 20, 마나는 10, 공격력은 4, 방어력은 1, 경험치는 0이 자동입력되게 해주세요.
	public Warrior() {
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.lv = 1;
		this.exp = 0;
	}
	
	public void huntOrc(Orc orc) {
		if (orc.getHp() <= 0) { // 교전 전
			System.out.println("오크가 이미 죽은 상태입니다.");
		} 
		
		orc.doBattle(this.atk); 
		
		if (orc.getHp() < 0) { ///// 오크의 체력이 -로 떨어졌을 경우 반격 안 받는 것 해보기
			System.out.println("이미 죽었는데 건들지 마세요ㅠㅠ");
		}
		
		if (orc.getHp() <= 1) { // 교전 후
			this.exp += 10;
			System.out.println("오크가 죽었습니다. 경험치가 10 올랐습니다.");
			System.out.println("전사의 경험치 : " + this.exp);
		} else {
			this.hp -= orc.getAtk(); // 오크한테 공격받음
		}
		
		 this.hp -= orc.getAtk(); 
		
		System.out.println("전사 남은 체력" + this.hp);
		
	}
	
	
	// 타 몬스터쪽에서 전사 스탯을 조회할 수 있도록 Getter/Setter를 만들어주세요.
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