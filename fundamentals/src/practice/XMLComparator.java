/*package practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;

public class XMLComparator {

	public static void main(String[] args) throws Exception {
		FileInputStream fis1 = new FileInputStream("C:\\Users\\ramankumar\\Desktop\\one.xml");
		FileInputStream fis2 = new FileInputStream("C:\\Users\\ramankumar\\Desktop\\Two.xml");

		BufferedReader source = new BufferedReader(new InputStreamReader(fis1));
		BufferedReader target = new BufferedReader(new InputStreamReader(fis2));

		XMLUnit.setIgnoreWhitespace(true);

		List differences = compareXML(source, target);
		
		printDifference(differences);

	}

	public static List compareXML(Reader source, Reader target) throws Exception {
		Diff xmldiff = new Diff(source, target);
		DetailedDiff detailXmlDiff = new DetailedDiff(xmldiff);
		return detailXmlDiff.getAllDifferences();

	}

	public static void printDifference(List differences) {
		int totalDifference = differences.size();
		System.out.println("=======================");
		System.out.println("Total Difference: " + totalDifference);
		System.out.println("========================");

		for (Object differ : differences) {
			System.out.println(differ);
		}
	}



}
*/