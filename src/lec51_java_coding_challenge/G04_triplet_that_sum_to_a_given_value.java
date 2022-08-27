package lec51_java_coding_challenge;

/*   Find a triplet that sum to a given value (Sazzad)

Input: A[] = {1, 4, 45, 6, 10, 8 }, sum = 22; 
Output: ?
					
					1          4         45         6        10         8
										
*/

public class G04_triplet_that_sum_to_a_given_value {

	static int A[] = { 1, 4, 45, 6, 10, 8 };
	static int sum = 22;
	static int size = A.length;

	// returns true if there is triplet equal to sum
	public static boolean find3Numbers(int A[], int size, int sum) {
		// Fix the first element as A[i]
		for (int i = 0; i < size - 2; i++) {

			// Fix the second element as A[j]
			for (int j = i + 1; j < size - 1; j++) {

				// Now look for the third number
				for (int k = j + 1; k < size; k++) {
					if (A[i] + A[j] + A[k] == sum) {
						System.out.print("Triplets are:::> " + A[i] + ", " + A[j] + ", " + A[k]);
						return true;
					}
				}
			}
		}
		// If we reach here, then no triplet was found
		return false;
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		find3Numbers(A, size, sum);
	}
}
