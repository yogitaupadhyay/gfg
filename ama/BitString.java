package sis.com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class BitString {
	public static void printarr(int[]arr){
		for(int data:arr){
			System.out.print(data+" ");
		}
		System.out.println();
	}
      static void combo(int[]arr,int l,int r){
    	 // System.out.println("L="+l+" R="+r);
    	  if(l==r){
    		  printarr(arr);
    		  return;
    	  }
    	  arr[l]=0;
    	  combo(arr, l+1, r);
    	  arr[l]=1;
    	  combo(arr, l+1, r);
    	  
      }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your no");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]str=new int[n];
		Arrays.fill(str,0);
		combo(str, 0, (str.length));
		scan.close();

	}

}
