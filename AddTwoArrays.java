package practice;

public class AddTwoArrays {
	
public static void addTwo(int a[],int b[],int n) {
	int[] result = new int[n];
	for(int i=0;i<n;i++) {
		result[i] = a[i]+b[i];
		System.out.print(" "+result[i]);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {1,1,1,1};
	int b[]= {1,1,1,1};
	int n = 4;
	addTwo(a,b,n);
	}
	
}
