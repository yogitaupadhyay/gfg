public class CallbyValue{
	public static void main(String args[]){
		int a=10;
		int b=20;
		System.out.println("a before update = "+a);
		System.out.println("b before update = "+b);
		sisUtil s=new sisUtil();
		s.update(a);
		System.out.println("a after update = "+a);
		s.swap1(a,b);
		
		System.out.println("a and after update = "+a +" --"+b);
	}
	
	
}