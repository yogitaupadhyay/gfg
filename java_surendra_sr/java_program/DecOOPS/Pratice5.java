public class Pratice5{
	public static void main(String args[]){
		System.out.println("enter the string ");
		java.util.Scanner scan=new java.util.Scanner(System.in);
String str=scan.nextLine();

System.out.println("enter the substring ");
String charac=scan.nextLine();
int m=0;
int count=0;
 while(m>=0){
	m=str.indexOf(charac,m);
	
System.out.println("m="+m);
	count++;
	}
	if(count==0){
System.out.println("character is not present in string");
		
	}else{
System.out.println("character is present in string=="+count);
		
		
	}
		
	}
	
	
}