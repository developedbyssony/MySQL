package classreview;

public class Car {
	public int gas;
	public int speed;
	public String owner;
	
	public Car(String o) { // ��� ������ �ʱ�ȭ�ϴ� "������" => �ۺ� + Ŭ���������� ���� �� �ִ�. �����Լ��� ������ ����
		gas = 100;
		speed = 0;
		owner = o;
	}
	
	public void getInfor() { // ������ �ൿ�� �����ϴ� "�޼���" => �ۺ� + ���̵� �Ǵ� ��Ʈ + �޼���� 
		System.out.println(gas);
	}
}
