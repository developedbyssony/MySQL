package game.polymorphism;

//현재 Monster 클래스에 대한 다형성을 활용하기 위해 설계했으므로
//모든 몬스터 계열 클래스는 Monster를 상속받습니다.
public class Slime extends Monster {
	
	// 이미 몬스터 계열에 필요한 정보는 모두 Monster클래스에
	// 작성되어있으므로 그냥 체력수치와 공격력 수치만 몬스터별로 관리하면 됩니다.
	public Slime() {
		super(300,1,5,"슬라임"); 	/// 문풀 : 부모 클래스의 생성자 파라미터에 따라 수정
	}
}
