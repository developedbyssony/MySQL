package Structure;

public class Main02P204 {

public static void main(String[] args) {
		// 농구선수를 생성해주세요.
		BasketballPlayer a = new BasketballPlayer(175,120); 
		System.out.println(a); // (스택에 저장된 주소값 출력함)
		a.dunkShoot(); // ("골대에 닿지 않았습니다." 출력함)
		
		// 성공할 수 있는 선수로 생성해주세요.
		BasketballPlayer b = new BasketballPlayer(180,130); 
		b.dunkShoot(); // ("골대에 닿지 않았습니다." 출력함)
	}
}
