package practice;

public class ArrayBasicOperation {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int i =0;i<arr.length;i++) {	
			arr[i]= i;
		}
		
		for(int i =0;i<arr.length;i++) {	
			System.out.print("Array is elements is  " + i);
			System.out.println();
		}

	}

}
