import java.util.*;
public class ParseInt{

 public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("eneter the string");
	String str=scan.nextLine();
	int sum=0;
	for(int i=0;i<str.length();i++){
		int res=str.charAt(i)-48;
		sum=sum+res*(int)Math.pow(10,str.length()-i-1);
	}
	System.out.println(sum);
	

	}
}