import java.util.*;
class ratinMaze{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					a[i][j]=sc.nextInt();
			GfG g=new GfG();
			ArrayList<String> res=g.printPath(a,n);
			for(int i=0;i<res.size();i++)
				System.out.print(res.get(i)+" ");
			System.out.println();
		}
	}
}

/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below*/
class GfG{
    public static ArrayList<String> move(int [][]arr,int x,int y,ArrayList<String>path,String temp){
        int n=arr.length;
        if(x==arr.length-1&&y==arr.length-1){
            path.add(temp);
             return path+" ";
        }
        if(y+1<n&&arr[x][y+1]==1){
            temp=tem+"R";
            move(arr,x,y+1,path);
            temp=temp-"R";
        }
        if(x+1<n&&arr[x+1][y]==1){
            temp=temp+"D";
            move(arr,x+1,y,path);
            temp=temp-"D";
        }
        return path;
    }
     public static ArrayList<String> printPath(int[][]arr, int n)
     {
          //Your code here
          ArrayList<String>path=new  ArrayList<String>();
          path=move(arr,0,0,path);
         /* for(String data:path){
              System.out.print(data+"-");
          }*/
          return path;
     }
}