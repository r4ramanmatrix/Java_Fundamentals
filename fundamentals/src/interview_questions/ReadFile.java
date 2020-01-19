package interview_questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		String path="C:\\tool_s\\My_Space\\fundamentals\\File_Data\\HashMap.txt";

		BufferedReader bf;

		try {
			bf = new BufferedReader(new FileReader(path));
			String line=bf.readLine();
			while(line!=null) {
				System.out.println(line);
				line=bf.readLine();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("*********Using Scanner Class*********");
		try {
		Scanner scan=new Scanner(new File(path));
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
