import java.util.Scanner;

public class dddd {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double rate = 35.97;
	System.out.println("태국 바트의 환율은" + rate + "입니다.");
	System.out.println("원화를 입력해주세요.");
	int won = scan.nextInt();
	System.out.println("원화"+ won + "원을 태국 바트로 환전시");
	System.out.println(won/rate + "바트입니다.");
	scan.close();
	}
}
