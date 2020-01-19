package practice;

import java.util.HashSet;
import java.util.Set;

public class Practice_08 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 5, 5, 6 };
		Set<Integer> intSet = new HashSet<>();
		for (Integer i : arr) {
			intSet.add(i);
		}
		System.out.println(intSet);
		Practice_08.uniqueMethods(arr, arr.length);
	}

	public static void uniqueMethods(int[] num, int lengths) {
		for (int i = 0; i < lengths; i++) {
			int j;
			
			for (j = 0; j < i; j++)
				if (num[i] == num[j]) {
					break;
				}
			if (i == j) {
				System.out.print(num[i] + " ");
			}

		}
	}

}
