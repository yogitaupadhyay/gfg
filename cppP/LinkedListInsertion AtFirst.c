
#include<stdio.h>
#include<conio.h>
struct node{

	int data;
	struct node *pointr;
};
void main(){
	 struct node n[7];int i,j,k;
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
	struct node n1;
	printf("entter the node to added");
	scanf("%d",&n1.data);
	//---adding a node----//
	n1.pointr=&n[0];
	header=&n1;
	//----------again printing----//
		printf("%d",&n1);
				printf("#");
		printf("%d",n1.data);
		printf("#");
		printf("%d",n1.pointr);
		printf("\n");
		for(k=0;k<7;k++){
			printf("%d",&n[k]);
				printf("#");
		printf("%d",n[k].data);
		printf("#");
		printf("%d",n[k].pointr);
		printf("\n");
	}

	getch();
}
