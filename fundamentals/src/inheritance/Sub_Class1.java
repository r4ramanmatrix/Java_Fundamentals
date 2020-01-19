package inheritance;

public class Sub_Class1 extends Super_Class1{
	
	String color;
	
	public Sub_Class1(String color) {
		this.color=color;
	}
	
	public void ride() {
		System.out.println("Gear in the cycle: " + gear);
		System.out.println("Speed of the cycle: " + speed);
		System.out.println("Brand of the cycle: " + brand);
		System.out.println("Color of the cycle: " + color);
	}

}
