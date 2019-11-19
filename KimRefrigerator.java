/*package nit.com;

import java.util.Scanner;

public class KimRefrigerator {
static int minCost=Integer.MAX_VALUE;
static void path(int [][]arr,int s,int cost,int count,int shop,boolean[] visited){
	if(count==shop&&arr[0][s]==arr[0][shop+1]&&arr[1][s]==arr[1][shop+1]){
		minCost=Math.min(minCost, cost);
		return ;
	}
	for(int i=1;i<=shop;i++){
		if(visited[i]==false){
			visited[i]=true;
			path(arr, i+1, cost+dist(), count+1, shop, visited);
			visited[i]=false;
		}
	}
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int shop=scan.nextInt();
		int ox=scan.nextInt();
		int oy=scan.nextInt();
		int hx=scan.nextInt();
		int hy=scan.nextInt();
		
		int arr[][]=new int[2][shop+2];
		arr[0][0]=ox;
		arr[0][1]=oy;
		for(int i=0;i<(shop+1);i++){
			arr[0][i+1]=scan.nextInt();
			arr[1][i+1]=scan.nextInt(); 
		}
		arr[0][shop+1]=hx;
		arr[0][shop+1]=hy;
		int cost=0;
		boolean []visited=new boolean[shop];
		path(arr,0,cost,0,shop,visited);

	}

}
*/