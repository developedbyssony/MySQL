
public class ForQ1P112 {

	public static void main(String[] args) {
		// Hello Java를 10번 출력하는 구문을 작성해주세요.
		// for문을 사용해서 작성해주세요.
	for (int a = 0; a < 10; a++) { System.out.println("Hello Java"); }	
	// for 가로 안에 1,2번째 단어 끝날 때 ;쳐주기. int 변수 선언 시 값 매겨주기!,마지막 단어는 a를 증가시킬 수 있으면 됨 (ex. i +=1)
	// println();의 경우는 콘솔창에서 한 줄씩 출력되지만
	for (int a = 0; a < 10; a++) { System.out.print("Hello Java"); }
	// print();의 경우 다음줄로 내리지 않고 계속 이어서 작성합니다.
	// 반복문 내의 System.out.print()는 다음줄로 커서를 내려주는 기능이 없어서
	// 계속해서 한 줄에 이어서 출력됩니다.
	// 다른 출력 없이 그냥 한 줄만 내려주고 싶은 경우는
	// 아무것도 입력되지 않는 System.out.println();을 실행해주면 커서가 내려갑니다. (println = line별로 출력하란 소뤼)
	System.out.println(); // 커서를 다음줄로 내려준다.
	System.out.println("다 끝났습니다."); // 전 라인에서 내린 줄에 출력하고, 커서를 한번 더 내림
	}
}
