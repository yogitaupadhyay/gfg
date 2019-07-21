public class CatalanCombination{
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
	   System.out.println("enter the no of catalan u want");
	   int n=scan.nextInt();
	  for(int i=0;i<=n;i++){
		  System.out.println(combination(2*i,i)/(i+1));
	  }
	   
    }//end of main
	public static int combination(int n,int k){
		if(k>n-k){
			k=n-k;
		}
		int res=1;
		for(int i=1;i<=k;i++){
			res=res*(n-i+1);
			res=res/i;
		}
		return res;
	}
}//end of class
