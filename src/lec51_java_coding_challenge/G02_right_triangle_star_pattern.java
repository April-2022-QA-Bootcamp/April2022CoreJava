package lec51_java_coding_challenge;

/*   Java Program to Print Right Triangle Star Pattern (Que: Atiqur Rahman)

* 
* * 
* * * 
* * * * 
* * * * *  

*/

public class G02_right_triangle_star_pattern {

	public static void rightTriangleStar (int n) {
		// outer loop to handle number of rows
		for (int i = 0; i < n; i++) { // 0, 1, 2, 3, 4 // 0, 1, 2, 3 // 0, 1, 2 , ........
			// inner loop to handle number of columns
			for (int k = 0; k <= i; k++) { // 0, // 0, 1 // 0, 1, 2 ..........
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		rightTriangleStar(5);

	}

}
