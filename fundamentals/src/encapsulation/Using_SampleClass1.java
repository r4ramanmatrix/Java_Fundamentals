package encapsulation;

public class Using_SampleClass1 {
	
	public static void main(String[] args) {
		SampleClass1 sc1=new SampleClass1();
		sc1.setEmpId(8068731);
		sc1.setEmpName("Raman");
		sc1.setEmpMarks(100);
		
		System.out.println("Id is: " + sc1.getEmpId());
		System.out.println("Name is: " + sc1.getEmpName());
		System.out.println("Marks is: " + sc1.getEmpMarks());
		
		sc1.setEmpMarks(501);
		System.out.println("Marks is: " + sc1.getEmpMarks());
	}

}
