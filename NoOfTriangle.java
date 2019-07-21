public class NoOfTriangle{
	static int factorial(int n){
		return (n==1||n==0)?1:factorial(n-1)*n;
	}
	static int permutation(int n,int r){
		if(r==0){
			return 1;
		}
		if(r>n){
			return 0;
		}
		//System.out.println((permutation(n-1,r-1)*r)+permutation(n-1,r));
		return ((permutation(n-1,r-1)*r)+permutation(n-1,r));
	}
	static int combination(int n,int r){
		System.out.println("factorial="+factorial(r));
		System.out.println("permutation="+permutation(n,r));
		return permutation(n,r)/factorial(r);
		
	}
	public static void main (String args[]){
		System.out.println("eneter the np of sides of polygon");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		int Nc3=combination(n,3);
		int oneSideCommon=n*(n-4);
		int twoSideCommon=n;
		int noSideCommon=Nc3-oneSideCommon-twoSideCommon;
		int res=Nc3-oneSideCommon;
		System.out.println("res="+res);
	}
}