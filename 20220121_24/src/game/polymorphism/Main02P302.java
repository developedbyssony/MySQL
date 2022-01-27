package polymorphism;

public class Main02P302 {
	public static void main(String[] args) {
		// 개발자 생성 및 정보조회, Person으로 개발자를 받음, 1.부모클래스의 showPerson 호출, 2.자식클래스의 showPerson 호출(오버라이드된) = 오버라이드된 쇼펄슨 호출
		Person c1 = new Doctor("김의사", 33, 100000000);
		Person c2 = new Developer("박개발", 35, 60000000);
		
		// 자식 클래스 호출할 경우 부모 클래스까지 호출, direct로 자식클래스의 showPerson 호출 = 오버라이드된 쇼펄슨 호출
		Doctor d1 =  new Doctor("김의사", 33, 100000000);
		Developer d2 = new Developer("박개발", 35, 60000000);
		
		d1.showPerson();
		d1.showDoctor();
		System.out.println("------------");
		d2.showPerson();
		d2.showDeveloper();
	}
}
