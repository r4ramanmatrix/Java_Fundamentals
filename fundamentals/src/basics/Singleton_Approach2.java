package basics;

public class Singleton_Approach2 {
	
	private static Singleton_Approach2 sa=null;
	
	private Singleton_Approach2()
	{
		
	}
	
	public static Singleton_Approach2 getSingleton() {
		if(sa==null) {
			sa=new Singleton_Approach2();
		}
		return sa;
	}

}
