import java.util.Scanner;

public class ddddd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 단을 보고 싶으신가요?");
		int dan = scan.nextInt();
		for (int a = 1; a < 10; a++) {
		System.out.println(dan + " * " + a + " = " + dan * a);
	}
  }
}
       