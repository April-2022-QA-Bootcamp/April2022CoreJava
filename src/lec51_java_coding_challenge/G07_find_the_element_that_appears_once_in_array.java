package lec51_java_coding_challenge;

public class G07_find_the_element_that_appears_once_in_array {

	// TODO Nasir, not working
	static int[] array = { 2, 3, 5, 4, 5, 3, 4, 1, 3 };
	static int size = array.length;

	public static void findSingle(int[] array) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size - 1; j++) {
				if (array[i] == array[j]) {
					break;
				} else if (j== size - 1) {
					System.out.println("Elelments occuring once are: " + array[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		findSingle(array);
	}
}
