package basics;

public class Using_SingleLoop_Sorting {
	
	public static void main(String[] args) {
		int[] arr= {11,2,3,4,5,6};
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				arr[i]=arr[i]+arr[i-1];
				arr[i-1]=arr[i]-arr[i-1];
				arr[i]=arr[i]-arr[i-1];
				i=0;
			}
		}
		
		System.out.println("Sorted array: ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
