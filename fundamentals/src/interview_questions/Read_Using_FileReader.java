package interview_questions;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class Read_Using_FileReader {

	public static void main(String[] args) {
		FileReader file = null;
		StringBuilder sb = null;
		FileWriter fw=null;
		try {
			file = new FileReader("File_Data\\HashMap.txt");
			sb = new StringBuilder();

			int i;
			while ((i = file.read()) != -1) {
				System.out.print((char) i);
				sb.append(String.valueOf((char) i));
			}
			String line = sb.toString();
			System.out.println(line);
			String[] lineSplit = line.split(" ");
			String[] reverseString = { "the", "HashMap", "and", "data", "you", "two", "for", "an", "ultimate", "that" };
			List li = Arrays.asList(reverseString);
			String sb2 = "";
			for (String s1 : lineSplit) {
				if (li.contains(s1)) {
					System.out.print(new StringBuffer(s1).reverse() + " ");
					sb2 += " " + new StringBuffer(s1).reverse().toString();
				} else {
					System.out.print(s1 + " ");
					sb2 += " " + s1;
				}
			}
			fw=new FileWriter("File_Data\\HashMap3.txt");
			fw.write(sb2);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				file.close();
				fw.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
