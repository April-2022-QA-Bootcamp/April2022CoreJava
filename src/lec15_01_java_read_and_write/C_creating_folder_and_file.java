package lec15_01_java_read_and_write;

import java.io.File;
import java.io.IOException;

public class C_creating_folder_and_file {
	public static void main(String[] args) {
		// Creating Folder
		// for Mac user -- if the folder name is Alex -- /Users/YourName/Desktop/Alex
		File folder = new File("C:\\Users\\Tofael\\Desktop\\EnthrallIT");
		folder.mkdir();
		if(folder.exists()) {
			System.out.println(folder.getName() + " folder is created.");
			// Creating File
			File file = new File("C:\\Users\\Tofael\\Desktop\\EnthrallIT\\April2022.txt");
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("The error message is: " + e);
			}
			if(file.exists()) {
				System.out.println(file.getName() + " file is created.");
			}			
		} else {
			System.out.println("Folder is not created");
		}

	}
}
