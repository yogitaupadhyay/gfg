#include<stdio.h>
#include<conio.h>
int main(){
	int a;
	char b;
	char s[10];
printf("enter the character-scanf");
scanf("%d",&a);	
printf("a= %d",a);

printf("enter the character-getch");
b=getch();
printf(" b= %d",b);	

printf("enter the character-getche");
b=getche();
printf(" b= %d",b);		

printf("enter the String-scanf");
scanf(" %s ",&s);	
printf(" %s ",s);	

printf("enter the character-gets");
gets(s);
puts(s);



return 0;
}
