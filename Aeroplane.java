package nit.com;

import java.util.Scanner;

import nit.com.KimsTravel.Graph;
import nit.com.KimsTravel.Node;

public class Aeroplane {
    static int move(int x,int y,boolean bomb,boolean fire,int[][]arr,int coin){ 
    	
  	if(x<0||y<0||y>=5){
    		return coin;
    	}    	
    		if(arr[x][y]==0){
    			return coin;
    		}
    	if(bomb&&fire){
    		for(int i=x-1;i>=x-5;i--){
    			for(int j=0;j<5;j++){
    			
    				if(i>=0){
    					//System.out.println((x-1)+"="+(x-5));
    					if(arr[i][j]==0){
    						arr[i][j]=-3;
    					}else if(arr[i][j]==2){
    						arr[i][j]=-4;
    				}
    			}
    			}
    		}
    		bomb=false;
    	//printg(arr);
    	}else if(arr[x][y]==1){
       	if(coin==Integer.MIN_VALUE){
    		coin=0;
    	}
    		coin++;
    		if(coin==2&&x!=1&&y!=0){
    			System.out.println(x+"="+y);
    		}
    	}else if(arr[x][y]==2){
    		if(coin==Integer.MIN_VALUE){
    			
        		coin=-1;
        	}else{
        		coin--;
        	}
    		
    		//System.out.print(coin +" ");
    		
    	}
    	
    	
    	 
        if(x==3&&coin==1){
    		System.out.println("y="+y);
    	}
        
    int a=	move(x-1,y-1,bomb,true,arr,coin);
    //System.out.println("A="+a);
   
    int b=	move(x-1,y-1,bomb,false,arr,coin);
    int c=	move(x-1,y,bomb,true,arr,coin);
   
    int d=	move(x-1,y,bomb,false,arr,coin);
    int f=	move(x-1,y+1,bomb,true,arr,coin);
    
    int g=	move(x-1,y+1,bomb,false,arr,coin);
    int temp1=Math.max(Math.max(Math.max(Math.max(Math.max(a,b),c),d),f),g);
    return temp1;
   
    }
    static void printg(int [][]arr){
    	for(int i=0;i<arr.length;i++){
    		for(int j=0;j<5;j++){
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER N");
		int n=scan.nextInt();
		int arr[][]=new int[n+1][5];
		for(int i=0;i<n;i++){
			for(int j=0;j<5;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<5;i++){
			arr[n][i]=-1;
		}
		int coin=Integer.MIN_VALUE;
	int firecoin=move(n,2,true,true,arr,coin);
	int nonfireCoin=move(n,2,true,false,arr,coin);
		
		System.out.println(Math.max(firecoin,nonfireCoin));

	}

}
