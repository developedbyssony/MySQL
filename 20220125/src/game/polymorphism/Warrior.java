package game.polymorphism;

public class Warrior {
	// 속성(필드, 변수)값으로 name, hp, mp, atk를 추가해주세요.
	private String name;
	private int hp;
	private int mp;
	private int atk;
	
	// 생성자로 설정한 필드들을 초기화해주세요.
	// hp,mp,atk은 고정값으로 넣고 name은 입력받습니다.
	public Warrior(String name) {
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.name = name;
	}
	
	// hunt()를 만들어주세요.
	// Monster 타입과 교전이 가능합니다.
	// Mosnter의 doBattle()을 호출해 자기 데미지를 몬스터에게 넘겨주고
	// 몬스터가 살아있다면 다시 몬스터의 공격력만큼 데미지를 받습니다.
	// 몬스터가 공격 전에 죽어있다면 죽은 몬스터를 공격할 수 없습니다 라고 나오고
	// 몬스터를 죽였다면(체력이 0이하로 내려갔다면) 몬스터를 죽였습니다 라고 나오게 해주세요.
	public void hunt(Monster monster) {
		if (monster.getHp() <= 0)  {
			System.out.println("해당" + monster.getType() + "죽은 몬스터를 공격할 수 없습니다.");
			return;
			} // 몬스터 체력이 0 이하면 교전 안하고 바로 종료
	 
		monster.doBattle(this.atk,monster.getType(),monster.getExp()); /// 문풀 : 부모클래스(몬스터)의 메소드에 추가된 파라미터에 따라 워리어 인터랙션 코드 수정
		
		if (monster.getHp() <= 0) 
		{ System.out.println( monster.getType() + "(이/가) 죽었습니다.");
		System.out.println("전사의 남은 체력 : " + this.hp);
		} else { 
			this.hp -= monster.getAtk(); // 자신의 체력에서 몬스터 체력만큼 차감
		}
		System.out.println("전사의 남은 체력 : " + this.hp);
		System.out.println("전투를 종료합니다.");
	}
}
