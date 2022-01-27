import java.util.Scanner;

public class ForQ5P118 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해주세요.
		// 입력받은 정수의 제곱 형태로 정사각형이 찍히도록
		// 중첩 반복문을 작성해주세요
		// ex) 3 입력시
		// ***
		// ***
		// ***
		// 위와 같이 3 * 3 형태로 출력
		// 가로줄을 출력할 때는 System.out.print("*");를
		// 다음줄로 커서를 내릴때만 System.out.println();를 씁니다.
		
		// 17~19라인을 3번 반복하면 3 * 3 형태가 나올겁니다.
		Scanner scan = new Scanner(System.in); 
		System.out.println("한 변의 너비를 입력해주세요.");
		int i = scan.nextInt();
		for (int a = 1; a <= i; a++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			    System.out.printf("\n");
			}
		}
}
