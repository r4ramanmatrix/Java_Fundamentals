package practice;

public class Constrc {

	private static Constrc cinst = null;

	public int id;
	private Constrc() {
		id=9911;
	}

	public static Constrc getInstance() {
		if(cinst==null) {
			cinst=new Constrc();
		}
		return cinst;
	}

	public static void main(String[] args) {

	}

}
