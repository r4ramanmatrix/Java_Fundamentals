package daily_practice;

public class Eager_Approach {

	private static Eager_Approach eager = new Eager_Approach();

	public String str;

	private Eager_Approach() {
		str = "this is eager approach";
	}

	public static Eager_Approach getInstance() {
		return eager;
	}
}
