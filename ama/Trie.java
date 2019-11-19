/*package ama.com;

import java.util.HashMap;
import java.util.Scanner;

public class Trie {
	
	
	public static  boolean isAnagram(String str,String word){
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		for(int i=0;i<word.length();i++){
			if(!map.containsKey(word.charAt(i))){
				map.put(word.charAt(i), 1);
			}else{
				map.put(word.charAt(i),map.get(word.charAt(i))+1);
			}
		}
		
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i),map.get(str.charAt(i))-1);
			}
		}
		int count=0;
		for(int i=0;i<word.length();i++){
			if(map.get(word.charAt(i))==0){
				count++;
			}
		}
		if(count==word.length()){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int t=Integer.parseInt(scan.nextLine());
		for(int c=0;c<t;c++){
			int n=scan.nextInt();
			String dic[]=new String[n];
			for(int i=0;i<n;i++){
				dic[i]=scan.nextLine();
				
			}
			int m=Integer.parseInt(scan.nextLine());
			char boogle[][]=new char[m][m];
			for(int i=0;i<m;i++){
				for(int j=0;j<m;j++){
					boogle[i][j]=scan.nextLine().charAt(0);
				}
			}
			
			
			for(int w=0;w<n;w++){
				boolean isPresent=false;
				for(int i=0;i<m;i++){
				for(int j=0;j<m;j++){
					if(dic[i].contains(boogle[i][j]+"")){
						String str=getAdj(boogle[][],i,j);
						if(isAnagram(str,dic[i])){
							isPresent=true;
							break;
							
						}
					}
				}
				if(isPresent){
					System.out.print(dic[i]+" ");
					break;
				}
			}
				
			}//end of w loop
			
		}//end of test cases
	}//end of main

}//end of cases
*/