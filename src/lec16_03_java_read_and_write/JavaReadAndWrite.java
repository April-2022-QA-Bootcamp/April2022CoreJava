package lec16_03_java_read_and_write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class JavaReadAndWrite {

	public static void main(String[] args) {
		// for Mac user -- if the folder name is Alex -- /Users/YourName/Desktop/Alex
		File folder = new File("C:\\Users\\Tofael\\Desktop\\EnthrallQABootcamp");
		folder.mkdir(); // method to create folder
		if (folder.exists()) {
			System.out.println(folder.getName() + " folder is created in Desktop");
			File file = new File("C:\\Users\\Tofael\\Desktop\\EnthrallQABootcamp\\April2022Batch.txt"); // Nasir: .docx
																										// can't be
																										// open, why?
			try {
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace(); // 17 or 18 both are fine
				// System.out.println("The error message is: " + e);
			}
			if (file.exists()) {
				System.out.println(file.getName() + " file is created inside the folder");
				// learning from today
				System.out.println("<-- Please write something about the students -->");
				Scanner scanner = new Scanner(System.in);
				String userinput = scanner.nextLine();
				String path = "C:\\Users\\Tofael\\Desktop\\EnthrallQABootcamp\\April2022Batch.txt";
				try {
					Formatter formatter = new Formatter(path);
					formatter.format("%s", userinput); // %S give data in upper case, Que: why %s in lower case is not working
					formatter.close();
				} catch (Exception f) {
					f.printStackTrace();
				}
				System.out.println(
						"Now go to the Desktop, open the folder, then the file and see what is written in the file");

				FileReader fr = null;
				BufferedReader br = null;
				try {
					fr = new FileReader(path);
					System.out.println("FileReader find the location of the path as: " + path);
				} catch (FileNotFoundException g) {
					g.printStackTrace();
				}

				String data = " ";

				try {
					br = new BufferedReader(fr);
					while ((data = br.readLine()) != null) {
						System.out.println("The BufferedReader read the file and got : " + data);
					}
				} catch (IOException h) {
					h.printStackTrace();
				} finally {
					if(fr !=null) {
						fr = null;  // If fr is not null, make it null, mean close the resource.
					}
					if (br != null) {
						br = null;    // If br is not null, make it null, mean close the resource.
					}
				}
				scanner.close();
			}

		}

	}

}
