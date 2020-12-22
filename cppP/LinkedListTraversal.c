#include<stdio.h>
#include<conio.h>
struct node{

	int data;
	struct node *pointr;
};
void main(){
	struct node n[7];
	struct node *header;	struct node *p;
	int i;
	header=&n[0];
printf("enter the data in linked list");
for(i=0;i<7;i++){
	scanf("%d",&n[i].data);
	
}
for(i=0;i<6;i++){
n[i].pointr=&n[i+1];

}
	n[6].pointr=(struct node*)'\0';
	p=header;
	printf("traversed data");
	while(p!='\0'){
		printf(" %d ",p->data);
		p=p->pointr;
	}
	getch();
	
}
