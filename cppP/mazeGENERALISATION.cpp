#include<iostream>              //#=obstacle,A=free cell in qhich elf was,//*=CELL WITH MINE,%=CELL WITH EXIT,0=free cell
using namespace std;  
int move(char maze[][20],int x,int y,int p) {
		x--;int j,e=0;j=y;
	for(int i=x;i<x+3;i++){
	if(maze[i][j]=='0'||maze[i][j]=='*'||maze[i][j]=='%'){
		d++;
		if(maze[i][j]=='%'){e++;
		}
	}	
			}
			x++;y--;int i;i=x;
			for(int j=y;j<y+3;j++){
				if(maze[i][j]=='0'||maze[i][j]=='*'||maze[i][j]=='%'){
		d++;
		if(maze[i][j]=='%'){e++;
		}
			}
		}
		p=1.0/d;
		return e;
}            
int main(){
	int m,n,k,x,y,p;float d=0;
	cin>>n>>m>>k; //maze=n*m& k tunnel .
	char **maze=new char *[n];
	for(int i=0;i<n;i++){
		maze[i]=new char[m];
	}                                           
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){                   
			cin>>maze[i][j];
			}
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){ 
			if(maze[i][j]=='A'){
				x=i;y=j;
				break;
			}
				}
			}
	//first iteration
	x--;int j;j=y;
	for(int i=x;i<x+3;i++){
	if(maze[i][j]=='0'||maze[i][j]=='*'||maze[i][j]=='%'){
	e=move(maze,i,j,p);
	if(e==1){
	cout<<1.0/d;
	exit(0);
}
	}	
			}
			x++;y--;int i;i=x;
			for(int j=y;j<y+3;j++){
				if(maze[i][j]=='0'||maze[i][j]=='*'||maze[i][j]=='%'){
			e=move(maze,i,j,p);
			}
		}
if(e==1){
	cout<<1.0/d;
	exit(0);
}
	return 0;
}
