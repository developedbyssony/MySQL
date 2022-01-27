package polymorphism;

public class Student extends Person {
	private int grade;
	              // "김자바",      2,      100
	public Student(String name, int age, int grade) {
		super(name,age); // super는 생성자 내부에서 한번만 호출
		this.grade = grade;
	}
	
	public void showPerson() { // 오버라이드
		 // System.out.println(getName()); // 1. 부모클래스에 있는 변수 get으로 불러오기
		super.showPerson(); // 2. 부모클래스에서 super로 메소드 호출
		System.out.println(this.grade);
	}
	
	public void showStudent() {
		System.out.println("저는 학생입니다.");	
	}
	
}
