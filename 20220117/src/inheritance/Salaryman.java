package inheritance;

// Person�� ����ؼ� Salaryman�� ��������.
// ���������� ����(salary)�� �����ϴ�.
// getSalaryInfo()�� ���¸� ��ȸ�� �� �ֽ��ϴ�.

public class Salaryman extends Person {
	// �߰� ���� (�������Ǹ� ������ Ư��)
	public int salary;
	
	public void getSalaryInfo() {
		System.out.println("�̸� :" + name + "���� :" + age + "���� :" + salary);
	}
}
