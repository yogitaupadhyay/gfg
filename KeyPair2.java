import java.util.*;

public class KeyPair2{
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
			Set<Integer>set=new HashSet<Integer>();
			for(int j=0;j<n;j++){
				int target= number-arr[j];
				
				if(!set.contains(target)){
					set.add(arr[j]);
				}else if(set.contains(target)){
					System.out.println(arr[j]+"  "+target);
					System.exit(0);
				}
				
				}
				System.out.println("no");
				
			}//end of test case
	}//end of main
	
}//end of class