
public class MethodQ2P204 {

	// mul 메서드를 선언해주세요.
	// 이 메서드는 여러분들이 임의로 이름 붙인 정수 3개를 입력받아
	// 3개를 곱한 값을 return 해줍니다.
	
	public static int mul(int a, int b, int c) {
		return a * b * c;
	}
	
	// info 메서드를 선언해주세요.
	// 이 메서드는 내부에서
	// "안녕하세요"
	// "자바 메서드 학습중입니다."
	// "1번의 호출로 3줄을 콘솔에 작성합니다."
	// 라는 문장만 출력하고 return은 없습니다.
	
	public static void info() {
		System.out.println("안녕하세요");
		System.out.println("자바 메서드 학습중입니다.");
		System.out.println("1번의 호출로 3줄을 콘솔에 작성합니다.");
	}
	
	public static void main(String[] args) {
		// mul을 호출해 결과값을 int result에 저장한다음 콘솔에 출력하기
		int result = mul(3,2,1);
		System.out.println(result);
		// info 메서드 반복문으로 3번 호출하기
		for (int i = 0; i <3; i++) { // int i = 0; i < n; i++ -> 반복문에서 3바퀴 돌리는 것!
		info();}
	}
}
