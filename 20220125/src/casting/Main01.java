package casting;

public class Main01 {
	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있습니다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// Animal c1, d1, a1으로 받아주세요.
		Animal a1 = new Animal("털짐승",10);
		Animal c1 = new Cat("루비",3);
		Animal d1 = new Dog("벤지",7);
		
		System.out.println(d1 instanceof Dog);
		
		// c1, d1, a1에 대해서 .sit()을 각각 호출해보세요.
		a1.sit();
		c1.sit();
		d1.sit();
		
		// 각 자료형의 근본적 자료형에 맞춰서 되돌려보겠습니다.
		Cat cat = (Cat)c1;
		// c1은 Animal타입이나, 힙에 저장된 데이터가 Cat
		// 이므로 Cat으로 변환이 가능함.
		cat.sikbbang();
		
		// a1은 힙/스택 모두에 Animal로만 저장되어 있어
		// 다른 자료형으로 변환이 불가능합니다.
		// (고양이 기능 없는 고양이가 만들어짐)
		// Cat cat2 = (Cat)a1;
		// cat2.sikbbang();
		
		Dog dog = (Dog)d1;
		dog.woodada();
		
		//	Dog dog2 = (Dog)a1;
		//	dog2.woodada();
		
	}
}
