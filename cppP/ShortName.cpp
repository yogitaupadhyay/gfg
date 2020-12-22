#include<stdio.h>
#include<conio.h>
#include<string.h>
int main(){
char name[25];
	gets(name);
char lastname[15];
 printf("%C. ",name[0]);
 int start=0;
 int i;

 for(int i=1;name[i]!='\0';i++){
 	if(name[i]==' '){
 		start=i+1;
 		printf("%c.",name[i+1]);
	 }
 	
 }
 printf("\b\b");
 for(int i=start;i<strlen(name);i++){
 	printf("%c",name[i]);
 }

return 0;
}
