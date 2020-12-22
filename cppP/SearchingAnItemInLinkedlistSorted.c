/*binary search cannot be aplied at linked list because there is no way of indexing middle element of linkedlist*/

#include<stdio.h>
#include<conio.h>
struct node{
int data;
	struct node *pointr;
};
void main(){
	struct node n[7];	struct node *header;	struct node *p;	int i,item;	header=&n[0];
printf("enter the data in linked list in increasing order");
for(i=0;i<7;i++){
	scanf("%d",&n[i].data);
}
for(i=0;i<6;i++){
n[i].pointr=&n[i+1];
}
	n[6].pointr=(struct node*)'\0';
	p=header;
	printf("enter the item to be searched");
	scanf("%d",&item);
	while(p!='\0'){
		if(item>p->data&&item<n[6].data){
			p=p->pointr;
		}
		else if(item==p->data){
			printf("item  %d is present at %d  ",item ,p);
			exit(0);
		}
			else{
			printf("item not present");
			break;
		}
		
	}
		getch();
}

