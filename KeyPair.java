import java.util.*;

public class KeyPair{
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
			Arrays.sort(arr);
			int left=0;
			int right=n-1;
			while(left<right){
				if((arr[left]+arr[right])==number){
					System.out.println("yes");
					System.exit(0);
				}
				if((arr[left]+arr[right])<number){
					left++;
				}
				if((arr[left]+arr[right])>number){
					right--;
				}
				System.out.println("right="+right+"left"+left);
				}
				System.out.println("no");
				
			}//end of test case
	}//end of main
	
}//end of class