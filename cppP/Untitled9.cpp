#include<stdio.h>
#include<conio.h>
int main(){
	char arr[10];
//scanf("%s",arr);
gets(arr);
int len=0;
int noOfVol=0;
int ano=0, ino=0,ono=0,uno=0;
int eno=0;
for(int i=0;arr[i]!='\0';i++){
	if(arr[i]=='i'||arr[i]=='e'||arr[i]=='a'||arr[i]=='o'||arr[i]=='u'){
	if(arr[i]=='i'){
		ino+=1;
	}
	if(arr[i]=='e'){
		eno+=1;
	}
		if(arr[i]=='o'){
		ono+=1;
	}
		if(arr[i]=='a'){
		ano+=1;
	}
		if(arr[i]=='u'){
		uno+=1;
	}
	noOfVol+=1;
	}
	len=len+1;
}
printf(" len=%d",len);
printf(" vowel =%d",noOfVol);
printf(" a=%d",ano);
printf(" e=%d",eno);
printf(" i=%d",ino);
printf(" o=%d",ono);
printf(" u=%d",uno);
	getch();
return 0;	
}
