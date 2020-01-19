package basics;

public class Local_Classes {
	
	private void getValue() {
		int sum=20;
		
		class Inner{
			public int divisor;
			public int remainder;
			
			public Inner() {
				divisor=4;
				remainder=sum%divisor;
			}

			private int getDivisor() {
				return divisor;
			}

			private int getRemainder() {
				return sum%divisor;
			}

			public int getQuotient() {
				System.out.println("Inside inner class");
				return sum/divisor;
			}
			
			
		}
		
		Inner in=new Inner();
		System.out.println("Divisor is: " + in.getDivisor());
		System.out.println("Remainder is: " + in.getRemainder());
		System.out.println("Quotient is: " + in.getQuotient());
	}
	
	public static void main(String[] args) {
		Local_Classes lobj=new Local_Classes();
		lobj.getValue();
		
	}
	

}
