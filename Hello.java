
package practice;
import java.util.*;
public class Hello {

	public static void main(String[] args) {
	//Table 1 to 10
//		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
//		System.out.print("Enter first ");  
//		int a= sc.nextInt(); 
//		for(int i = 1; i<=10;i++) {
//			int s = i*a;
//			System.out.println(s);
//		}
		
		
		
		//Switch Statements
		
		int x = 5;
		switch(x) {
		case 0 :
			System.out.print("Value is 0");
			break;
		case 1:
			System.out.print("Value is 1");
			break;
		case 2:
			System.out.print("Value is 2");
			break;
			default:
				System.out.print("Value is invalid");
		}
		
	}

}
