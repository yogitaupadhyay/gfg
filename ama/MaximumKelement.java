package sis.com;

import java.util.Scanner;

public class MaximumKelement {
	//left
	static int left(int i){
		return 2*i+1;
	}
	//right
	static int right(int i){
		return 2*i+2;
	}
	//extract max
  static int extractMax(int []arr){
		int max=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=-1;
		Heapify(arr,0);
		return max;
	}
  static int parent(int i){
	  return (i-1)/2;
  }
  //increase element
  static void increaseElement(int arr[],int i,int val){
	  arr[i]=val;
	  while(arr[parent(i)]<arr[i]&&i>=0){
		  int temp=arr[parent(i)];
		  arr[parent(i)]=arr[i];
		  arr[i]=temp;
		  i=parent(i);
	  }
	  	  
  }
  
  //insert element
  
  
	static void Heapify(int[]arr,int i){
		int l=left(i);
		int r=right(i);
		int largest=i;
		if(l<arr.length&&arr[l]>arr[largest]){
			largest=l;
		}
		if(r<arr.length&&arr[r]>arr[largest]){
			largest=r;
		}
		if(i!=largest){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			Heapify(arr, largest);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no of element in array ");
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=scan.nextInt();
	}
for(int j=arr.length/2-1;j>=0;j--){
	Heapify(arr,j);
}

for(int i=0;i<n;i++){
	System.out.print(arr[i]+" ");
}
/*System.out.println("ENTER NO OF LARGEST ELEMENT TO GET");
int k=scan.nextInt();
	for(int i=0;i<k;i++){
		int max=extractMax(arr);
		System.out.println("max="+max);
	}*/
	increaseElement(arr, 3, 15);
	
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	}//end of main

}
