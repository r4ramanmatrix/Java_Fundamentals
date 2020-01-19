package collection;

import java.util.Comparator;

public class Comparator_Usage_SortAge implements Comparator<Comparator_Usage> {

	@Override
	public int compare(Comparator_Usage o1, Comparator_Usage o2) {
		if(o1.getAge()>o2.getAge()) {
			return 1;
		}else if(o1.getAge()<o2.getAge())
			return -1;
		return 0;
	}

}
