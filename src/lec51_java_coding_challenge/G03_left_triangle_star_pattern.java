package lec51_java_coding_challenge;

/*   Java Program to Print Right Triangle Star Pattern (Que: Atiqur Rahman)

* 
* * 
* * * 
* * * * 
* * * * *  

*/

public class G03_left_triangle_star_pattern {

	public static void StarleftTriangle(int n) {
		
		// check what happen if i=0
		for (int i = 1; i <= n; i++) { // Outer loop for rows

			for (int j = 1; j <= n - i; j++) { // Inner loop for space  
			System.out.print("   ");
			}
			for (int k = 1; k <= i; k++) { // Inner loop for columns
			System.out.print("* ");
			}
			System.out.println(); //throws the cursor in a new line after printing each line
			} 
	}

	// Driver Function
	public static void main(String args[]) {
		StarleftTriangle(5);

	}

}
