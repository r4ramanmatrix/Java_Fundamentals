package inheritance;

public class Private_Aceess_Modifier_Super1 {
	
	private int gear;
	private int tyre;
	private String brand;
	
	public Private_Aceess_Modifier_Super1() {
		
	}
	
	public Private_Aceess_Modifier_Super1(int gear, int tyre, String brand) {
		this.gear=gear;
		this.tyre=tyre;
		this.brand=brand;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int gear) {
		this.gear=gear;
	}
	
	public int gettyre() {
		return tyre;
	}
	
	public void setTyre(int tyre) {
		this.tyre=tyre;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	private void m1() {
		System.out.println("Hallo i'm private");
	}
	
	public void m2() {
		System.out.println("Hallo i'm public");
	}
	

}
