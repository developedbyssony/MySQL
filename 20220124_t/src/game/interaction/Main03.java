package game.interaction;

public class Main03 {
	public static void main(String[] args) {
		Archer a1 = new Archer();
		Magician m1 = new Magician();
		Orc o1_2 = new Orc();
		Warrior w1 = new Warrior();
		Monster1 m1_2 = new Monster1();
		Monster2 m2_2 = new Monster2();
		Rabbit r1_2 = new Rabbit();
		
		//교전2번씩
		a1.huntOrc(o1_2);
		System.out.println("-------------------");
		a1.huntOrc(o1_2);
		System.out.println("-------------------");
		a1.huntOrc(o1_2);
		System.out.println("-------------------");
		
		a1.huntMonster1(m1_2);
		System.out.println("-------------------");
		a1.huntMonster1(m1_2);
		System.out.println("-------------------");
		a1.huntMonster1(m1_2);
		System.out.println("-------------------");
		
		a1.huntMonster2(m2_2);
		System.out.println("-------------------");
		a1.huntMonster2(m2_2);
		System.out.println("-------------------");
		a1.huntMonster2(m2_2);
		System.out.println("-------------------");
		
		a1.huntRabbit(r1_2);
		System.out.println("-------------------");
		a1.huntRabbit(r1_2);
		System.out.println("-------------------");
		a1.huntRabbit(r1_2);
		System.out.println("-------------------");	
		
		m1.huntOrc(o1_2);
		System.out.println("-------------------");
		m1.huntOrc(o1_2);
		System.out.println("-------------------");
		m1.huntOrc(o1_2);
		System.out.println("-------------------");
		
		m1.huntMonster1(m1_2);
		System.out.println("-------------------");
		m1.huntMonster1(m1_2);
		System.out.println("-------------------");
		m1.huntMonster1(m1_2);
		System.out.println("-------------------");
		
		m1.huntMonster2(m2_2);
		System.out.println("-------------------");
		m1.huntMonster2(m2_2);
		System.out.println("-------------------");
		m1.huntMonster2(m2_2);
		System.out.println("-------------------");
		
		m1.huntRabbit(r1_2);
		System.out.println("-------------------");
		m1.huntRabbit(r1_2);
		System.out.println("-------------------");
		m1.huntRabbit(r1_2);
		System.out.println("-------------------");	

	}
}

