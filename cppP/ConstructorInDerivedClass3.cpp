#include<iostream>
using namespace std;
class alpha{
	int a;
	public:
		alpha(){
			a=0;
			cout<<"a=0"<<"\n";
		}
};
class beta:public alpha{
	int b;
	public:
		beta(int b1){
			b=b1;
			cout<<"b=b1"<<"\n";
		}
};
int main(){
	beta y(10);
	return 0;
}
