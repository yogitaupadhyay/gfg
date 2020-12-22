public class Req{
	public static void main(String args[]){
		System.out.println("enter ur no");
		
		Integer a=null;
		do{
		java.util.Scanner scan =new java.util.Scanner(System.in);
		try{
	     a =scan.nextInt();
		}catch(java.util.InputMismatchException e){
			System.out.println("error:  "+e.getMessage());
			System.out.println("re -enter the no");
		}
		}while(a==null);
		
		//boolean
		System.out.println("enter ur boolean");
		
		Boolean a1=null;
		do{
		java.util.Scanner scan =new java.util.Scanner(System.in);
		try{
	     a1 =scan.nextBoolean();
		}catch(java.util.InputMismatchException e){
			System.out.println("error:  "+e.getMessage());
			System.out.println("re -enter the no");
		}
		}while(a1==null);
		
	}
}