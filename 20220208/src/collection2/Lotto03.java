package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 몇 장을 사야 당첨되는지 시뮬레이션 해보겠습니다.
		List<Integer> lotto = new ArrayList<>();
		List<Integer> luckyNum = new ArrayList<>();
		
		// 로또 번호를 받을 수 있는 변수 생성 후 0으로 초기화
		int getNum = 0; 
		int getNumm = 0; 
		int count = 0;
		
		// System.out.println(getNum)

		while(lotto.size() != 6) {
			// 번호 뽑기
			getNum = (int)(Math.random() * 45) + 1;
			// 번호가 만약 기존에 뽑은 번호 목록에 포함되어 있지 않다면 (* contains를 쓰세요.)
			if (!lotto.contains(getNum)) {
				// 추가하기
				lotto.add(getNum);
			}
		}
		
		Collections.sort(lotto);

		while(!lotto.contains(luckyNum)) { // lotto.contains == false가 true일 경우 무한반복
			luckyNum.clear();
			
			while(luckyNum.size() != 6) {
				getNumm = (int)(Math.random() * 45) + 1;
				if (!luckyNum.contains(getNumm)) {
					luckyNum.add(getNumm);
				}				
		}
			Collections.sort(luckyNum);	
			System.out.print(lotto);
			System.out.println(luckyNum);
			count++;
		}
		System.out.println("구매한 로또복권의 개수 : " + count );
		}
		}