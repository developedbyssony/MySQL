package interface1;

// Vehicle을 구현하기 위해 implements를 활용합니다.
public class Train implements Vehicle {
	
	// 속도, 연료량, 기관사명을 선언합니다.
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = TRAIN_MIN_SPEED;
		this.gas = TRAIN_MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {		
		if (speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPEED) {
			speed = TRAIN_MIN_SPEED;
		}
	}

	@Override
	public void breakSpeed() {
		if (speed + TRAIN_DECREASE_SPD < TRAIN_MIN_SPEED) {
			
		}
		
	}

	@Override
	public void reFuel() {
		if (gas + TRAIN_REFUEL_GAS > TRAIN_MAX_GAS) {
			gas = TRAIN_MAX_GAS;
		} else {
			gas += TRAIN_REFUEL_GAS;
		}
	}

	@Override
	public void showStatus() {
		// TODO Auto-generated method stub
		
	}
		
}
