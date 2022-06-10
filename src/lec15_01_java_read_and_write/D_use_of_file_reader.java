package lec15_01_java_read_and_write;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class D_use_of_file_reader {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\Users\\Tofael\\Desktop\\EnthrallIT\\April2022.txt";
		FileReader fileReader = new FileReader(path);
		System.out.println("FileReader find the location of the path as: " + path);
		// if FileReader can read the file, the above line will be executed
	}

}
