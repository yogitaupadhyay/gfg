package sis.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Anagram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("eneter the string");
		String str=scan.nextLine();
		
		System.out.println("eneter the string");
		String str1=scan.nextLine();
		
		if(str!=null){
			if(str1.length()!=str.length()){
				System.out.println("string is not anagram");
				System.exit(0);
			}
				int val=0;
		for(int i=0;i<str.length();i++){
		val=val^str.charAt(i);
		val=val^str1.charAt(i);
		}
					
		if(val==0){
			System.out.println("string is anagram");
		}else{
			System.out.println("string is not anagram");
		}
		
		
		}else{
			System.out.println("str is null");
		}

	}

}
