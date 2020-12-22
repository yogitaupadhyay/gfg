public class SisBooleanDemo{
	public static void main(String args[]){
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("are  you happy");

try{
	String str=scan.nextLine();
	Boolean isHappy=false;	
	 isHappy=SisBoolean.parseBoolean(str);
	 System.out.println(isHappy);
	}catch(MyCheckedException e){
		System.out.println("invalid argument");
	}
	
	}
}