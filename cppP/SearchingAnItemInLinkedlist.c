#include<stdio.h>
#include<conio.h>
struct node{

	int data;
	struct node *pointr;
};
void main(){
	struct node n[7];
	struct node *header;	struct node *p;
	int i,item;
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
	printf("enter the item to be searched");
	scanf("%d",&item);
	while(p!='\0'){
		if(item==p->data){
			break;
		}
		else{
			p=p->pointr;
		}
	}
	if(p!='\0'){
		printf("item  %d is present at %d  ",item ,p);
	}
	else{
			printf("item is not present");
	}
	getch();
	}
