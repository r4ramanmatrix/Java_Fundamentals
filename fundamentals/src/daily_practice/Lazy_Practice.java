package daily_practice;

public class Lazy_Practice {
	
	private static Lazy_Practice lp=null;
	
	public String str;
	
	private Lazy_Practice() {
		str="lazy approach";
	}
	
	public static Lazy_Practice getInstance() {
		if(lp==null) {
			lp=new Lazy_Practice();
		}
		return lp;
	}

}
