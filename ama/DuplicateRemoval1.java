package sis.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemoval1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("eneter the string");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		int []countarr=new int[256];
		if(str!=null){
			if(str.trim().length()==0){
				System.out.println("str is empty");
			}
		for(int i=0;i<str.length();i++){
		countarr[str.charAt(i)]++;
		}
		
		for(int data=0;data<countarr.length;data++){
			if(countarr[data]>1){
				System.out.print((char)data+" ");
			}
			
		}
		
		}else{
			System.out.println("str is null");
		}

	}

}
