#include <bits/stdc++.h>

using namespace std;

int main(){
    int n,o;
    cin>>n>>o;
    int qrow,qcol;
    cin>>qrow>>qcol;
    qrow=qrow-1;
    qcol=qcol-1;
    int row[8],col[8];
    row[0]=n-1;col[0]=0;row[2]=n-1;col[2]=n-1;row[4]=0;col[4]=n-1;row[6]=0;col[6]=0;
 row[1]=n-1;col[1]=qcol;row[3]=qrow;col[3]=n-1;row[5]=0;col[5]=qcol;row[7]=qrow;col[7]=0;
    int obrow;
    int obcol;
    for(int i=0;i<o;i++){
        cin>>obrow>>obcol;
        int a=obrow-qrow;
        int b=obcol-qcol;
        //diagonal
        if(abs(a)==abs(b)&&a>0&&b<0){
            row[0]=obrow;
            col[0]=obcol;
        }
		
        else if(abs(a)==abs(b)&&a>0&&b>0){
            row[2]=obrow;
            col[2]=obcol;
        }
        else if(abs(a)==abs(b)&&a<0&&b>0){
            row[4]=obrow;
            col[4]=obcol;
        }
        else if(abs(a)==abs(b)&&a<0&&b<0){
            row[6]=obrow;
            col[6]=obcol;
        }
        //straight
         else if(a==0&&b>0){
            row[3]=obrow;
            col[3]=obcol;
        }
        else if(a==0&&b<0){
            row[7]=obrow;
            col[7]=obcol;
        }
        else if(b==0&&a>0){
            row[1]=obrow;
            col[1]=obcol;
        }
        else if(b==0&&a<0){
            row[5]=obrow;
            col[5]=obcol;
        }
        }
    int steps=0;
    for(int i=0;i<8;i++){
        for(int j=i+1;j<8;j++){
        	if(row[i]==row[j]&&col[i]==col[j]){
        		row[j]=qrow;
        		col[j]=qcol;
			}
		}
    }
    for(int i=0;i<8;i++){
	cout<<row[i]<<" , ";cout<<col[i]<<"\n";
	}
    for(int i=0;i<8;i++){
        int m=row[i]-qrow;
        m=abs(m);
		int n=col[i]-qcol;
		n=abs(n);
        steps=steps+max(m,n);
    }
    cout<<steps;
return 0;
    }
    
