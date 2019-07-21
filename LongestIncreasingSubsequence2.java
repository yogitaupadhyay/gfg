import java.util.*;

public class LongestIncreasingSubsequence2{
	public static void main(String args[]){
		
		System.out.println("enter no of test case");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
			System.out.println("enter no of element in array");
			int n=scan.nextInt();
			int []arr=new int[n];
			
			for(int j=0;j<n;j++){
				arr[j]=scan.nextInt();
			}
			int []length=new int[n];
			Arrays.fill(length,1);
			int []s=new int[n];
					s[0]=0;
			int res=0;
			int index=0;
			
			
			
			
			for(int j=0;j<n;j++){
				System.out.print(arr[j]);
			}
			
			
			
			for(int j=1;j<n;j++){
				for(int k=0;k<j;k++){
					System.out.println("arr[k]="+arr[k]+"  "+arr[j]);
					
					if(arr[k]<arr[j]){
						
						length[j]=Math.max(length[j],length[k]+1);
						if(length[j]>res){
							res=length[j];
							index=j;
						}
						if(length[j]==length[k]+1){
							s[j]=k;
							
						}
					}
				}
				
			}
			
			
			int c=res;
			while(c>0){
				c--;
				System.out.print(arr[index]+" ");
				index=s[index];
				
			}
			
		}
		
	}
	
}