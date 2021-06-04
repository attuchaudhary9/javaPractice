package practice;
import java.util.*;

public class MultiDimesionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first row");
		int rowOne = sc.nextInt();
		System.out.println("Enter first coloum");
		int coloumOne = sc.nextInt();
		System.out.println("Enter Second row");
		int rowSecond = sc.nextInt();
		System.out.println("Enter Second coloum");
		int coloumSecond = sc.nextInt();
		int[][] arrOne = new int[rowOne][coloumOne];
		int[][] arrTwo = new int[rowSecond][coloumSecond];
		
		//check the arrays coloum and row
		
		if(coloumOne != rowSecond) {
			System.out.println("Row and coloum is not macthed");
			return;
		}
		int[][] result = new int[rowOne][coloumSecond];
		
		//entering the values in array one
		System.out.println("Enter First Array : ");
		for(int i=0;i<rowOne;i++) {
			for(int j=0;j<coloumOne;j++) {
				arrOne[i][j]= sc.nextInt();
			}
		}
		
		//entering the values in array second
		System.out.println("Enter Second Array : ");
		for(int i=0;i<rowSecond;i++) {
			for(int j=0;j<coloumSecond;j++) {
				arrTwo[i][j]= sc.nextInt();
			}
		}
		
		//multiplication of array 
		for(int i=0;i<rowOne;i++) {
			for(int j=0;j<coloumSecond;j++) {
				for(int k =0;k<rowSecond;k++) {
					result[i][j] += arrOne[i][k]*arrTwo[k][j];
				}
			}
		}
		
		
		//result of multiply of two array
		System.out.println("Result of two Array is : ");
		for(int i=0;i<rowOne;i++){  
			 for(int j=0;j<coloumSecond;j++){  
			   System.out.print(result[i][j]+" ");  
			 }  
			 System.out.println();  
			}

	}

}
