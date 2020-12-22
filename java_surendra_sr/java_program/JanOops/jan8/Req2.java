public class Req2{
	public static void main(String args[]){
		System.out.println("enter ur string"); 
		java.util.Scanner scan=new java.util.Scanner(System.in);
		String s=scan.nextLine();
		
		System.out.println("ur string :"+s);
try{		
		System.out.println(" 3rd char of ur string :"+s.charAt(3-1)); 
}catch(StringIndexOutOfBoundsException e){
	
		System.out.println(" ur string doen't have 3rd character"); 
}
		
	}
}