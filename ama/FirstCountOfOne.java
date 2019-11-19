package ama.com;

import java.util.Scanner;

public class FirstCountOfOne {
static int searchOne(int []arr,int s,int n){
	if(s<n){
	int k=(n-s)/2;
	if(arr[s+k]==1&&arr[s+k-1]==0||arr[s+k]==1&&s+k-1<0){
		return (s+k);
	}
	if(arr[s]==0){
		return searchOne(arr,s+k+1,n);
	}else{
		return searchOne(arr,s,s+k-1);
	}
	}
return -1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter t");
		int t=scan.nextInt();
		for(int c=0;c<t;c++){
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
		}
			int res=searchOne(arr,0,n);
			System.out.println(res);
			
			scan.close();
		}

	}

}
