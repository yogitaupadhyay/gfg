#include <bits/stdc++.h>

using namespace std;
int main()
{
    int r,t,m=0,j=0;
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    vector<int>vect;
while(n>0){
    t++;
      r=n%2;
    n=n/2;
    vect.push_back(r);
}
vector<int>p;
    for(int i=0;i<t;i++){
        if(vect[i]==1){
           m++; 
        }
        if(vect[i]==0){
			j++;
        	p.push_back(m);
		 m=0;
        }
    }
    j++;p.push_back(m);
    sort(p.begin(),p.end());
cout<<p[j-1];
    return 0;
}

