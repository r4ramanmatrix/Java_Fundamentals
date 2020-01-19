package basics;

public class CreateObj_ForName {

	public void display() {
		System.out.println("Display Method");
	}

	public static void display(String name) {
		System.out.println("Name is : " + name);
	}
	
	public void m1(int[] num, int lengths) {
		int[] a=new int[lengths];
		int j=lengths;
		
		for(int i=0;i<num.length;i++) {
			a[j-1]=num[i];
			j=j-1;
		}
		System.out.println("Array elements reversed: ");
		for(int i=-0;i<num.length;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		CreateObj_ForName obj = (CreateObj_ForName) Class.forName("basics.CreateObj_ForName").newInstance();
		CreateObj_ForName.display("Raman");
		obj.display();
		int[] arr= {2,1,3,4,2,5};
		obj.m1(arr, arr.length);
		
	}

}
