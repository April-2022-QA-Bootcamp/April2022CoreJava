package lec15_01_java_read_and_write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E_use_of_buffered_reader {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Tofael\\Desktop\\EnthrallIT\\April2022.txt";
		FileReader fr = new FileReader(path);
		System.out.println("FileReader find the location of the path as: " + path);
		// if FileReader can read the file, the above line will be executed
		// TODO: Nasir, why Buffered READER needs File Reader?
		BufferedReader br = new BufferedReader(fr);
		String data = " ";
		while ((data = br.readLine()) !=null) {
			System.out.println("The BufferedReader read the file and got : " + data);
		}

	}

}
