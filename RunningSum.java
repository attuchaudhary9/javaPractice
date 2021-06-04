package practice;

public class RunningSum {
	
 static int[] sum(int[] a) {
	 int runningSum =0;
	 int index =0;
	 
	 for(int i=0;i< a.length;i++) {
		 runningSum = a[i]+runningSum;
		 
		 a[index++]= runningSum;
	 }
	 return a;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,1,1};
		sum(a);
		
		for(int i=0;i< a.length;i++) {
			System.out.println(a[i]);
		}
  
	}

}
