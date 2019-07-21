public class CatalanDp{
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
	   System.out.println("enter the no of catalan u want");
	   int num=scan.nextInt();
	   int catalan[]=new int[num+1];
	   catalan[0]=1;
	   catalan[1]=1;
	   for(int i=2;i<=num;i++){
		   catalan[i]=0;
	   for(int j=0;j<i;j++){
		  catalan[i]=catalan[i]+catalan[j]*catalan[i-j-1];
		  
	   }
	   System.out.println(catalan[i]);
	   }
	   
    }//end of main
	
}//end of class
