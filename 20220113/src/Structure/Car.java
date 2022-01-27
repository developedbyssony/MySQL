package Structure;

public class Car {

		// 자동차의 상태(속성)를 나타내는 변수들
		public int gas; // 연료량
		public int speed; // 속도
		public String owner; // 차주
		
		// 생성자 정의 : 생성자는 리턴타입을 가지지 않고, 클래스명을 그대로 메서드명으로 씁니다.
		// new 키워드로 생성할 때 딱 한 번만 실행됩니다.
		public Car (String stst) {
			gas = 100; // 출고시 만땅
			speed = 0; // 출고시 0
			owner = stst;
		} // 생성자 = 메서드라고 생각!
		
		// getinfo 메소드 (메인의 객체)
		public static void ggetInfo(Carmethod p) {
			System.out.println("연료량" + p.gas + "속도" + p.speed + "오너" + p.owner);
		}
		
		// accel 엑셀기능 1
		public void accelSpeed() {
			gas -= 2;
			speed += 10;
		}
		
		// break 감속기능 2
		public void breakSpeed() {
			speed -= 10;
		}
			
		// reFuel 주유기능 3
		public void reFuel() {
			gas += 50;
		}
	}
