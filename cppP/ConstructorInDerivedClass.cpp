#include<iostream>
using namespace std;
class alpha{
	int a;
	public:
		alpha(){
			a=0;cout<<" alpha 0"<<"\n";
		}
		alpha(int a1){
			a=a1;cout<<" alpha 1"<<"\n";
		}
};
class beta:public alpha{
	int b;
	public:
		void input(){
			cout<<"hello";
		}
};
int main(){
	beta x;
	
	return 0;
}
