package game.polymorphism;

public class Orc extends Monster {
	
	public Orc () {
		super(5,2,10,"오크"); /// 부모 쪽에서 상속받은 변수를 super로 받아옴, 문풀 : 부모 클래스의 생성자 파라미터에 따라 수정
	}
	
}
