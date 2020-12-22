#include<iostream>
using namespace std;
class tree{
public:
	char data;
	char left;
	char right;
};
void preorder(tree*t,tree *f){
	int m,k;
	if(t!=f){
		if(t->left=='0'&&t->right=='0'){
cout<<t->data;	
}
else{
for(k=0;t+k!=f;k++){
if(	t->left==(t+k)->data)
{
break;	
}
}

	preorder(t+k,f);
	for(m=0;t+m!=f;m++){
if(	t->right==(t+m)->data)
{
break;	
}
}
		preorder((t+m),f);	
}
	}

			}
int main(){
	int n;
	cin>>n;
	tree *t=new tree[n];
	for(int i=0;i<n;i++){
cin>>t[i].data>>t[i].left>>t[i].right;
		}
tree *root=t;
preorder(t,t+n+1);

	return 0;
}

