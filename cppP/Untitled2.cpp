#include<stdio.h>
#include <conio.h>

int main(){
	
for(int i=0;i<=6;i++){
	for(int j='A';j<=('G'-i);j++){
		printf("%c",j);
	}
	
	for(int k=0;k<(2*i-1);k++){
		printf(" ");
	}
	for(int j=('G'-i);j>='A';j--){
			if(j!='G'){
			printf("%c",j);
	    	}
	}
	printf("\n");
}

return 0;
}




