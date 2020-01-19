package daily_practice;

public class Lazy_Approach {
	
	private static Lazy_Approach lazy=null;
	
	public String str;
	
	private Lazy_Approach() {
		str="THIS IS LAZY APPROACH";
	}
	
	public static Lazy_Approach getInstance() {
		if(lazy==null) {
			lazy=new Lazy_Approach();
		}
		return lazy;
	}
		

}
