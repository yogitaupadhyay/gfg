package sis.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemoval2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("eneter the string");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		if(str!=null){
			if(str.trim().length()==0){
				System.out.println("str is empty");
			}
		for(int i=0;i<str.length();i++){
		if(!map.containsKey(str.charAt(i))){
			map.put(str.charAt(i), 1);
		}else{
			map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
		}
		
		for(char data:map.keySet()){
			if(map.get(data)>1){
				System.out.print(data+" ");
			}
			
		}
		
		}else{
			System.out.println("str is null");
		}

	}

}
