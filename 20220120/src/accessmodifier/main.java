package accessmodifier;

public class main {

	public static void main(String[] args) {
		// Magician�� �ϳ� �������ּ���.
		Magician c1 = new Magician("������");
		
		// getInfo()�� ������ ��ȸ���ּ���.
		c1.getInfo();
		
		// hunt()�� 2�� ȣ���� ����� 2�� ���ּ���.
        // c1.hunt();
		// c1.hunt();

		c1.fireball();
		
		// ����� ������ �ٽ� getInfo()�� ���ּ���.
		c1.getInfo();
	}

}
