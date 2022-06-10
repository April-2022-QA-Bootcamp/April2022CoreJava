package lec15_01_java_read_and_write;

import java.io.File;
import java.io.IOException;

// Kabir was asking for this and he sent this code to me.
public class D_creating_folder_and_file {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Tofael\\Desktop\\Enthrall\\Students.txt");
		try {
			file.getParentFile().mkdir();
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("The error message is: " + e);
		}

	}
}
