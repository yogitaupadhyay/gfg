package ama.com;

import java.util.Scanner;

public class help {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("eneter n");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int sum=0;
		int res[]=new int[n];
		for(int i=0;i<n;i++){
			if(i==n-1){
				if(arr[i]>arr[i-1]){
					
				}
			}
			if(arr[i]<arr[i+1]){
				if(i==0){
					res[i]=1;
				}else if(arr[i]>arr[i-1]){
					res[i]=res[i-1]+1;
				}else{
					res[i]=1;
					}
				
			for(int j=i-1;j>=0;j--){
				if(res[j]!=0){
					break;
				}
						if(res[j]==0){
							res[j]=res[j+1]+1;
						
						}
					}
				}
			}
		
		
		for(int i=0;i<n;i++){
			System.out.println("res="+res[i]);

	}

}
}