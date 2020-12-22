#include<stdio.h>
#include<conio.h>
int main(){
	char arr[10];
//scanf("%s",arr);
gets(arr);
int len=0;

for(int i=0;arr[i]!='\0';i++){
	len+=1;
	}
int k=len-1;
for(int j=0;j<len/2;j++){
	if(arr[j]!=arr[k]){
		printf("no is not palindrome ");
		break;
	}
	k--;
}
if(k==len/2){
	printf("no is palindrome");
}
printf(" len=%d",len);

	getch();
return 0;	
}
