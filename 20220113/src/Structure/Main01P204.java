package Structure;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차를 한 대 만들어보겠습니다.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인 이름으로 만들어주세요.
		Car c1 = new Car("소윤희"); // 안에 값 무조건 넣어야함!
		// System.out.println(c1);
		
		c1.gas = 100;
		c1.speed = 0; // 기본값 설정을 위해 생성자를 활용합니다.
		c1.owner = "채종훈";
		
        // c1.ggetInfo();
		c1.accelSpeed();
		c1.breakSpeed();
		//c1.
		// System.out.println(c1.gas);
		// System.out.println(c1.speed);
		// System.out.println(c1.owner);
		
	}
}
