package Structure;

import structure.Person;

public class Structure02P190 {

	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ",나이 :" + p.age + ",연락처 : " + p.pNum);
	}
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a,b)
		Person a = new Person();
		a.name = "채종훈";
		a.age = 20;
		a.pNum = "01012345678";
		System.out.println(a);
		
		Person b = new Person();
		b.name = "김자바";
		b.age = 10;
		b.pNum = "01011111111";
		System.out.println(b);
		
		//Person a = new Person();
		//System.out.println(a);
		//a.name = "채종훈"; 
		//a.age = 20; 
		//a.pNum = "01012345678";
		//System.out.println(a.name);
		//System.out.println(a.age);
		//System.out.println(a.pNum);

		//Person b = new Person();
		//System.out.println(b);
		//b.name = "소윤희"; 
		//b.age = 31; 
		//b.pNum = "01045032245";
		//System.out.println(b.name);
		//System.out.println(b.age);
		//System.out.println(b.pNum);
		//System.out.println(b.name + "의 정보입니다.");
		//System.out.println("이름 : " + b.name + "연락처 : " + b.pNum);
		getInfo(a);
		System.out.println("-------------------");
		getInfo(b);
	}
}
