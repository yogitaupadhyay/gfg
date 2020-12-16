package sis.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("eneter the string");
		String str=scan.nextLine();
		
		System.out.println("eneter the string");
		String str1=scan.nextLine();
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		if(str!=null){
			if(str1.length()!=str.length()){
				System.out.println("string is not anagram");
				System.exit(0);
			}
		for(int i=0;i<str.length();i++){
		if(!map.containsKey(str.charAt(i))){
			map.put(str.charAt(i), 1);
		}else{
			map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
				}
		
		
		for(int i=0;i<str1.length();i++){
				if(map.containsKey(str1.charAt(i))){
				map.put(str1.charAt(i), map.get(str1.charAt(i))-1);
			}
				
			}
		
		int count=0;
		for(char data:map.keySet()){
			if(map.get(data)==0){
				count++;
			}
			
		}
		if(count==map.size()){
			System.out.println("string is anagram");
		}else{
			System.out.println("string is not anagram");
		}
		
		
		}else{
			System.out.println("str is null");
		}

	}

}
