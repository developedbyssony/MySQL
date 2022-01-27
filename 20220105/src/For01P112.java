
public class For01P112 {

	public static void main(String[] args) {
		// for문은 while문과는 다르게 몇 바퀴를 돌릴지 정해놓고
		// 사용하는 반복문입니다.
		// 문법은
		// for(시작변수; 종료조건; 증감식) {
		//     실행문1;
		//     실행문2...
		// }
		// 으로 이루어져 있습니다.
		for(int i = 0; i < 3; i++) { // 1이 첫번째 바퀴만 있고 다음부터는 2,3 -> 14번 라인으로.. // 공식 : i < 3 = 3바퀴 도는 for문 , 작거나 같다고하면 1바퀴 더 돔
			System.out.println("for문을 이용한 반복문"); 
		} // false일 때 빠져나옴

	}

}
