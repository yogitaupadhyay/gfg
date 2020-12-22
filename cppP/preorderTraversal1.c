#include<stdio.h>
#include<conio.h>
struct nodes{

	char info;
char left;
	char right;
};
void main(){
	int n,i;
	struct nodes n1[25];
	printf("enter the no of nodes");scanf("%d",&n);
printf("enter the info, left,and right nodes");
	for(i=0;i<n;i++){
		scanf("%c %c %c",&n1[i].info,&n1[i].left,&n1[i].right);
		 	}
	for(i=0;i<n;i++){
		printf("%c #  %c #  %c",n1[i].info,n1[i].left,n1[i].right);
		printf("\n");
		}
	getch();
}
 
