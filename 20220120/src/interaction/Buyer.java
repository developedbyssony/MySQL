package interaction;

public class Buyer {
	// �����ڴ� money(������), mango(����������)�� ��������� �����ϴ�.
	private int money;
	private int mango;
	private int MANGO_PRICE;
	
	// �����ڿ��� ���� �޾� �������� �ʱ�ȭ���ְ� ����� 0���� �ʱ�ȭ�մϴ�.
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.MANGO_PRICE = 1000;
	}
	
	public void showBuyer() { /// ��ȸ �޼���� �Ű����� �䱸�� �ʿ䰡 �����ϴ�.
		System.out.println("--------------����������----------------");
		System.out.println("��������� :" + this.money + "���������� :" + this.mango);
	}
	
	// ������ ���忡�� ���� �����ϴ� buyMango�� ����ϴ�.
	// �����ڰ� buyMango�� ȣ���� �� ���ÿ� �Ǹ����� sellMango�� ���ÿ� ȣ��Ǿ�� �մϴ�.
	//                      ��������        �       �� �������� �����ϴ�.
	public void buyMango(Seller abcd, int mango) {
		//// �Ǹ����� ���� ���� �����Ϸ��� ������ ���� ��� 
		//// "���� ��� �����մϴ�."��� �˸��� �޼��带 �������Ѿ��մϴ�.
		//// Seller���� ���� ��� Buyer�ʿ��� �̸� �ƴ� �����
		//// getMango()�� Seller�ʿ� ������ִ� �� �ۿ� �����Ƿ�
		//// getMango()�� Seller�ʿ� �������༭ Buyer�ʿ���
		//// �������� ��ȸ�� �� �ֵ��� ���ֽð�, �� ����� ����
		//// ������� �����ϴٸ� return;���� buyMango�� ������� �ʰ� ���ּ���.
		if (abcd.getMango() < mango) {System.out.println("���� ��� �����ؼ� �ŷ��� �Ұ����մϴ�.");}
		
		// �� �ݾ��� �����ǰ� ���� �þ�� ������ �ۼ����ּ���.
		this.money -= this.MANGO_PRICE * mango; /// ���� ���� * ���� ����
		this.mango += mango; 
		// �Ǹ����� sellMango ȣ��
		abcd.sellMango(mango);
	}
	
	//// Buyer������ Seller�� �������� ��ȸ�ϵ��� ���� ����
	public int getMango() {
		return this.mango;
	}
}

