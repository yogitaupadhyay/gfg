/*package nit.com;

import java.util.Scanner;

public class TollGate {
	static int  n=0;
	static Poll[]arr=null;
	static int minCost=Integer.MAX_VALUE;
static class  Poll{
	int men;
	int cost;
	Poll(int men,int cost){
		this.men=men;
		this.cost=cost;
	}
}


static void func(int b1,int b2,int b3,int cost,int i,int min){
	int men=b1+b2+b3;
	if(cost>=minCost){
		return;
	}
	if(i==n-1)
	{
		if(men<arr[i].men)
			cost+=arr[i].cost;
		if(cost<min)
			min=cost;
		return;
	}
	
	func(b1,b2,b3, cost+arr[i].cost, i+1,min);
	func(b1,b2,b3+arr[i].men, cost+(2*arr[i].cost), i+1,min);
	
	if(men>=arr[i].men){
		
		if(arr[i].men>b1+b2){
			b3=men-arr[i].men;
			b1=b2=0;
		}else if(arr[i].men>b1){
			b2=b2+b1-(arr[i].men);
			b1=0;
		}
		func(b1,b2,b3, cost, i+1,min);		
	}
	
	
	
}


	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter n");
	   n=scan.nextInt();
	  arr=new Poll[n];
	  for(int i=0;i<n;i++){
		  int men=scan.nextInt();
		  int cost=scan.nextInt();
		  arr[i]=new Poll(men, cost);
	  }
	  int min=Integer.MAX_VALUE
  func(0,0,0, 0, 0);
  System.out.println(minCost);
	}

}
*/