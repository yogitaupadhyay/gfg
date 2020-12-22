#include <bits/stdc++.h>

using namespace std;
int countingValleys(int n, string s) {
    int valley=0;
    int sealevel=0;
   int psl;
for(int i=0;i<n;i++){
    
    if(s[i]=='U'){
        psl=sealevel;
        sealevel++;
    }else if(s[i]=='D'){
         psl=sealevel;
        sealevel--;
    }
    if(sealevel==-1&&psl==0){
        valley++;
    }
}
return valley;
}

int main()
{
   
    int n;
    cin >> n;
  string s;
    cin>>s;
  int res= countingValleys(n,s);
    cout<<res;
   return 0;
}

