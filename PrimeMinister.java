import java.util.*;

public class PrimeMinister{
  public static void main(String args[]){
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  int arr[]=new int[n];
	  int sum=0;
	  for(int i=0;i<n;i++){
		  arr[i]=scan.nextInt();
		  sum=sum+arr[i];
		  
	  }
	 int res=arr[0];
	 if(res>=sum/2+1){
	 System.out.println("1");
	 System.out.println("1");
		 System.exit(0);
	 }
	boolean isPoss=false;
	 ArrayList<Integer>list=new ArrayList<Integer>();
	 list.add(1);
	  for(int i=1;i<n;i++){
		  if(arr[i]<=arr[0]/2){
			  res=res+arr[i];
			  list.add(i+1);
			   if(res>=sum/2+1){
				   isPoss=true;
	             break;
			       }
		  }
	
	  }
	  if(isPoss==true){
		  System.out.println(list.size());
		   for(int i=0;i<list.size();i++){
		      System.out.print(list.get(i)+" ");
		  }
	  }else{
	  
	  System.out.println("0");
	  }
	  
	 
  }//end of main

}//end of class