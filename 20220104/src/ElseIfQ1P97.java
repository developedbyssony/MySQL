import java.util.Scanner;

public class ElseIfQ1P97 {

	public static void main(String[] args) {
		// 성적 판독기를 만들어보겠습니다.
		// if ~ else if ~ else 구문을 사용해 만들어주세요.
		// 성적 기준 95 이상 A+, 90이상 A0, 85이상 B+, 80이상 B0
		// 75이상 C+, 70이상 C0, 65이상 D+, 60이상 D0
		// 60미만 F로 콘솔창에 출력해주세요.
		// 스캐너로 int score; 변수에 성적을 입력한 결과로 콘솔에 성적이 나오면 됩니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int a = scan.nextInt();
		
		if(a >= 95) { // true라고 나올 수 있는 경우의 수 적은게 위로 가야 의도한대로 작동한다. = 내말 : a의 범위가 작을수록 위로 가야, a의 범위가 넓을수록 밑으로 가야!
			System.out.println("A+");
		} else if(a >= 90) {
			System.out.println("A0");
		} else if(a >= 85) {
			System.out.println("B+");
		} else if(a >= 80) {
			System.out.println("B0");
		} else if(a >= 75) {
			System.out.println("C+");
		} else if(a >= 70) {
			System.out.println("C0");
		} else if(a >= 65) {
			System.out.println("D+");
		} else if(a >= 60) {
			System.out.println("D0");
		}
		scan.close();
	}

}
