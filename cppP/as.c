
#include<stdio.h>
#include<string.h>

int  main(){
	int i;
	for(i=0;i<256;i++){
		printf("%d==%c",i,i);
		printf("\n");
		printf("+=%c",'+');
			printf("-=%c",'-');
				printf("*=%c",'*');
					printf("/=%c",'/');
	}
return 0;	
}
