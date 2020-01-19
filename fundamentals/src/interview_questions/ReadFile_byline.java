package interview_questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile_byline {

	static String path = "File_Data/HashMap.txt";

	public static void main(String[] args) {
		BufferedReader reader=null;

		try {
			reader = new BufferedReader(new FileReader(path));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				break;
			}
			
		} catch (Exception e) {
			try {
			reader.close();
			}catch(Exception e1) {
				System.out.println(e1.getMessage());
			}
			System.out.println(e.getMessage());
		}

		System.out.println("**********Using Scanner Class***********");
		try {
			Scanner scan = new Scanner(new File(path));
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
