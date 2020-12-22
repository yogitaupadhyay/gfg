#include<stdio.h>
#include<conio.h>
#include<string.h>
int main(){
char name[5][10];
char temp[10];
 for(int i=0;i<5;i++){
 	gets(name[i]);
 }
 for(int i=0;i<5;i++){
 	for(int j=i+1;j<5;j++){
 		if(strcmp(name[j],name[i])<0){
 			strcpy(temp,name[j]);
 			strcpy(name[j],name[i]);
 			strcpy(name[i],temp);
		 }
	 }
 }
 for(int i=0;i<5;i++){
 	puts(name[i]);
 }

return 0;
}
