import java.util.*;
public class LongestCommonSubsequence{
	public static void main(String args[]){
		System.out.println("eneter the array size");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		int []l=new int[n];
		int []s=new int[n];
		Arrays.fill(l,1);
		int res=0;
		int index=0;
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
					l[i]=Math.max(l[i],l[j]+1);
					if(l[i]>res){
						res=l[i];
						index=i;
					}
					if(l[i]==l[j]+1){
						s[i]=j;
						
					}
				}
				
			}
		}
		int i=res;
		while(i>0){
			System.out.print(arr[index]);
			index=s[index];
			
			i--;
		}
		System.out.println("res="+res);
		System.out.println("index="+index);
		
	}
}