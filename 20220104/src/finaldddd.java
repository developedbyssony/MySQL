import java.util.Scanner;

public class finaldddd {

	public static void main(String[] args) {
		// 여러분이 배달 어플을 만들었다고 가정하겠습니다.
		// 이 어플은 주문금액을 입력받습니다.
		// 주문금액이 15000 미만이면 프로그램이 멈춥니다.
		// 주문금액은 Scanner를 이용해 order 변수에 직접 입력받습니다.
		// 단, do while로 작성해 첫 주문은 주문금액이 15000 미만이어도
		// "배달을 완료했습니다." 라고 출력한 뒤
		// 다시 주문금액을 입력받는 로직을 반복문 내부에 작성해주세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("배달금액을 입력해주세요.");
		int order = scan.nextInt();
		do {// do 구문을 먼저 쓰고 하단에 while문을 적습니다.
			order < 15000;
			System.out.println("배달을 완료했습니다.");
				} while(a < 1); // 일반 while문과 달리 끝나는 지점에 ;를 붙입니다.

	}

}
