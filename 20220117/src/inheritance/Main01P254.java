package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		// Student�� Person�� ����߱� ������
		// Student�� Person�� �ڿ��� ����� �� �ֽ��ϴ�.
		Student s1 = new Student();
		s1.name = "����";
		s1.age = 19;
		s1.stuNum = 15;
		
		s1.getInfo(); // �̸��� ���̸� ȣ�� 
		s1.getStuInfo(); // �θ�, �ڽ� �ڿ� ��� ȣ�� (�̸�, ����, �й�)
		
		// Student�� �ϳ� �� ������ֽð�
		// �ڵ�� �����ؼ� �����ֽð�
		// �޸𸮱����� �׸����� �׷��� ĸ���ؼ� �����ּ���.
		Student s2 = new Student();
		s2.name = "���ߵ�";
		s2.age = 15;
		s2.stuNum = 14;
		
		s2.getInfo();
		s2.getStuInfo();
	}

}
