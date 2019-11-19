package nit.com;

import java.util.Scanner;

public class Marathon {
	static Place []arr=null;
	static int minTime=Integer.MAX_VALUE;
	static class Place{
		int time_Km;
		int energy;
		public Place(int time_km,int energy) {
			this.time_Km=time_km;
			this.energy=energy;
		}
	}

	static void func(int dist,int ener,int time,int i){
		if(i<=0||ener<=0||time>minTime){
			return ;
		}
		if(dist<=0){
			minTime=Math.min(minTime, time);
			return;
		}
		
		func(dist-1, ener-arr[i].energy, time-arr[i].time_Km, i+1);
		func(dist, ener, time, i+1);
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER d");
		int d=scan.nextInt();
		int h=scan.nextInt();
		 arr=new Place[d];
		for(int i=0;i<d;i++){
			int a=scan.nextInt();
			int b=scan.nextInt();
			arr[i].time_Km=a;
			arr[i].energy=b;
		}
		
	
		func(d,h,0,0);
		System.out.println(minTime);
		
		
	}

}
