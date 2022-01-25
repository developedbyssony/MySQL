package casting;

public class Dog extends Animal {
	              //벤지,     7
	public Dog(String name, int age) {
		super(name,age);
	}
	
	public void woodada() {
		System.out.println("강아지가 우다다를 합니다.");
	}
	
	public void sit() {
		System.out.println("강아지가 있습니다.");
	}
}
