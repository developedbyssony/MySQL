package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// ���� �ϳ� �������ֽð�
		// �������̵�� �޼������ �ϳ��� ȣ���غ�����.
		Horse h1 = new Horse();
		h1.name = "���ָ�";
		h1.age = 3;
		h1.gender = "��";
		h1.rank = 2;
		h1.howl();
		h1.getHorseInfo();
		
		Panda p1 = new Panda();
		p1.name = "�Ǵٽ�";
		p1.age = 4;
		p1.gender = "��";
		p1.color = "pink";
		p1.howl();
		p1.getPandaInfo();
		
		

	}
}
