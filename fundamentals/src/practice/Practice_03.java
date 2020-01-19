package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practice_03 {

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
		int[] arr = { 2, 7, 2, 9, 11, 55, 99 };
		System.out.println("Array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practice_03 obj = new Practice_03();
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
		System.out.println("Array elements sorted: ");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("Sum of array elements: " + sum);
		System.out.println("Duplicate element in array: ");

		Set<Integer> intSet = new HashSet<Integer>();
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

		System.out.println("Largest element is: " + largest);
		System.out.println("Smallest element is: " + smallest);
		System.out.println("Average of array: " + sum / arr.length);
		System.out.println("Second highest element in an array: " + arr[arr.length - 2]);

		int no = 10;
		boolean isPresent = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == no) {
				isPresent = true;
			}
		}
		if (isPresent) {
			System.out.println(no + " present in array: " + isPresent);
		} else {
			System.out.println(no + " present in array: " + isPresent);
		}

		int number = 123456;
		int revNumber = 0;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reverse: " + revNumber);

		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact *= i;
		}
		System.out.println(factNumber + " factorial is: " + fact);

		int temp2 = 0;
		int isPrime = 10;
		for (int i = 2; i < isPrime; i++) {
			if (isPrime % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println(isPrime + " is a prime number");
		} else {
			System.out.println(isPrime + " is not a prime number");
		}
		System.out.println("int Values stored in Integer Wrapper class array: ");
		String[] sn = Integer.toString(revNumber).split("");
		Integer[] iArray = new Integer[sn.length];
		for (int i = 0; i < sn.length; i++) {
			iArray[i] = Integer.parseInt(sn[i]);
			System.out.println(iArray[i]);
		}

		int first = 0;
		int second = 1;
		int next;
		int fiboSeries = 10;
		System.out.println("Fibonacci Series: ");
		System.out.print(first + " " + second + " ");
		
		for (int i = 2; i < fiboSeries; i++) {
			next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
		}

		System.out.println("\n*******Array copy by using clone method********");
		int[] arr2 = arr.clone();
		for (int i : arr2) {
			System.out.println(i);
		}

		System.out.println("\n*******Array copy by using copyOf method********");
		int[] arr3 = Arrays.copyOf(arr2, arr2.length);
		for (int i : arr3) {
			System.out.println(i);
		}
		System.out.println("\n*******Array copy by using arraycopy method********");

		int[] arr4 = new int[arr3.length];
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		for (int i : arr4) {
			System.out.println(i);
		}

		String str1 = "java";
		String strReverse = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str1.charAt(i);
		}
		System.out.println("String str1 after reverse: " + strReverse);

		String str2 = "my name is java";
		System.out.println("Word reverse on their position: ");
		String[] str2Split = str2.split(" ");
		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		int count=0;
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("\nNumber of character in strSplit is: " + count);
		
		Set<Character> charSet=new LinkedHashSet<>();
		for(char ch:str2.toCharArray()) {
			charSet.add(ch);
		}
		
		StringBuilder sb=new StringBuilder();
		for(char ch: charSet) {
			sb.append(ch);
		}
		System.out.println("Non-repeating character in string: \n" + sb.toString());
		
		Map<Character, Integer> charMap=new LinkedHashMap<Character, Integer>();
		for(char ch: str2.toCharArray()) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		System.out.println("Count of occurence of character: \n" + charMap);
		
		String randomString="!@#r19a8%^$&%m8_+)a!%#n";
		System.out.println("Only String: " + randomString.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only Numbers: " + randomString.replaceAll("[^0-9]", ""));
		
	}

}
