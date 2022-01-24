package polymorphism;

public class Developer extends Person {
	private int salary;
	
	public Developer(String name, int age, int salary) {
		super(name,age); // super는 생성자 내부에서 한번만 호출
		this.salary = salary;
	}
	
	public void showPerson() { // 오버라이드
		super.showPerson(); // 부모클래스에서 super로 메소드 호출
		System.out.println(this.salary);
	}
	
	public void showDeveloper() {
		System.out.println("저는 개발자입니다.");	
	}

}
