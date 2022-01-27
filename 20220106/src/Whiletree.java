
public class Whiletree {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다. _ while로
		// 아래와 같은 별을 찍을 수 있도록 중첩 반복문을 사용해 코드를 작성해주세요.
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느 지점이 다음줄로 내리고, 어느 부분이 별을 나열하는지 생각해보세요.
		// 힌트 : 별 개수가 점점 늘어나는데, 점점 숫자가 커지는 변수가 뭐가 있을지 생각해보세요.
		int i = 0;
		int j;
		while (i<5) { 
			int j = 1;
			while(i<j) {
				System.out.println("*");}
		}
	}
}
