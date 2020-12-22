#include<stdio.h>
#include <conio.h>

int main(){
	int n,r;
printf("enter number  n,r");
scanf("%d %d",&n ,&r);
int fn=1,fr=1,fnr=1;
for(int j=1;j<=n;j++){
	fn=fn*j;
	if(j<=r){
		fr=fr*j;
	}
	if(j<n-r){
		fnr=fnr*j;
	}
	
}
int result=fn/(fr*fnr);
	printf("%d",result);
return 0;
}




