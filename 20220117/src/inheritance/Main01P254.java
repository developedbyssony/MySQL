package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		// Student가 Person을 상속했기 때문에
		// Student는 Person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.name = "김고딩";
		s1.age = 19;
		s1.stuNum = 15;
		
		s1.getInfo(); // 이름과 나이만 호출 
		s1.getStuInfo(); // 부모, 자식 자원 모두 호출 (이름, 나이, 학번)
		
		// Student를 하나 더 만들어주시고
		// 코드는 복붙해서 보내주시고
		// 메모리구조는 그림으로 그려서 캡쳐해서 보내주세요.
		Student s2 = new Student();
		s2.name = "김중딩";
		s2.age = 15;
		s2.stuNum = 14;
		
		s2.getInfo();
		s2.getStuInfo();
	}

}
