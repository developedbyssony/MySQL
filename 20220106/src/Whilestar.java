import java.util.Scanner;

public class Whilestar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("정수를 입력해주세요.");
		int i = scan.nextInt();
		int j = 1;
		while(i <= j) {
			System.out.print("*");
		    System.out.printf("\n");
		}
	}
}