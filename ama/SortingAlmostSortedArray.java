package sis.com;

import java.util.Scanner;

public class SortingAlmostSortedArray {

	//left
		static int left(int i){
			return 2*i+1;
		}
		//right
		static int right(int i){
			return 2*i+2;
		}
		//extract max
	  static int extractMin(int []arr){
			int max=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=Integer.MAX_VALUE;
			Heapify(arr,0);
			return max;
		}
	  static int parent(int i){
		  return (i-1)/2;
	  }
	  
			static void Heapify(int[]arr,int i){
			int l=left(i);
			int r=right(i);
			int smallest=i;
			if(l<arr.length&&arr[l]<arr[smallest]){
				smallest=l;
			}
			if(r<arr.length&&arr[r]<arr[smallest]){
				smallest=r;
			}
			if(i!=smallest){
				int temp=arr[i];
				arr[i]=arr[smallest];
				arr[smallest]=temp;
				Heapify(arr, smallest);
			}
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("enter no of element in array ");
			Scanner scan =new Scanner(System.in);
			int n=scan.nextInt();
			System.out.println("ENter k");
			int k=scan.nextInt();
		int arr[]=new int[k+1];
		int aux[]=new int [n-k-1];
		for(int i=0;i<k+1;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=k+1;i<n;i++){
			aux[i-k-1]=scan.nextInt();
		}
	for(int j=arr.length/2-1;j>=0;j--){
		Heapify(arr,j);
	}

	/*for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}*/
	
		
		for(int i=0;i<n;i++){
			int max=extractMin(arr);
			System.out.println(max);
			if(i<n-k-1){
			arr[arr.length-1]=aux[i];
			}
		}
		}//end of main


}
