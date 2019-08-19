package study03;
import java.util.Scanner;

public class Student {

// 1.BMI 2.Ranking 3.HowMuch 4.ReportCard	
	
	public String getBmi(String name, double kg, double cm) {
		
		String eval = "";
		
		double bmi = kg / ((cm*0.01)*(cm*0.01));
		if(bmi > 30) {
			 eval = "고도비만";
			}else if (bmi > 25) {
				 eval = "비만";
			}else if (bmi > 23) {
				 eval = "과체중";
			}else if (bmi > 18.5) { 
				 eval = "정상";
				}else { eval = "저체중";}
		
		String result = String.format("%s님은 %s입니다.", name, eval);
		return result;
	}
	
	public String getRank(double[] recode) {
		
		Scanner scanner = new Scanner (System.in);
		
		String[] name = {"A 선수" , "B 선수" , "C 선수" } ;
		
		
		
		String no1 = "", no2="" , no3="";
		double no1record=0 , no2record=0 , no3record=0 ;
		
		if (recode[0]<= recode[1]) {
			if(recode[0]<=recode[2]) {
				no1record = recode[0]; no1 = name[0];
			}else {
				no2record = recode[0]; no2 = name[0];
			}
		}else if(recode[0]<=recode[2]){
			no2record = recode[0]; no2 = name[0];
		}else {
			 no3record = recode[0] ; no3 = name[0];
		}
		
		if ( recode[0] == no1record ) {
			if(recode[1] <= recode[2]) {
				no2record = recode[1]; no2 = name[1];
				no3record = recode[2]; no3 = name[2];
			}else {
				no2record = recode[2]; no2 = name[2];
				no3record = recode[1]; no3 = name[1];
			}
		}else {
			if(recode[0] == no2record ) {
				if(recode[1] <= recode[2]) {
					no1record = recode[1]; no1 = name[1];
					no3record = recode[2]; no3 = name[2];
				}else {
					no1record = recode[2]; no1 = name[2];
					no3record = recode[1]; no3 = name[1];
				}
			}else {
				if(recode[1] <= recode[2]) {
					no1record = recode[1]; no1 = name[1];
					no2record = recode[2]; no2 = name[2];
				}else {
					no1record = recode[2]; no1 = name[2];
					no2record = recode[1]; no2 = name[1];
				}
			}
		}
		
		
		System.out.printf("1등 : %s 기록(%.1f초) %n",no1, no1record);
		System.out.printf("2등 : %s 기록(%.1f초) %n",no2, no2record);
		System.out.printf("3등 : %s 기록(%.1f초) %n",no3, no3record);
	
		
		return "등수를 계산중";
	}
	
	public void howMuch() {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("얼마에요?");
		int val = scanner.nextInt();
		System.out.printf("%s원 입니다. %n", val);
		System.out.println("몇 개 드릴까요?");
		int num = scanner.nextInt();
		System.out.printf("%s개 주세요.%n", num);
		
		int total = val * num ; 
		System.out.printf("총 금액은 %s원 입니다. %n", total);
		System.out.println("비싸요, 10% 깍아주세요.");
		
		int eval = total - (total/10) ;
		System.out.printf("그럼 %s원만 주세요. %n", eval);
		
	}
	
	public void getReportCard() {
		
		Scanner scanner = new Scanner (System.in);
		
		String[] subject = {"국어","영어","수학"};
		int[] score = new int[3];
		
		for(int i = 0 ; i <=2 ; i++) {
			System.out.printf("%s 점수를 입력하세요.\n", subject[i]);
			score[i] = scanner.nextInt();
		}
		
		int sum = score[0]+score[1]+score[2];
		int avg = sum/3 ;
		
		String eval = "";
		
			if(avg >= 90) {
			eval = "장학생";
		}else if(avg >=70) {
			eval = "합격";
		}else {
			eval = "불합격";
		}

		System.out.println("  학생명          국어          영어          수학          총점          평균          합격여부");
		System.out.println("====================================================");
		System.out.printf("   홍길동          %d     %d     %d     %d    %d      %s", score[0], score[1], score[2], sum, avg, eval);
		
	}
	
}

