package overloading;

public class Main02 {

	public static void main(String[] args) {
		// �˹ٻ� ���� ������ּ���.
		// �ϳ��� �ñ��� 15000������ ���ֽð�
		// �ٸ� �ϳ��� �Է� ���� �������ּ���.
		Parttimer c1 = new Parttimer(true, 100, "�ĸ��ٰ�Ʈ", "�˹�1");
		System.out.println("------------------------");
		Parttimer c2 = new Parttimer(false, "�����÷��̽�", "�˹�2");
		System.out.println("------------------------");
		// �ñ� 5000���� �ְ� ��ƮŸ�̸Ӹ� ��������.
		Parttimer c3 = new Parttimer(true, 5000, "�ѷ��긣", "�˹�3");
		System.out.println("------------------------");
	}
}
