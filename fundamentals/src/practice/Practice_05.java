package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practice_05 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}

		System.out.println("Array elements reverse: ");

		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void PermutationNumber(String prefix, String str) {
		if (str.length() == 0) {
			System.out.println(prefix + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			PermutationNumber(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
		}
	}

	public void printPermutation(String str) {
		PermutationNumber("", str);
	}

	public static void main(String[] args) {
		int[] arr = { 9, 5, 2, 8, 5, 11 };
		System.out.println("Array elements: ");
		for (int i : arr) {
			System.out.println(i);
		}

		Practice_05 obj = new Practice_05();
		obj.m1(arr, arr.length);
		obj.printPermutation("XYZ");

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
		System.out.println("Array elements sorted: ");
		int sum = 0;
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
		System.out.println("Sum of array elements: " + sum);
		System.out.println("Average of an array: " + sum / arr.length);
		System.out.println("Second largest element in an array: " + arr[arr.length - 2]);
		int nums = 99;
		boolean isPresent = false;
		for (int i = 0; i < arr.length; i++) {
			if (nums == arr[i]) {
				isPresent = true;
			}
		}
		if (isPresent) {
			System.out.println(nums + " is present in array? " + isPresent);
		} else {
			System.out.println(nums + " is present in array? " + isPresent);
		}

		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact *= i;
		}
		System.out.println("Factorial is: " + fact);

		int temp2 = 0;
		int primeNumber = 101;
		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

		String name = "java";
		String revName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			revName = revName + name.charAt(i);
		}
		System.out.println("Name after revese: " + revName);

		String str = "this is java life";
		String[] strSplit = str.split(" ");
		for (int i = 0; i < strSplit.length; i++) {
			for (int j = strSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(strSplit[i].charAt(j));
			}
			System.out.print(" ");
		}

		int number = 12345;
		int revNumber = 0;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("\nNumber after reverse: " + revNumber);

		Set<Character> charSet = new LinkedHashSet<>();
		for (char ch : str.toCharArray()) {
			charSet.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		for (char ch : charSet) {
			sb.append(ch);
		}
		System.out.println("Only unique character from string statement: \n" + sb.toString());

		Map<Character, Integer> charMap = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println("Count of occurence of each character: \n" + charMap);

		System.out.println("********Copy array using clone********");
		int[] arr2 = arr.clone();
		for (int i : arr2) {
			System.out.println(i);
		}

		System.out.println("********Copy array using copyOf********");
		int[] arr3 = Arrays.copyOf(arr2, arr2.length);
		for (int i : arr3) {
			System.out.println(i);
		}

		System.out.println("********Copy array using System.arraycopy********");
		int[] arr4 = new int[arr3.length];
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		for (int i : arr4) {
			System.out.println(i);
		}

		String name1 = "java";
		String name2 = "selenium";
		System.out.println("Name1 before swapping: " + name1);
		System.out.println("Name2 before swapping: " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("Name1 after swapping: " + name1);
		System.out.println("Name2 after swapping: " + name2);

		String random = "#$$R96%$A%$M5!@#A0^&*N";
		System.out.println("Only string value: " + (random.replaceAll("[^a-zA-Z]", "")));
		System.out.println("Only integer value: " + (random.replaceAll("[^0-9]", "")));
	}

}
