package nit.com;

import java.util.Scanner;

public class Pipe {
static int ans=0;
static int n=0;
static int m=0;
static int arr[][]=null;
static boolean visited[][]=null;

static class Cell{
	int x;
	int y;
	int l;
	Cell(int x,int y,int l){
		this.x=x;
		this.y=y;
		this.l=l;
		
	}
}

static class Queue{
	static class Node{
		Cell data;
		Node next;
		Node(Cell data){
			this.data=data;
		}
	}
  Node  head;
	Node  tail;
	int size;
	public Queue() {
		// TODO Auto-generated constructor stub
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	boolean add(Cell data){
		if(size==0){
			head=new Node(data);
			tail=head;
		}else{
			tail.next=new Node(data);
			tail=tail.next;
			
		}
		size++;
		return true;
	
	}
	Cell poll(){
		size--;
		Cell data=head.data;
		head=head.next;
		if(head==null){
			tail=null;
		}
		return data;
		
}

}

static boolean inRange(int r,int c){
	return (r>=0&&r<n&&c>=0&&c<m);	
}
static boolean up(int x,int y){
	return (arr[x][y]==1||arr[x][y]==2||arr[x][y]==4||arr[x][y]==7);
	}
static boolean down(int x,int y){
	return (arr[x][y]==1||arr[x][y]==2||arr[x][y]==5||arr[x][y]==6);
	}
static boolean left(int x,int y){
	return (arr[x][y]==1||arr[x][y]==3||arr[x][y]==6||arr[x][y]==7);
	}
static boolean right(int x,int y){
	return (arr[x][y]==1||arr[x][y]==3||arr[x][y]==4||arr[x][y]==5);
	}


	static void flow(int x,int y,int l1){
	Queue q=new Queue();
	Cell p=new Cell(x,y,l1);
	q.add(p);
	visited[x][y]=true;
	while(q.size!=0){
	Cell k=q.poll();
	int r=k.x;
	int c=k.y;
	int l=k.l;
	if(l==0){
		break;
	}
	ans++;
	if(inRange(r-1,c)&&visited[r-1][c]==false&&up(r,c)&&down(r-1,c)){
		q.add(new Cell(r-1,c,l-1));
		visited[r-1][c]=true;
	}
	
	if(inRange(r+1,c)&&visited[r+1][c]==false&&down(r,c)&&up(r+1,c)){
		q.add(new Cell(r+1,c,l-1));
		visited[r+1][c]=true;
	}
	
	if(inRange(r,c+1)&&visited[r][c+1]==false&&right(r,c)&&left(r,c+1)){
		q.add(new Cell(r,c+1,l-1));
		visited[r][c+1]=true;
	}
	
	if(inRange(r,c-1)&&visited[r][c-1]==false&&left(r,c)&&right(r,c-1)){
		q.add(new Cell(r,c-1,l-1));
		visited[r][c-1]=true;
	}
		
	}//end of while
		
		
	}//end of algo
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER t");
		int t=scan.nextInt();
		for(int c=0;c<t;c++){
			 n=scan.nextInt();
			 m=scan.nextInt();
			int row=scan.nextInt();
			int col=scan.nextInt();
			int l=scan.nextInt();
			 arr=new int[n][m];
			visited=new boolean[n][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					arr[i][j]=scan.nextInt();
				}
			}
			if(arr[row][col]!=0){
				flow(row,col,l);
			}
			System.out.println(ans);
		}
		

	}

}
