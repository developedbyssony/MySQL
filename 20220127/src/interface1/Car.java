package interface1;

// 인터페이스 구현(상속이 아님!) 하기 위해서는
// extends 대신에 implements를 사용합니다.
// 인터페이스 내부의 추상메서드는 무조건 전부 구현해야 합니다.
public class Car implements Vehicle {
	// 자동차라면 가져야 하는 변수 설정
	// 현재 속도, 현재 연료량, 차주
	private int Speed;
	private int fuelLevel;
	private String Owner;
	
	// 생성자를 만들어주세요. 차주만 입력받고
	// 나머지 요소는 현재속도 0, 연료량 100을 자동으로 대입해주세요.
	public Car(String Owner) {
		this.Owner = Owner;
		this.Speed = CAR_MIN_SPEED;
		this.fuelLevel = CAR_MAX_GAS;
	}
		
	@Override
	public void accel() {
		// 한 번 가속시 속도가 10씩 늘어나도록 해주세요.
		// 연료는 한 번 가속에 1씩 소비합니다.
		// 단, 속도는 200을 초과할 수 없습니다.
		
		/// ------------------------------------------
		/// :) 선생님 코드
		if(Speed + CAR_ACCELERATE > CAR_MAX_SPEED) {
			Speed = CAR_MAX_SPEED;
		} else {
			Speed += CAR_ACCELERATE;
		}
		fuelLevel -= CAR_DECREASE_GAS;
		
		/// :) 내 코드
		/// if (this.Speed <= 200) { 
		/// this.Speed += 10;
		/// this.fuelLevel -= 1; }
		/// ------------------------------------------
		
		/// :) 출력값 조회
		/// System.out.println(this.Speed);
		/// System.out.println(this.fuelLevel);
	}

	@Override
	public void breakSpeed() {
		// 한 번 감속시 속도가 10씩 줄어들도록 해주세요
		// 단 속도가 0 미만이 될 수 없습니다.
		if(Speed - CAR_REDUCE < 0) {
			Speed = 0;
		} else {
			Speed -= CAR_REDUCE;
		}
		System.out.println(this.Speed);
	}

	@Override
	public void reFuel() {
		// 연료는 다시 채울때마다 30씩 채워줍니다.
		// 연료 최대량은 70L로 간주하고 70으로 설정합니다.
		if(fuelLevel + CAR_FILL > CAR_MAX_GAS) {
			fuelLevel = CAR_MAX_GAS;
		} else {
			fuelLevel += CAR_FILL;
		}
		System.out.println(this.fuelLevel);
	}

	@Override
	public void showStatus() {
		// 자동차의 속도, 연료량, 차주가 누군지 나오도록 해줍니다.
		System.out.println("속도" + this.Speed);
		System.out.println("연료량" + this.fuelLevel);
		System.out.println("차주" + this.Owner);
		System.out.println("-----------------");
		
	}	
	}

