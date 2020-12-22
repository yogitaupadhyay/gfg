#include<stdio.h>
#include<conio.h>
int main(){
	//pointer array
	char *p[5]={
		"hari",
		"suresh",
		"dinesh",
		"kalpana"
	};
//	int arr[]={1,2,3,4,5};
	int i=0;

	
	for(i=0;i<5;i++){
		printf("%s\n",p[i]);
		printf("%s\n",*(p+i));
	 
	}
return 0;	
}
