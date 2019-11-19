package nit.com;

import java.util.Scanner;

	class ModiFiedDijkstra{
		   static class  Node implements Comparable<Node>{
		       int data;
		       int weight;
		       boolean visited;
		       Node(int data,int weight){
		           this.data=data;
		           this.weight=weight;
		           this.visited=false;
		       }
		       @Override
		      public int compareTo(Node ob){
		           return this.weight-ob.weight;
		           
		       }
		        
		    }
		    
		    static Node extractMin(Node []arr){
		        Node min=new Node(0,Integer.MAX_VALUE);
		        int k=0;
		        for(int i=0;i<arr.length;i++){
		            if(arr[i].compareTo(min)<0&&arr[i].visited==false){
		                min=arr[i];
		                k=i;
		            }
		        }
		        arr[k].visited=true;
		        return min;
		    }
		    static void  algo(int [][]g){
		        int[][]res=new int[g.length][g.length];
		        for(int m=0;m<g.length;m++){
		         Node  arr[]=new Node[g.length];
		        Node dist[]=new Node[g.length];
		        arr[m]=new Node(m,0);
		        for(int i=0;i<g.length;i++){
		            if(i!=m){
		                 arr[i]=new Node(i,10000000);
		            }
		           
		        }
		        int count=0;
		        while(count<arr.length){
		          Node k= extractMin(arr);
		          dist[count]=new Node(k.data,k.weight);
		          //System.out.println(k.data+"  "+k.weight+"  "+k.visited);
		          count++;
		          int p=k.data;
		        
		          for(int i=0;i<arr.length;i++){
		              if(arr[i].visited==false&&g[p][i]!=10000000
		              &&arr[i].weight>arr[p].weight+g[p][i]){
		                  arr[i].weight=arr[p].weight+g[p][i];
		              }
		          }
		        }
		        
		        for(int i=0;i<dist.length;i++){
		            res[m][dist[i].data]=dist[i].weight;
		        }
		        
		        }
		         for(int i=0;i<res.length;i++){
				        for(int j=0;j<res.length;j++){
				           if(res[i][j]==10000000){
				                System.out.print("INF");
				           }else{
				               System.out.print(res[i][j]+" "); 
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


