#include <bits/stdc++.h>

using namespace std;

// Complete the formingMagicSquare function below.
int formingMagicSquare(vector<vector<int> >&s) {
vector<int>row;
    vector<int>col;
    int cost=0;
    for(int i=0;i<3;i++){
         int sum=0; int  sum1=0;
        for(int j=0;j<3;j++){
        	cout<<"s="<<s[i][j]<<"\n";
            sum=sum+s[i][j];
            
        }
        sum=15-sum;
           
            row.push_back(sum);
      cout<<"s2-1="<<s[2][1];
        for(int j=0;j<3;j++){
        	
            sum1=sum1+s[j][i];
             }
            
        sum1=15-sum1;
            
            col.push_back(sum1);
        if(row[i]==col[i]){
            s[i][i]=s[i][i]+row[i];
            
            if(row[i]<0){
            	cost=cost-row[i];
			}else{
				cost=cost+row[i];
			}
        
        }else{
            s[i][i]=s[i][i]+row[i];
            if(row[i]<0){
            	cost=cost-row[i];
			}else{
				cost=cost+row[i];
			}
            s[i+1][i]=s[i+1][i]-row[i]+col[i];
             if(row[i]<0){
            	cost=cost-row[i];
			}else{
				cost=cost+row[i];
			}
			if(col[i]<0){
            	cost=cost-col[i];
			}else{
				cost=cost+col[i];
			}
    
        }
    }
    return cost;    

}

int main()
{
 vector<vector<int> >s;
    
    for( int i=0;i<3;i++){
    	vector<int>row;
        for(int j=0;j<3;j++){
            int a;
            cin>>a;
            row.push_back(a);
              }
        s.push_back(row);
    }
 int cost=formingMagicSquare(s);
    cout<<cost;
    return 0;
}

