public class Demo1{
	public static void main(String args[]){
		X x=new X();
		System.out.println("eneter the a and b");
		java.util.Scanner scan=new java.util.Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
		int res1=x.div(a,b);
		System.out.println("res1 = "+res1);
		int res2=x.div1(a,b);
		System.out.println("res2 = "+res2);
		int res3=x.div2(a,b);
		System.out.println("res2 = "+res2);
		
	}
}