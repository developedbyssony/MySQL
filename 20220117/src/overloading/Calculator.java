package overloading;

public class Calculator {
	
	// �޼ҵ� �̸��� ������ �ڷ������� ����
	
	public void plus(int a) { // �Ķ���ͷ� int a���� �䱸
		System.out.println(a + "�� 1�� ���� ����" + (a +1) + "�Դϴ�.");
	}
	
	public void plus(int a, int b) { // �Ķ���ͷ� int a, int b�� �䱸
		System.out.println(a + "��" + b + "�� ���� ����" + (a + b) + "�Դϴ�.");
	}
	
	public void plus(double a) { // �Ķ���Ͱ����� double a�� �䱸
		System.out.println(a + "�� 0.5�� ���� ����" + (a+0.5) + "�Դϴ�.");
	}
	
	public void plus(String a) { // �Ķ���ͷ� ���ڿ��� �䱸
		System.out.println("���ڿ��� ���� ����� �ƴմϴ�.");
	}
}
