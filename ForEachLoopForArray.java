package practice;

public class ForEachLoopForArray {

	public static void main(String[] args) {
		int[] arr = {12,14,65,78,3,25};
//		addon(arr);
		int[] arr1 = returnAarray();
		for(int n : arr1) {
			System.out.println(n);
		}

	}
	static void addon(int[] arr) {
		for(int n:arr) {
			int result = n*2;
			System.out.print(" "+result);
			
		}
		
	}
	static int[] returnAarray() {
	int arr[] = {12,54,87,36};
		return arr;
	}

}
