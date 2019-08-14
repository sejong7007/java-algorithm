package Study02;

public class Sum1to5 {

	public static void main(String[] args) {
			// 1 + 2 + 3 + 4 + 
			
		String eval = "";
		for(int i=1; i<=5;i++) {
			
			/**
			if (i==5) {
				
				result += i + " = ";
				
			}else {
				
				result += i + " + ";
				
			}
			 */
			
		eval += (i==5)? i + " = " : i + "+";	//3항 이용
			
		}

		System.out.println(eval);
		
	}

}
