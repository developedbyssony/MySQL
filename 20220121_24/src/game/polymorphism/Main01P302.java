package polymorphism;

public class Main01P302 {
	public static void main(String[] args) {
	// 부모 타입인 Person으로 자식인 Student까지 받을 수 있음!!!!!!!!!!!!!!!!!!!!!!!!!
	Person p1 = new Person("박자바",1);
	Person s1 = new Student("김자바",2,100);

	// p1과 s1의 showPerson은 다르게 돌아갑니다.
	p1.showPerson(); //Person측 showPerson();
	System.out.println("------------");
	s1.showPerson(); //Student showPerson(); grade가 나오면 안되는 상황 (오버라이딩을 했다면 자식쪽에 있는 것이 우선권)
	///= Person쪽만 불러올 수 있지만, 예외적으로 showPerson은 자식클래스(스튜던트)에서 오버라이딩된 값으로 받아옴

	
	// p1과 s1을 이용해 신분 밝히기용 메서드를 호출해보세요.
	// s1는 Person 타입이므로 Person에 소속된
	// 자원들만 호출할 수 있습니다.
	// s1.showStudent(); -> 스튜던트 소속이므로 호출되지 않음
	

}
}
