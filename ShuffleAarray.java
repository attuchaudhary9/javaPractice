package practice;

import java.util.*;

public class ShuffleAarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size");
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int r : arr) {
			System.out.print(r);
		}

		System.out.println("result array");
		int[] result = shuffle(arr, arr.length / 2);

		for (int r : result) {
			System.out.print(r);
		}

	}

	public static int[] shuffle(int[] arr, int n) {
		int len = 2 * n;
		int p1 = 0;
		int p2 = n;
		int ansP = 0;
		int ans[] = new int[len];
		while (ansP < len) {
			ans[ansP++] = arr[p1++];
			ans[ansP++] = arr[p2++];

		}

		return ans;
	}

}
