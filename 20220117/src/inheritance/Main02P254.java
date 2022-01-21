package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		// 생성한 객체의 정보를 get~~~~Info()를 이용해 콘솔에도 같이 찍어주세요.
		
		Student c1 = new Student();
		c1.name = "김초딩";
		c1.age = 13;
		c1.stuNum = 13;
		c1.getInfo();
		
		Salaryman c2 = new Salaryman();
		c2.name = "소윤희";
		c2.age = 31;
		c2.salary = 4000;
		c2.getSalaryInfo();

	}

}
