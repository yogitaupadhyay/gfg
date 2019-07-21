import java.util.*;
public class NthTermSetTheory{
	static int hcf(int a,int b){
		if(a>b){
			int t=a;
			a=b;
			b=t;
		}
		int r=Integer.MAX_VALUE;
		while(r!=0){
		r=b%a;
		b=a;
		a=r;
		
		}
		return b;
	}
	static int lcm(int a,int b){
		System.out.println("hcf="+hcf(a,b));
		return (a*b)/hcf(a,b);
	}
	public static void main(String args[]){
		System.out.println("enter a b c and n");
	java.util.Scanner scan=new java.util.Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int n=scan.nextInt();
	
	
	int res=n/a+n/b+n/c-n/(lcm(a,b))-n/(lcm(b,c))-n/(lcm(c,a))+n/(lcm((lcm(a,b)),c));
		System.out.println(res);
	}
}