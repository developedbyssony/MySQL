package game.interaction;

public class Main01 {
	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		Orc o1 = new Orc();
		Monster1 m1 = new Monster1();
		Monster2 m2 = new Monster2();
		Rabbit r1 = new Rabbit();
		
		//교전2번씩
		w1.huntOrc(o1);
		System.out.println("-------------------");
		w1.huntOrc(o1);
		System.out.println("-------------------");
		w1.huntOrc(o1);
		System.out.println("-------------------");
		
		w1.huntMonster1(m1);
		System.out.println("-------------------");
		w1.huntMonster1(m1);
		System.out.println("-------------------");
		w1.huntMonster1(m1);
		System.out.println("-------------------");
		
		w1.huntMonster2(m2);
		System.out.println("-------------------");
		w1.huntMonster2(m2);
		System.out.println("-------------------");
		w1.huntMonster2(m2);
		System.out.println("-------------------");
		
		w1.huntRabbit(r1);
		System.out.println("-------------------");
		w1.huntRabbit(r1);
		System.out.println("-------------------");
		w1.huntRabbit(r1);
		System.out.println("-------------------");		

	}
}
