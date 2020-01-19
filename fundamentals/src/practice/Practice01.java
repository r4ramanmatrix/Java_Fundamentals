package practice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practice01 {
	
	public void m1(int[] num, int lengths) {
		int[] a=new int[lengths];
		int j=lengths;
		
		for(int i=0;i<num.length;i++) {
			a[j-1]=num[i];
			j=j-1;
		}
		
		System.out.println("Array elements reversed: ");
		
		for(int i=0;i<num.length;i++) {
			System.out.println(a[i]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr= {2,3,4,1,5,3};
		System.out.println("Array elements are: " );
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		
		Practice01 obj=new Practice01();
		obj.m1(arr, arr.length);
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array elements sorted: " );
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Duplicate element in an array: ");
		
		Set<Integer> intSet=new HashSet<Integer>();
		for(int i:arr) {
			if(intSet.add(i)==false) {
				System.out.println(i);
			}
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println("Sum of array elements: " + sum);
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		
		System.out.println("Largest element in an array: " + largest);
		System.out.println("Smallest element in an array: " + smallest);
		System.out.println("Second highest element in an array: " + arr[arr.length-2]);
		System.out.println("Average of an array: "+ sum/arr.length);
		
		int number=121213;
		int revNumber=0;
		int temp2=number;
		while(number!=0) {
			revNumber=revNumber*10+number%10;
			number=number/10;
		}
		System.out.println("Number after reverse: " + revNumber);
		if(temp2==revNumber) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Not a palindrome number");
		}
		
		int fact=1;
		int factNumber=6;
		for(int i=1;i<=factNumber;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " + factNumber + " is: " + fact);
		
		int temp3=0;
		int primeNumber=73;
		for(int i=2;i<primeNumber;i++) {
			if(primeNumber%i==0) {
				temp3=temp3+1;
			}
		}if(temp3==0) {
			System.out.println(primeNumber + " is a Prime Number");
		}else {
			System.out.println(primeNumber+" Not a Prime Number");
		}
				
		System.out.println("Fibonacci Series is: ");
		int first=0;
		int second=1;
		System.out.print(first + " " + second + " " );
		int next;
		int fiboSeries=10;
		for(int i=2;i<fiboSeries;i++) {
			next=first+second;
			System.out.print(next + " ");
			first=second;
			second=next;
		}System.out.println();
		
		String str1="Java";
		String str1Rev="";
		for(int i=str1.length()-1;i>=0;i--) {
			str1Rev=str1Rev+str1.charAt(i);
		}
		System.out.println("Str1 after reverse: " + str1Rev);
		
		System.out.println("String reversed on their location: ");
		String str2="This is Java World";
		String[] str2Split=str2.split(" ");
		for(int i=0;i<str2Split.length;i++) {
			for(int j=str2Split[i].length()-1;j>=0;j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		System.out.println();
		Set<Character> charSet=new LinkedHashSet<Character>();
		for(char ch: str2.toCharArray()) {
			charSet.add(ch);
		}
		
		StringBuilder sb=new StringBuilder();
		for(char ch:charSet) {
			sb.append(ch);
		}
		System.out.println("Only unique character from a string: \n" + sb.toString());
		
		Map<Character, Integer> charMap=new LinkedHashMap<Character, Integer>();
		for(char ch: str2.toCharArray()) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		System.out.println("Character count: \n" + charMap);
		
		String random="1J24!@A$.25V&*^A911^";
		//Only String
		System.out.println(random.replaceAll("[^a-zA-Z]", ""));
		
		//Only number
		System.out.println(random.replaceAll("[^0-9]", ""));
		
		String name1="Java";
		String name2="Selenium";
		
		System.out.println("Before swapping name1: " + name1);
		System.out.println("Before swapping name2: " + name2);
		
		name1=name1+name2;
		name2=name1.substring(0, name1.length()-name2.length());
		name1=name1.substring(name2.length());
		
		System.out.println("After swapping name1: " + name1);
		System.out.println("After swapping name2: " + name2);
	}

}

