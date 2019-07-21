import java.util.*;

public class MissingElementInArray{
	public static void main(String args[]){
		
		System.out.println("enter no of test case");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
			System.out.println("enter no of element in array");
			int n=scan.nextInt();
			int []arr=new int[n];
			int res=0;
			for(int j=0;j<n-1;j++){
				arr[j]=scan.nextInt();
				res=res+arr[j];
				
			}
			int missing=(n*(n+1)/2)-res;
			System.out.println(missing);
			
		}
		
	}
	
}