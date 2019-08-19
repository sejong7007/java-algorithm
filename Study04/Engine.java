package Study04;
import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {

			System.out.println("0.종료 1.BMI");
			Student student = new Student ();
			
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1 : System.out.println("BMI : 이름, 키, 몸무게 입력"); 
				String name = scanner.next();
				double height = scanner.nextDouble();
				double weight = scanner.nextDouble();
				String result = student.getBmi(name, height, weight);
			break;
			
			case 2 : System.out.println("대출금액 확인 : 이름, 주소, 나이 입력");
					 name = scanner.next();
					 String juso = scanner.next();
					 int age = scanner.nextInt();
					 int jango = scanner.nextInt();
					 String sinyoung = scanner.next();
					 result = student.getDaechul(name, juso, age, jango, sinyoung);
					 System.out.println(result);
					 
				//이름, 주소, 나이, 은행잔고, 신용도
				//결과는 항상 1억 대출
				break;
			
			}
		}
		
	}

}
