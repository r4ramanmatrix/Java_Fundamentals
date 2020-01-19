package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practice_04 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements reversed: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 8, 5, 4, 9, 4 };
		System.out.println("Array elements are: ");
		for (int i : arr) {
			System.out.println(i);
		}

		Practice_04 obj = new Practice_04();
		obj.m1(arr, arr.length);

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int sum = 0;
		System.out.println("Array elements sorted: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("Duplicate element in an array: ");
		Set<Integer> intSet = new HashSet<>();
		for (int i : arr) {
			if (intSet.add(i) == false) {
				System.out.println(i);
			}
		}
		System.out.println("Sum of array elements are: " + sum);
		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest element in an array: " + largest);
		System.out.println("Smallest element in an array: " + smallest);
		System.out.println("Average of array: " + sum / arr.length);

		int nums = 5;
		boolean isPresent = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == nums) {
				isPresent = true;
			}
		}
		if (isPresent) {
			System.out.println(nums + " is present in an array: " + isPresent);
		} else {
			System.out.println(nums + " is present in an array: " + isPresent);
		}

		int temp2 = 0;
		int isPrime = 11;
		for (int i = 2; i < isPrime; i++) {
			if (isPrime % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not Prime");
		}

		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact *= i;
		}
		System.out.println("Factorial is: " + fact);

		int first = 0;
		int second = 1;
		int next;
		int fiboSeries = 10;
		System.out.print(first + " " + second + " ");
		for (int i = 2; i < fiboSeries; i++) {
			next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
		}
		System.out.println();

		String str1 = "java";
		String revString = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			revString = revString + str1.charAt(i);
		}
		System.out.println("str1 After reverse: " + revString);

		System.out.println("String statement reverse on their position: ");
		String str2 = "welcome to year 2020";
		String[] strSplit = str2.split(" ");
		for (int i = 0; i < strSplit.length; i++) {
			for (int j = strSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(strSplit[i].charAt(j));
			}
			System.out.print(" ");
		}

		Set<Character> charSet = new LinkedHashSet<>();
		for (char ch : str2.toCharArray()) {
			charSet.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		for (char ch : charSet) {
			sb.append(ch);
		}
		System.out.println("Only unqiue character from a string: \n" + sb.toString());

		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (char ch : str2.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println("Count of occurence of character in an string: \n" + charMap);

		String name1 = "java";
		String name2 = "java8";

		System.out.println("Name1 before swapping: " + name1);
		System.out.println("Name2 before swapping: " + name2);
		
		name1=name1+name2;
		name2=name1.substring(0, name1.length()-name2.length());
		name1=name1.substring(name2.length());
		
		System.out.println("Name1 after swapping: " + name1);
		System.out.println("Name2 after swapping: " + name2 + "\n");

		System.out.println("*********Copy of array using clone************");
		int[] arr2 = arr.clone();
		for (int i : arr2) {
			System.out.println(i);
		}
		
		System.out.println("*********Copy of array using copyOf************");
		int[] arr3 = Arrays.copyOf(arr2, arr2.length);
		for (int i : arr3) {
			System.out.println(i);
		}
		
		System.out.println("*********Copy of array using System.arraycopy************");
		int[] arr4=new int[arr3.length];
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		for (int i : arr4) {
			System.out.println(i);
		}
	}

}
