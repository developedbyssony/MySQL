package interaction;

public class Main01 {
	public static void main(String[] args) {
    Seller s1 = new Seller(100);
    s1.showSeller();
    
	Buyer b1 = new Buyer(10000);
	b1.showBuyer();
	System.out.println("-------------------------------------");
	b1.buyMango(s1, 101); /// 주소값, 망고갯수
	/// 현실에서는 구매자가 판매자를 고르기 때문에 바이어에서 셀러를 같이 호출해서 처리합니다.
	
	b1.showBuyer();
    s1.showSeller();
	
}
}
