
import java.util.*;
public class Compress{
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter the string");
		String pattern=scan.nextLine();
		String s="";
		s=s+pattern.charAt(0);
		s=s+"1";
		for(int j=1;j<pattern.length();j++){
			if(pattern.charAt(j)==pattern.charAt(j-1)){
				int res=(int)s.charAt(s.length()-1)-48;
				res=res+1;
				s=s.substring(0,s.length()-1)+res;
				
		}else{
			s=s+pattern.charAt(j);
			s=s+"1";
		}
	}
	System.out.println(s);
}
}