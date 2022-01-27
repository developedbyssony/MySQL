package Structure;

public class Structure03P190 {
	
	// getInfo는 고양이에 대한 정보를 얻어와 화면에 출력합니다.
	
	public static void getInfo(Cat p) { // 메소드, 컨트롤+s 눌러서 이름 왼쪽에 있는 별 없앨 것 => 저장해야 돌아감
		System.out.println(p.nname + " : 변수1");
		System.out.println(p.aage + " : 변수2");
		System.out.println(p.ppNum + " : 변수3");
	}
	
	public static void main(String[] args) {
		// 고양이 2마리 생성
		Cat a = new Cat();
		a.nname = "고양이1";
		a.aage = 20;
		a.ppNum = "01";
		
		Cat b = new Cat();
		b.nname = "고양이2";
		b.aage = 21;
		b.ppNum = "02";
		
		getInfo(a);
		getInfo(b);
		
		Person p1 = new Person();
		p1.name = "채종훈";
		p1.age = 10;
		p1.pNum = "01001010101";

	}
}
