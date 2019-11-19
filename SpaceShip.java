package nit.com;

import java.util.Scanner;

public class SpaceShip {
    static int move(int x,int y,boolean bomb,boolean fire,int[][]arr,int coin){
    	//System.out.println("^^^^^^X="+x+"y="+y+"coins "+coin);
    	if(x<0||y<0||y>=5){
    		return coin;
    	}
    	
    		if(arr[x][y]==2){
    			return coin;
    		}
    	if(bomb&&fire){
    		for(int i=x-1;i<x-5;i--){
    			for(int j=0;j<5;j++){
    				if(i>=0){
    					if(arr[i][j]==2){
    						arr[i][j]=0;
    					}
    				}
    			}
    		}
    		bomb=false;
    	}
    	if(arr[x][y]==1){
    		coin++;
    	}
    int a=	move(x-1,y-1,bomb,true,arr,coin);
    int b=	move(x-1,y-1,bomb,false,arr,coin);
    int c=	move(x-1,y,bomb,true,arr,coin);
    int d=	move(x-1,y,bomb,false,arr,coin);
    int f=	move(x-1,y+1,bomb,true,arr,coin);
    int g=	move(x-1,y+1,bomb,false,arr,coin);
    int temp1=Math.max(Math.max(Math.max(Math.max(Math.max(a,b),c),d),f),g);
    return temp1;
    	
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
		int coin=0;
	int firecoin=move(n,2,true,true,arr,coin);
	int nonfireCoin=move(n,2,true,false,arr,coin);
		
		System.out.println(Math.max(firecoin,nonfireCoin));

	}

}
