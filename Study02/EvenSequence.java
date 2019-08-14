package Study02;

import java.util.Scanner ;

public class EvenSequence {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 수를 적으세요.");
		int a = scanner.nextInt();
		System.out.println("두 번째 수를 적으세요.");
		int b = scanner.nextInt();
		int start = 0 ;
		int end = 0 ;
		
		if(a <= b) {
			start = a ;
			end = b ;			
		}else {
			start = b ;
			end = a ;			
		}
		
		System.out.println(end);
		
		String sequence = "";
		int serise = 0;
		for (int i=start; i<=end ; i++) {
			
			if(i%2 != 1) {
				
				if(i != end) {
					sequence += i + " + ";
			}else {
				sequence += i + " = ";
			}
			serise += i ;
			}
			
		}
		System.out.println(sequence + serise);
	}

}
