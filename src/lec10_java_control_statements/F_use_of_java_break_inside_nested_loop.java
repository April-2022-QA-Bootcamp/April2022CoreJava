package lec10_java_control_statements;

public class F_use_of_java_break_inside_nested_loop {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) { // 1, 2, 3  --- outer loop
			for (int j=1; j<=3; j++) { // 1, 2, 3  --- inner loop
				if (i==2 && j==2) { // 1 1, 1 2, 1 3, 2 1, 3 1, 3 2, 3 3
					// inner loop will be break at 2 2, so, no outcome as 2 3, 
					// so inner loop break but go back to out loop for 3 and get the value of 3 1, 3 2 , 3 3
					break;
				}				
				System.out.println(i + " " + j);
			} 			
		}

	}

}
