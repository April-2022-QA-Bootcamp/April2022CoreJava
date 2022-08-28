package lec51_java_coding_challenge;

/*   Find a triplet that sum to a given value (Sazzad)

Input: A[] = {1, 4, 45, 6, 10, 8 }, sum = 22; 
Output: ?
					
					1          4         45         6        10         8
										
*/

public class G06_count_all_distinct_pairs_with_difference_equal_to_n {

	static int[] array = { 1, 5, 3, 4, 2 };
	static int difference = 2;
	static int size = array.length;

	public static int find3Numbers(int[] array, int size, int difference) {
		int count = 0;
		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {
				if (array[i] - array[j] == difference || array[j] - array[i] == difference) {
					count++;
					System.out.print("Count of pairs with given diff is :::> " + array[i] + ", " + array[j] + "\n");
				}
			}

		}
		return count;
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		find3Numbers(array, size, difference);
	}
}
