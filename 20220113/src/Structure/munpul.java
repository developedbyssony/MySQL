package Structure;

public class munpul {
	
	public static void ggetInfo(Carmethod p) {
		System.out.println("연료량" + p.gas);
		System.out.println("속도" + p.speed);
		System.out.println("오너" + p.owner);
	}

	public static void main(String[] args) {
		Carmethod a = new Carmethod();
		a.gas = 100;
		a.speed = 0;
		a.owner = "o";
		ggetInfo(a);
	}
	
	public void accelSpeed() {
		gas -= 2;
		speed += 10;
	}
}
