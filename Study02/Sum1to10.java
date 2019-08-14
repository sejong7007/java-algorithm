package Study02;

public class Sum1to10 {

	public static void main(String[] args) {
			// 1 + 2 + 3 + 4 + 
		
		String eval = "";
		int sum = 0 ;
		
		for(int i=1; i<=10;i++) {
			
			
			if (i==10) {
				
				eval += i + " = ";
				
			}else {
				
				eval += i + " + ";
				
			}
			sum += i ;
		}
		
		System.out.print(eval + sum);
	}

}
