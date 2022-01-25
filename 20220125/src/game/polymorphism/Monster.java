package game.polymorphism;

public class Monster {
	// hp, atk을 변수(필드, 속성)로 가집니다.
	private int hp;
	private int atk;
	private String type; /// 문풀 : type 추가
	private int exp; /// 문풀 : exp 추가

	// 생성자까지 만들어주세요.
	public Monster(int hp, int atk, int exp, String type) { /// 문풀 : 생성자의 파라미터에 exp와 type 추가
		this.hp = hp;
		this.atk = atk;
		this.exp = exp; /// 문풀 : exp 받아올 수 있도록 수정
		this.type = type; /// 문풀 : type 받아올 수 있도록 수정
	}
	
	// doBattle
	public void doBattle(int uAtk, String type, int exp) { /// 문풀 : 메소드의 파라미터에 type과 exp 추가
		this.hp -= uAtk;
		System.out.println(this.type + "(이/가) 공격을 받았습니다.");/// 문풀 : type 조회 코드 추가
		System.out.println(this.type + "의 남은 체력은" + this.hp + "입니다.");
		System.out.println("경험치가" + this.exp + "상승하였습니다."); /// 문풀 : exp 조회 코드 추가 
	}
	
	
	// getter, setter (값을 바꾸는 로직이 외부에서 진행하지 않기 때문에 setter는 사실상 필요는 없음)
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

	public String getType() { /// 문풀 : 추가된 멤버변수의 게터와 세터 써주기
		return type;
	}

	public void setType(String type) { /// 문풀 : 추가된 멤버변수의 게터와 세터 써주기
		this.type = type;
	}
	
	public int getExp() {  /// 문풀 : 추가된 멤버변수의 게터와 세터 써주기
		return exp;
	}

	public void setExp(int exp) {  /// 문풀 : 추가된 멤버변수의 게터와 세터 써주기
		this.exp = exp;
	}
	
}
	