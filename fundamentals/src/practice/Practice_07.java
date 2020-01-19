package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice_07 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array Elements reverse: ");

		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 55, 2, 11, 77, 5, 2 };
		System.out.println("Array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practice_07 obj1 = new Practice_07();
		obj1.m1(arr, arr.length);

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
		System.out.println("Sorted array: ");
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
		System.out.println("Average of array: " + sum / arr.length);
		System.out.println("Second highest element in an array: " + arr[arr.length - 2]);
		Set<Integer> intSet2 = new HashSet<>();
		for (int i : arr) {
			if (intSet2.add(i) == true) {
				System.out.println(i);
			}
		}
		int number = 12345;
		int revNumber = 0;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Reverse number: " + revNumber);

		int temp2 = 0;
		int primeNumber = 100;
		System.out.println("Prime number from 1 to 100: ");
		for (int i = 1; i < primeNumber; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + " ");
			}
		}

		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);

		System.out.println("*******Array copy using clone********");
		int[] arr2 = arr.clone();
		for (int i : arr2) {
			System.out.println(i);
		}
		System.out.println("*******Array copy using copyOf********");
		int[] arr3 = Arrays.copyOf(arr2, arr2.length);
		for (int i : arr3) {
			System.out.println(i);
		}
		System.out.println("*******Array copy using System.arraycopy********");
		int[] arr4=new int[arr3.length];
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		for (int i : arr4) {
			System.out.println(i);
		}
		int valuePresent=77;
		boolean isPresent=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==valuePresent) {
				isPresent=true;
			}
		}if(isPresent) {
			System.out.println(valuePresent + " is present in array: " + isPresent);
		}else {
			System.out.println(valuePresent + " is present in array: " + isPresent);
		}
		
		
	}

}
