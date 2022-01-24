package polymorphism;

public class Person {
	// 사람을 나타내는 클래스
	// 상속만을 목적으로 하는 클래스
	// Person을 상속받은 자식들은 전부
	// Person을 요구하는 자리에 대입될 수 있습니다.
	private String name;
	private int age;
	/// 여기까지 멤버변수
	
	// 이름과 나이를 받아 초기화하게 해주세요.
	              // 박자바         1
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/// 여기까지 생성자
	
	// Person의 전체 데이터를 콘솔에 찍어주는 showPerson()
	// Person타입으로 호출했을 때 유일하게 호출가능한 메서드
	// 이 메서드를 자식쪽에 오버라이딩하면
	// 부모타입으로도 자식쪽 showPerson()을 호출할 수 있다.
	public void showPerson() {
		System.out.println("이름" + this.name);
		System.out.println("나이" + this.age);
	}
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
