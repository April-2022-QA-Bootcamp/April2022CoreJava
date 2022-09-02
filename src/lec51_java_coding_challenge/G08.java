package lec51_java_coding_challenge;

public class G08 {

	static int[] array = { 2, 3, 5, 4, 3, 4, 1, 3 };
    static int size = array.length;

    public static void findSingle(int[] array) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i] == array[j] && i != j) {
                    break;
                }else if (j == size - 1) {
                    System.out.println("Elements occurring once are: " + array[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        findSingle(array);
    }
}
