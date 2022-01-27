import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배달금액을 입력해주세요.");
		int order = scan.nextInt();
		
		do {
			System.out.println("주문금액은" + order + "원입니다.");
			System.out.println("배달을 완료했습니다.");
			System.out.println("다음 배달금액을 입력해주세요.");
			order = scan.nextInt();
		}while(order>=15000);
		
		System.out.println("금액이 모자라 배달 서비스가 종료되었습니다.");

	}

}
