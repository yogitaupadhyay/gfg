#include <bits/stdc++.h>

using namespace std;

// Complete the isBalanced function below.
string isBalanced(string s) {
    vector<char>arr;
for(int i=0;i<s.length();i++){
    if(s.at(i)=='['||s.at(i)=='{'||s.at(i)=='('){
     arr.push_back(s.at(i));   
    }else if(s.at(i)==']'||s.at(i)=='}'||s.at(i)==')'){
        cout<<"s="<<s.at(i)<<"\n";
        if(s.at(i)==']'){
            if(arr.back()=='['){
                cout<<"arr_back="<<arr.back()<<"\n";
                arr.pop_back();
            }else{
                
                 return "NO";
            }
            
        }else  if(s.at(i)=='}'){
            if(arr.back()=='{'){
                  cout<<"arr_back="<<arr.back()<<"\n";
                 arr.pop_back();
            }else{
                cout<<"arr_back="<<arr.back()<<"\n";
                 return "NO";
            }
           
        }else if(s.at(i)==')'){
            if(arr.back()=='('){
                  cout<<"arr_back="<<arr.back()<<"\n";
            arr.pop_back();
            }else{
                cout<<"arr_back="<<arr.back()<<"\n";
                  return "NO";
            }
    }
}
    
 }
    if(arr.empty()){
       
         return "YES";
    }else{
         arr.clear();
        return "NO";

    }
}

int main()
{
  

    int t;
    cin >> t;
   

    for (int i = 0; i < t; i++) {
        string s;
       cin>>s;

        string result = isBalanced(s);

        cout << result << "\n";
    }
    return 0;
}

