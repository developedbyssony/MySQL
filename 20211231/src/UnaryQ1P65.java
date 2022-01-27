
public class UnaryQ1P65 {
	public static void main(String[] args) {
		// int a에 15를 담은 다음 후위 -> 전위 순으로 --를 Unary01P65처럼 사용해서
		// 1씩 차감하고 콘솔에 찍는 것을 반복해주세요.
		// 단, 실행 로직은 Unary01P65에서 그랬듯 주석으로 하단에 풀어서 작성까지 해주세요.
		int a = 15;
		System.out.println(a--); // 후위 수식, a값(15) 출력 후 1 차감
		// 1. a값(15)를 콘솔에 찍음  : sysout(a(15))
		// 2. a값을 1 차감시킴 : a(15) - 1
		System.out.println(a);
		System.out.println(--a);// 전위 수식, 실행 전에 먼저 a값(14)에서 1 차감
		// 1. a값을 먼저 1 차감시킴 : a(14) - 1
		// 2. 차감된 a값(13)를 콘솔에 찍음 : sysout(a(13))
		System.out.println(a); // a값은 1 차감(13)한 채로 유지됨

	}
}
