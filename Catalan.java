public class Catalan{
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
	   System.out.println("enter the no of catalan u want");
	   int num=scan.nextInt();
	   for(int i=1;i<=num;i++){
		  System.out.println(catalan(i));
	   }
	   
    }//end of main
	public static int catalan(int n){
		if(n<=1) return 1;
		int res=0;
		for(int i=0;i<n;i++){
			res=res+catalan(i)*catalan(n-i-1);
			//System.out.println("res"+i+"= "+res);
		}
		return res;
		
	}
}//end of class
