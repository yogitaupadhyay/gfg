package nit.com;

import java.util.Scanner;

public class FlyodWarshal {

	static void algo(int [][]arr){
        int n=arr.length;
        for(int k=0;k<n;k++){
             for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
            }
        }
        }
       for(int i=0;i<n;i++){
				        for(int j=0;j<n;j++){
				           if(arr[i][j]==10000000){
				                System.out.print("INF");
				           }else{
				               System.out.print(arr[i][j]+" "); 
				           }
				         
				        }
				        System.out.println();
				    }
        
    }
    
    
	public static void main (String[] args) {
		//code
		Scanner scan=new Scanner(System.in);
				int t=scan.nextInt();
				for(int c=0;c<t;c++){
				    int n=scan.nextInt();
				   int g[][]=new int[n][n];
				    for(int i=0;i<n;i++){
				        for(int j=0;j<n;j++){
				            g[i][j]=scan.nextInt();
				        }
				    }
				    algo(g);
				}
		
		
	}

}
