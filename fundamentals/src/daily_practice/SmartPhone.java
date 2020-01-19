package daily_practice;

public class SmartPhone extends Anonymous_Concrete{
	public static void main(String[] args) {
		
		Anonymous_Concrete obj = new Anonymous_Concrete() {
			
			public void mobileFunctions() {
				System.out.println("SMS");
				System.out.println("Camera");
				System.out.println("Calendar");
				System.out.println("Maps");
				System.out.println("Browser");
			}
		};
		obj.mobileFunctions();
	}

}
