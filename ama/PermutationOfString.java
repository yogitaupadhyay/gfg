package sis.com;

import java.util.Scanner;

public class PermutationOfString {
static void swap(char[] str,int l,int i){
	char temp=str[i];
	str[i]=str[l];
	str[l]=temp;
	
}
	static void permutation(char []str,int l,int r){
		if(l==r+1){
			System.out.println(str);
			return;
		}
		for(int i=l;i<=r;i++){
			swap(str,l,i);
			//System.out.println(str);
			permutation(str, l+1, r);
			swap(str,l,i);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		char[] str=str1.toCharArray();
		permutation(str,0,str.length-1);
		swap(str,2,0);
scan.close();
	}

}
