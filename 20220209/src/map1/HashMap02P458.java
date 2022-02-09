package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// map 자료형을 이용해 식당 메뉴판을 만들어보겠습니다.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> map = new HashMap<>();
		map.put("김치찌개", 7000); // 파라미터가 모두 object = 만능자료형 but 어디서 에러가 났는지 체크하기가 어려움
		map.put("된장찌개", 7000);
		map.put("돌솥비빔밥", 6500);
		map.put("알밥", 7000);
		map.put("돈까스", 8000);
		
		System.out.println(map.get("김치찌개"));
		System.out.println(map.get("돌솥비빔밥"));
		System.out.println(map.get("돈까스"));

	}
}
