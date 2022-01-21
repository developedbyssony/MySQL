package accessmodifier;

public class Main02 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("ภüป็");
		w1.getInfo();
		System.out.println("================");
		w1.hunt();
		w1.getInfo();
		System.out.println("================");
		w1.doubleAttack();
		w1.getInfo();
	}

}
