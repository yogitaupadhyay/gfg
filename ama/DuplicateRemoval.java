package sis.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("eneter the string");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		ArrayList<Character>list=new ArrayList<Character>();
		HashSet<Character>set=new HashSet<Character>();
		if(str!=null){
			if(str.trim().length()==0){
				System.out.println("str is empty");
			}
		for(int i=0;i<str.length();i++){
		if(!list.contains(str.charAt(i))){
			list.add(str.charAt(i));
		}else{
			set.add(str.charAt(i));
			//System.out.print(str.charAt(i)+" ");
		}
		}
		
		for(char data:set){
			System.out.print(data+" ");
		}
		
		}else{
			System.out.println("str is null");
		}

	}

}
