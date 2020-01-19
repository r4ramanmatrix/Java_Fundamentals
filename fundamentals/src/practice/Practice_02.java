package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practice_02 {

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

	public static void main(String[] args) {
		int[] arr = { 1, 7, 2, 9, 10, 11, 2 };

		System.out.println("Array elements are: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practice_02 obj = new Practice_02();
		obj.m1(arr, arr.length);

		int temp = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Array Elements sorted: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("Sum of array elemenets are: " + sum);

		System.out.println("Average of array: " + sum / arr.length);

		System.out.println("Second highest array elements: " + arr[arr.length - 2]);

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
		System.out.println("Duplicate element in an array: ");
		Set<Integer> intSet = new HashSet<>();
		for (int i : arr) {
			if (intSet.add(i) == false) {
				System.out.println(i);
			}
		}

		int numing = 12;
		boolean isPresent = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == numing) {
				isPresent = true;
			}
		}
		if (isPresent) {
			System.out.println(numing + " Present in array: " + isPresent);
		} else {
			System.out.println(numing + " Present in array: " + isPresent);
		}

		int number = 12345;
		int revNumber = 0;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reversing: " + revNumber);

		System.out.println("int value to Integer array: ");
		String[] sn = Integer.toString(revNumber).split("");
		Integer[] Iarray = new Integer[sn.length];
		for (int i = 0; i < sn.length; i++) {
			Iarray[i] = Integer.parseInt(sn[i]);
			System.out.println(Iarray[i]);
		}

		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact *= i;
		}
		System.out.println("Factorial is: " + fact);

		int temp2 = 0;
		int primeNumber = 53;

		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Not a prime number");
		}

		String str1 = "java";
		String str1Reverse = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			str1Reverse = str1Reverse + str1.charAt(i);
		}
		System.out.println("String str1 after reverse: " + str1Reverse);

		System.out.println("String reverse on their position: ");

		String str2 = "hallo world, java welcomes you";
		String[] str2Split = str2.split(" ");
		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
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
		System.out.println("\nOnly uqniue character from string: \n" + sb.toString());

		Map<Character, Integer> charMap = new LinkedHashMap<>();
		for (char ch : str2.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println("Number of occurence of character in a string: \n" + charMap);

		System.out.println("******Copy of array using clone*********");
		int[] arr2 = arr.clone();
		for (int i : arr2) {
			System.out.println(i);
		}

		System.out.println("******Copy of array using copyof*********");
		int[] arr3 = Arrays.copyOf(arr, arr.length);
		for (int i : arr3) {
			System.out.println(i);
		}

		System.out.println("******Copy of array using System.arraycopy*********");
		int[] arr4 = new int[arr3.length];
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		for (int i : arr4) {
			System.out.println(i);
		}

		String randomString = "!@#r$1#@a*&^m988a^&^&n";
		System.out.println("Only String: " + randomString.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only Number: " + randomString.replaceAll("[^0-9]", ""));

	}

}
