public class sisUtil{
	void swap1(int a,int b){
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("in sisUtil swap");
		System.out.println("a  and b before  update = "+a+" "+b);
		int  t;
		t=a;a=b;b=t;
		System.out.println("a  and b after update = "+a+ " "+b);
		System.out.println();
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		
	}
	void update(int a){
	System.out.println("in sisUtil swap");
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("a  before  update = "+a);
		a=a+1;
		System.out.println("a  after update = "+a);
		System.out.println("+++++++++++++++++++++++++++++++++");	
		
	}
	
	
}