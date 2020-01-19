package inheritance;

public class Using_Private_Aceess_Modifier {
	
	public static void main(String[] args) {
		Private_Aceess_Modifier_Sub1 obj=new Private_Aceess_Modifier_Sub1("Blue");
		obj.setTyre(2);
		obj.setGear(5);
		obj.setBrand("Hero");
		
		System.out.println("Gear in the cycle: " + obj.getGear());
		System.out.println("Tyre in the cycle: " + obj.gettyre());
		System.out.println("Brand of the cycle: " + obj.getBrand());
		System.out.println("Color of the cycle: " + obj.color);
	}

}
