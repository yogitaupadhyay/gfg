public class Permutation{
	static int p(int n,int k){
		if(k==0)return 1;
		if(k>n){
			return 0;
		}
		return p(n-1,k-1)*k+p(n-1,k);
	}
	public static void main(String args[]){
		System.out.println("enter no");
		java.util.Scanner scan=new java.util.Scanner(System.in);
	int n=scan.nextInt();
	int res=p(n,3);
	System.out.println("res="+res);
	
	}
}