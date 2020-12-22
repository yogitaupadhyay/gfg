#include<stdio.h>
#include<conio.h>
void
struct node{

	int data;
	struct node *pointr;
};
void main(){
	 struct node n[7];int i,j,k,m,s;
	 
  struct node *header;
	
		header=& n[0];
	//---creation of linked list---//
	printf("enter the data in linked list");
	for(i=0;i<7;i=i+1){
		scanf("%d",& n[i].data);
		printf(" value of i= %d",i);
		printf("\n");
	}
	//--------pointer assignment---// 
	for(j=0;j<6;j++){
		n[j].pointr=&n[j+1];
		}
		
		n[6].pointr= (struct node*)'0'; 
		//---printing result--//  
		for(k=0;k<7;k++){
			printf("%d",&n[k]);
				printf("#");
		printf("%d",n[k].data);
		printf("#");
		printf("%d",n[k].pointr);
		printf("\n");
	}
	//---adding another node-----//
	printf("enter the node after which u want to add node");
	scanf("%d",&m);
	for(s=0;s<7;s++){
		if(n[s].data==m){
		
			break;
		}
	}
	struct node n1;
	printf("entter the node to added");
	scanf("%d",&n1.data);
	n1.pointr=n[s].pointr;
	n[s].pointr=&n1;
	//---printing again-----//
	for(k=0;k<=s;k++){
			printf("%d",&n[k]);
				printf("#");
		printf("%d",n[k].data);
		printf("#");
		printf("%d",n[k].pointr);
		printf("\n");
	}
	printf("%d",&n1);
				printf("#");
		printf("%d",n1.data);
		printf("#");
		printf("%d",n1.pointr);
		printf("\n");
		for(k=s+1;k<7;k++){
			printf("%d",&n[k]);
				printf("#");
		printf("%d",n[k].data);
		printf("#");
		printf("%d",n[k].pointr);
		printf("\n");
	} 
	getch();
}
