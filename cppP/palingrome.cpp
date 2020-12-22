#include <iostream>
#include<vector>
#include<list>
using namespace std;

class Solution {
    //Write your code here
    vector<char>stack;
    list<char>queue;
    public:
    void pushCharacter(char ch){
        stack.push_back(ch);
        for(int i=0;i<stack.size();i++){
        	cout<<stack[i];
		}
		cout<<"\n";
    }
void enqueueCharacter(char ch) {
    queue.push_back(ch);
    list<char>::iterator i;
    for(i=queue.begin();i!=queue.end();++i){
        	cout<<*i;
		}
		cout<<"\n";
}
    char popCharacter(){
        char d=stack.back();
        cout<<"stack="<<d<<"\n";
        stack.pop_back();
        return d;
    }
    char dequeueCharacter() {
    	char m=queue.front();
    	cout<<"queue="<<m<<"\n";
    	queue.pop_front();
    	return m;
    }
};
int main() {
    string s;
    getline(cin, s);
    Solution obj;
    for (int i = 0; i < s.length(); i++) {
        obj.pushCharacter(s[i]);
        obj.enqueueCharacter(s[i]);
    }
    
    bool isPalindrome = true;
    for (int i = 0; i < s.length() / 2; i++) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
            isPalindrome = false;
            
            break;
        }
    }
    if (isPalindrome) {
        cout << "The word, " << s << ", is a palindrome.";
    } else {
        cout << "The word, " << s << ", is not a palindrome.";
    }
    
    return 0;
}
