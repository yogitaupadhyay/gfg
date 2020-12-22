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
    int m=abs(n-1-qrow);
    int p=abs(0-qcol);
    row[0]=qrow+std::min(m,p);
    col[0]=qcol-std::min(m,p);
    
    m=abs(n-1-qrow);
    p=abs(n-1-qcol);
    row[2]=qrow+std::min(m,p);
    col[2]=qcol+std::min(m,p);
    cout<<"qrow="<<qrow<<"\n";
    cout<<"qcol="<<qcol<<"\n";
     m=abs(0-qrow);
    p=abs(n-1-qcol);
    row[4]=qrow-std::min(m,p);
    col[4]=qcol+std::min(m,p);
    cout<<"row4="<<row[4];
    cout<<"col4="<<col[4]<<"\n";
    
     m=abs(0-qrow);
    p=abs(0-qcol);
    row[6]=qrow-std::min(m,p);
    col[6]=qcol-min(m,p);
    
 row[1]=n-1;col[1]=qcol;row[3]=qrow;col[3]=n-1;row[5]=0;col[5]=qcol;row[7]=qrow;col[7]=0;
    int obrow;
    int obcol;
    cout<<"0="<<o<<"\n";
    for(int i=0;i<o;i++){
        cin>>obrow>>obcol;
        obrow=obrow-1;
        obcol=obcol-1;
        int a=obrow-qrow;
        int b=obcol-qcol;
        //diagonal
        if(abs(a)==abs(b)&&a>0&&b<0){
            row[0]=obrow-1;
            col[0]=obcol+1;
            cout<<"row0="<<row[0]<<"\n";
			cout<<"col0=<<"<<col[0]<<"\n";
			
			        }
        
        else if(abs(a)==abs(b)&&a>0&&b>0){
            row[2]=obrow-1;
            col[2]=obcol-1;
             cout<<"row2="<<row[2]<<"\n";
			cout<<"col2=<<"<<col[2]<<"\n";
        }
        else if(abs(a)==abs(b)&&a<0&&b>0){
            row[4]=obrow+1;
            col[4]=obcol-1;
             cout<<"row4="<<row[4]<<"\n";
			cout<<"col4=<<"<<col[4]<<"\n";
        }
        else if(abs(a)==abs(b)&&a<0&&b<0){
            row[6]=obrow+1;
            col[6]=obcol+1;
             cout<<"row6="<<row[6]<<"\n";
			cout<<"col6=<<"<<col[6]<<"\n";
        }
        //straight
         else if(a==0&&b>0){
            row[3]=obrow;
            col[3]=obcol-1;
             cout<<"row3="<<row[3]<<"\n";
			cout<<"col3=<<"<<col[3]<<"\n";
        }
        else if(a==0&&b<0){
            row[7]=obrow-1;
            col[7]=obcol+1;
             cout<<"row7="<<row[7]<<"\n";
			cout<<"col7=<<"<<col[7]<<"\n";
        }
        else if(b==0&&a>0){
            row[1]=obrow-1;
            col[1]=obcol;
             cout<<"row1="<<row[1]<<"\n";
			cout<<"col1=<<"<<col[1]<<"\n";
        }
        else if(b==0&&a<0){
            row[5]=obrow+1;
            col[5]=obcol;
             cout<<"row5="<<row[5]<<"\n";
			cout<<"col5=<<"<<col[5]<<"\n";
        }
        }
    int steps=0;
    for(int i=0;i<8;i++){
	cout<<row[i]<<" ,"<<col[i]<<"\n";
	}
    for(int i=0;i<8;i++){
        for(int j=i+1;j<8;j++){
            if(row[i]==row[j]&&col[i]==col[j]){
                row[j]=qrow;
                col[j]=qcol;
            }
        }
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
    
