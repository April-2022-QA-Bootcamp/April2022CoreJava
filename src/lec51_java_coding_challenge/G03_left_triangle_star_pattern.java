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
		int i, j;

		// 1st loop
		for (i = 0; i< n; i++) {

			// nested 2nd loop
			for (j = 2 * (n - i); j >= 0; j--) {
				// printing spaces
				System.out.print(" ");
			}

			// nested 3rd loop
			for (j = 0; j <= i; j++) {
				// printing stars
				System.out.print("*");
			}

			// end-line
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[]) {
		StarleftTriangle(5);

	}

}
