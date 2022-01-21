package classreview;

public class Car {
	public int gas;
	public int speed;
	public String owner;
	
	public Car(String o) { // 멤버 변수를 초기화하는 "생성자" => 퍼블릭 + 클래스명으로 만들 수 있다. 리턴함수를 가지지 않음
		gas = 100;
		speed = 0;
		owner = o;
	}
	
	public void getInfor() { // 변수의 행동을 정의하는 "메서드" => 퍼블릭 + 보이드 또는 인트 + 메서드명 
		System.out.println(gas);
	}
}
