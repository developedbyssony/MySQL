package polymorphism;

public class Main02P302 {
	public static void main(String[] args) {
		Person d1 = new Doctor("김의사", 33, 100000000);
		Person d2 = new Developer("박개발", 35, 60000000);
		
		d1.showPerson();
		System.out.println("------------");
		d2.showPerson();
	}
}
