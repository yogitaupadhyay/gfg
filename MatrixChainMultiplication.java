import java.util.*;
class MatrixChainMultiplication {
	public static void main (String[] args) {
		//code
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int c=0;c<t;c++){
		    int n=scan.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=scan.nextInt();
		    }
		    int m[][]=new int[n-1][n-1];
		    //int mk[][]=new int[n][n];
		     for(int j=0;j<n-1;j++){
		    for(int i=n-2;i>=0;i--){
		      
		           if(i==j){
		               m[i][j]=0;
		           }else if(i<j){
	               int min=Integer.MAX_VALUE;
		               for(int k=i;k<j;k++){
		                // System.out.println("m[i][k]="+m[i][k]+"m[k+1][j]"+m[k+1][j]+"arr[i]*arr[k+1]*arr[j+1]="+arr[i]*arr[k+1]*arr[j+1]);
		                   m[i][j]=m[i][k]+m[k+1][j]+arr[i]*arr[k+1]*arr[j+1];
		              		    //System.out.println("i="+i+"k= "+k +"j="+j+"m="+m[i][j]);
		              		   if(m[i][j]<min){
		                       min=m[i][j];
		                      //System.out.println("mion="+min);
		                   }
		               }
		               m[i][j]=min;
		           }
		        /*    for(int i1=0;i1<n-1;i1++){
		        for(int j1=0;j1<n-1;j1++){
		            System.out.print(m[i1][j1]+" ");
		        }
		        System.out.println("");
		    }
		     System.out.println("---------------");*/
		       }
		    }
		   
		     System.out.println(m[0][n-2]);
		    
		}
		
		
	}
}