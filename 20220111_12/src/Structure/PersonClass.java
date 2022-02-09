package Structure;

public class PersonClass {
	// 사람 정보를 Person과 동일하게 만들어주시되
	// 여러분이 추가하고 싶은 특성 하나를 더 추가해보세요.
	
	public String name; // 이름
	public int age; // 나이 
	public String pNum; // 연락처
	public String address; // 주소 
	public boolean glasses; // 안경 착용 여부 / 착용 true, 미착용 false
	public boolean beakshinpassed; 
	
	// getInfo1 메서드도 같이 PersonClass 안에 정의합니다.
	// ****** 클래스 내부에 생성할 때는 public 오른쪽에 오던 static 키워드를 뺍니다.
	// ****** 클래스는 자기와 같은 지역 내의 요소는 소속 명시 없이 조회가 가능합니다.
	public void ggetInfo() {
		System.out.println("이름 : " + name + ", ");
	} // 변수와 메소드가 하나의 세트로 묶여다니기 시작함!
}
