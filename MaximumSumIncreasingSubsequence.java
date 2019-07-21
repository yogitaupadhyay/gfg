
import java.util.*;
public class MaximumSumIncreasingSubsequence{
	public static void main(String args[]){
		System.out.println("enter array elelments no");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array");
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
	int sum[]=new int[n];
	int s[]=new int[n];

for(int i=0;i<n;i++){
	sum[i]=arr[i];
		//System.out.print("sumi== "+sum[i]+" ");
	}
	System.out.println("");
	s[0]=0;
int max=arr[0];
int index=0;
for(int i=1;i<n;i++){
	for(int j=0;j<i;j++){
		if(arr[j]<arr[i]){
			int temp=sum[j]+arr[i];
			if(temp>sum[i]){
				sum[i]=temp;
				//System.out.println("sum"+i+"= "+sum[i]);
				if(temp>max){
					max=temp;
					index=i;
				}
				s[i]=j;
			}
		}
		
	}
}

System.out.println("res="+max);
while(max!=0){
	System.out.println(arr[index]);
max=max-arr[index];
index=s[index];
}
	}//end of main
}//end of class