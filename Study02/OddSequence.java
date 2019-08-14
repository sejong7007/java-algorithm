package Study02;
import java.util.Scanner ;

public class OddSequence {

	public static void main(String[] args) {
		// 1 + 3 + 5 + 7 + 9 =
		// i % 2 = 0 이면 짝수 1 이면 홀수
		Scanner scanner = new Scanner (System.in);
        System.out.println("=============================");
        System.out.println("첫번째 입력된 수와 두번째 입력한 값 사이의 홀수 값들의 합");
        System.out.println("=============================");
     
          System.out.println("첫번째 수");
          int start = scanner.nextInt();
          System.out.println("두번째 수");
          int end = scanner.nextInt();
          
          String sequence = "";
          int serise = 0 ;
          for (int i = start ; i <= end ; i++) {
        	  if(i%2 != 0) {
        		  
        	  }
          }
          System.out.println(sequence + serise);
		
	}
}
	