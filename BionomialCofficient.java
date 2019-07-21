public class  BionomialCofficient{
	public static void main(String args[]){
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("enter the n");
	int n=scan.nextInt();
	System.out.println("enter the k");
	int k=scan.nextInt();
	
	System.out.println(cofficient(n,k));
	   
	  
    }//end of main
	public static int cofficient(int n,int k){
		if(n-k<k){
			k=n-k;
		}
		if(k==0||k==n){
			return 1;
		}
		return cofficient(n-1,k-1)+cofficient(n-1,k);
	}
}//end of class
