package Structure;

public class ClassMain01P196 {

	public static void main(String[] args) {
		// 차 2대 생성
		
		Car a = new Car();
		a.model = "자동차1";
		a.price = 200;
		a.owner = "자바";
		// 콘솔에 정보 조회하기
		System.out.println(a.model);
		System.out.println(a.price);
		System.out.println(a.owner);

		Car b = new Car();
		b.model = "자동차2";
		b.price = 300;
		b.owner = "파이썬";
		// 콘솔에 정보 조회하기
		System.out.println(b.model);
		System.out.println(b.price);
		System.out.println(b.owner);
		
		// a.getInfo();
		// b.getInfo();

	}
}
