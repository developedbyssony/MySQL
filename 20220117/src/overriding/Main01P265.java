package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말을 하나 생성해주시고
		// 오버라이드된 메서드들을 하나씩 호출해보세요.
		Horse h1 = new Horse();
		h1.name = "경주마";
		h1.age = 3;
		h1.gender = "수";
		h1.rank = 2;
		h1.howl();
		h1.getHorseInfo();
		
		Panda p1 = new Panda();
		p1.name = "판다스";
		p1.age = 4;
		p1.gender = "수";
		p1.color = "pink";
		p1.howl();
		p1.getPandaInfo();
		
		

	}
}
