public class XDemo{
	public static void main(String args[]){
		X x=new X();
		try{
		int res=x.m1(20,10);
		System.out.println("res= "+res);
		int res3=x.m2(20,0);
		System.out.println("res3= "+res3);
		}catch(ArithmeticException e){
			
		System.out.println("b cannot be 0");
		}
	}
}