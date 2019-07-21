import java.util.*;

public class KeyPair3{
	public static void main(String args[]){
		
		System.out.println("enter no of test case");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
			System.out.println("enter no of element in array");
			int n=scan.nextInt();
			int number=scan.nextInt();
			int []arr=new int[n];
			
			for(int j=0;j<n;j++){
				arr[j]=scan.nextInt();
			}
			
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					if(arr[k]+arr[j]==number){
						System.out.println(arr[j]+"  "+arr[k]);
					}
					
					
				}
				
				}
				
				
			}//end of test case
	}//end of main
	
}//end of class