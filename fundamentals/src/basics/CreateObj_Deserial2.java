package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CreateObj_Deserial2 {
	
	public static void main(String[] args) {
		String filePath="C:\\Users\\ramankumar\\Downloads\\file.txt";
		CreateObj_Deserial1 obj=new CreateObj_Deserial1("Raman");
		
		try {
			FileOutputStream fos=new FileOutputStream(filePath);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			
			FileInputStream fis=new FileInputStream(filePath);
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			CreateObj_Deserial1 obj2=(CreateObj_Deserial1)ois.readObject();
			ois.close();
			
			obj2.m1();
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getStackTrace());
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
