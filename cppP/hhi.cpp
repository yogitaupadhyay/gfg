#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference {
    private:
    vector<int> elements;
  
  	public:
  	int maximumDifference;
  	Difference (vector<int> &a){
  		    for(int i=0;i<a.size();i++){
     elements.push_back(a[i]);
       
    }
}
 void computeDifference(){
    vector<int>d;
    for(int i=0;i<elements.size();i++){
        for(int j=i+1;j<elements.size();j++){
          int de= elements[i]-elements[j] ;
              if(de<0){
                  de=-de;
              }
            d.push_back(de);
              
        }
    }
    sort(d.begin(),d.end());
    maximumDifference=d[d.size()-1];
}
}; // End of Difference class

int main() {
    int N;
    cin >> N;
    
    vector<int> a;
    
    for (int i = 0; i < N; i++) {
        int e;
        cin >> e;
        
        a.push_back(e);
    }

    Difference d(a);
    
    d.computeDifference();
    
    cout << d.maximumDifference;
    
    return 0;
}
