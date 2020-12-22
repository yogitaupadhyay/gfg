#include<iostream>
using namespace std;
class alpha{
	int a;
	
};
class beta:public alpha{
	int b;
	public:
		beta(){
			b=0;
			cout<<"b=0"<<"\n";
		}
		beta(int b1){
			b=b1;
			cout<<"b=b1"<<"\n";
		}
};
int main(){
	beta x;
	beta y(10);
	return 0;
}
