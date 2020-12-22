#include<iostream>
using namespace std;
class alpha{
	int a;
	public:
		alpha(int a1){
			a=a1;
			cout<<"a=a1"<<"\n";
		}
};
class beta:public alpha{
	int b;
	public:
		
		beta(int a1,int b1):alpha(a1)
		{
				b=b1;
			cout<<"b=b1"<<"\n";
		}
};
int main(){
	beta y(10,20);
	return 0;
}
