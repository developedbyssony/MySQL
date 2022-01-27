import java.util.Scanner;

public class ssssssa {
public static void main(String[] args) {
	// 1. 스캐너 생성
	Scanner scan = new Scanner(System.in); 
	// 2. rate변수에 환율 저장
	double rate = 88.6;
	// 3. 환율 고지 및 원화 won 변수에 입력받기
	System.out.println("환율은"+ rate +"입니다.");
	int won = scan.nextInt();	
	// 4. 안내문구 및 원화를 환전한 금액 출력
	System.out.println("원화"+ won + "환전시" + won/rate + "입니다.");
	// 5. 다 사용한 scan변수는 .close()로 닫아줘야 메모리가 회수됩니다.
	scan.close();
}
}
