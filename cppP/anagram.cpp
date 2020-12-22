#include <bits/stdc++.h>

using namespace std;

// Complete the makeAnagram function below.
int makeAnagram(string a, string b) {
    int la=a.length();
    int lb=b.length();
    for(int j=0;j<b.length();j++){
for(int i=0;i<a.length();i++){
    if(b[j]==a[i]){
    b[j]='0';a[i]='0';
        lb=lb-1;la=la-1;
        break;
    }
    }
    }
    return la+lb;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string a;
    getline(cin, a);

    string b;
    getline(cin, b);

    int res = makeAnagram(a, b);

    cout << res << "\n";

    

    return 0;
}

