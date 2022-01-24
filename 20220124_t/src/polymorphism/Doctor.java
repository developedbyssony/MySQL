package polymorphism;

public class Doctor extends Person {
	private int pay;
	
	public Doctor(String name, int age, int pay) {
		super(name,age); // super는 생성자 내부에서 한번만 호출
		this.pay = pay;
	}
	
	public void showPerson() { // 오버라이드
		super.showPerson(); // 부모클래스에서 super로 메소드 호출
		System.out.println(this.pay);
	}
	
	public void showDoctor() {
		System.out.println("저는 의사입니다.");	
	}
}
