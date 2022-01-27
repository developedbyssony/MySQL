package polymorphism;

public class Developer extends Person {
	private int salary;
	                // 박개발        35        600000000
	public Developer(String name, int age, int salary) {
		super(name,age); // super는 생성자 내부에서 한번만 호출
		this.salary = salary;
	}
	
	public void showPerson() { // 오버라이드
		super.showPerson(); // 부모 클래스에서 super로 메소드 호출
		System.out.println(this.salary); // 부모 쪽에 없는 요소 추가 출력
	}
	
	public void showDeveloper() { // 자식 쪽에만 존재하는 메소드
		System.out.println("저는 개발자입니다.");	
	}

}
