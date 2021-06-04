package practice;
import java.util.*;

public class FunctionInJava {
//	public static void add(int x ,int y) {
//		System.out.print(x+y);
//	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		FunctionInJava obj = new FunctionInJava();
		System.out.print("Enter first Number");
		int x =sc.nextInt();
		System.out.print("Enter second Number");
		int y =sc.nextInt();
		int result_via_function = obj.add(x, y);
		System.out.print(result_via_function);
	
	}

	public int add(int x ,int y) {
		int result = x+y;
		return result;
	}
}
