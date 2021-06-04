package practice;

import java.util.*;

public class TableOneToN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter last number ");
		int lastNumber = sc.nextInt();
		for (int i = startingNumber; i <= lastNumber; i++) {
			for (int j = 1; j <= 10; j++) {
				int result = i * j;
				System.out.print(" "+result);
			}
			System.out.println();
		}
	}

}
