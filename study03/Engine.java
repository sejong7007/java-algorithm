package study03;
import java.util.Scanner;
import study03.Student;

public class Engine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		Student student = new Student();
		
		int flag = 0 ;
		String result = "";
		
		while(true) {
			System.out.println("메뉴 : 0.종료   1.BMI   2.Rank   3.HowMuch    4.ReportCard ");
			flag = scanner.nextInt();
			
			switch(flag) {
			
			case 0 : System.out.println("종료"); return;
			
			case 1 : System.out.println("BMI");
			
					 String name = "";
					 double cm = 0.0, kg = 0.0 ;
						
					 System.out.println("이름을 입력하세요.");
					 name = scanner.next();
					 System.out.println("키를 입력하세요. [단위 : cm]");
					 cm = scanner.nextDouble();
					 System.out.println("몸무게를 입력하세요. [단위 : kg]");
					 kg = scanner.nextDouble();
						
					 result = student.getBmi(name, kg, cm);
						
					 System.out.println(result);
						
					 break;
			
			case 2 : System.out.println("Rank");
					 break;
					 
			case 3 : System.out.println("HowMuch");
					 student.howMuch();
					 break;
					 
			case 4 : System.out.println("ReportCard");
					 student.getReportCard();
					 break;
					
			}
		}
		
	}

}
