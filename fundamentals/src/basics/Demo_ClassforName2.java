package basics;

import java.util.Scanner;

public class Demo_ClassforName2 {
	
	public void m1() {
		System.out.println("show");
	}
	
	
	
	public static void main(String[] args) {
		String className="";
		Scanner sin=new Scanner(System.in);
		System.out.print("Please enter the class name with package name: ");
		className=sin.nextLine();
		try {
			Class cls=Class.forName(className);
			Object objt=cls.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
