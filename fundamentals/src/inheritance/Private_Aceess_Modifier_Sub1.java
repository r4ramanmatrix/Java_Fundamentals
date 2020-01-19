package inheritance;

public class Private_Aceess_Modifier_Sub1 extends Private_Aceess_Modifier_Super1 {

	String color;

	public Private_Aceess_Modifier_Sub1(String color) {
		this.color = color;
	}
	
	public void ride() {
		/*
		 * System.out.println("Gear in the cycle: " + gear);
		 * System.out.println("Speed of the cycle: " + tyre);
		 * System.out.println("Brand of the cycle: " + brand);
		 */
		System.out.println("Color of the cycle: " + color);
	}
	
	public void m1() {
		System.out.println("Child");
	}
	
	public void m2() {
		//System.out.println("Child public");
		super.m2();
	}
	
	public static void main(String[] args) {
		Private_Aceess_Modifier_Super1 obj=new Private_Aceess_Modifier_Sub1("Green");
		obj.m2();
		
		
	}

}
