package casting;

// Animal을 상속해주세요.
public class Cat extends Animal {

	// 생성자를 이용해 부모 쪽에 이름, 나이를 전달합니다.
	            // 루비,      3
	public Cat(String name, int age) {
		super(name,age);
	}
	
	public void sikbbang() {
		System.out.println("고양이가 식빵을 굽습니다.");
	}
	
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}
}
