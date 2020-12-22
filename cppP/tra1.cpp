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
cout<<t->data<<" ";	
for(k=0;t+k!=f;k++){
if(	t->left==(t+k)->data){break;} }
	preorder(t+k,f);
	for(m=0;t+m!=f;m++){
if(	t->right==(t+m)->data){break;} }
		preorder((t+m),f);	
	}
	}
	void postorder(tree*t,tree *f){
	int m,k;
	if(t!=f){
for(k=0;t+k!=f;k++){
if(	t->left==(t+k)->data){break;} }
	postorder(t+k,f);
	for(m=0;t+m!=f;m++){
if(	t->right==(t+m)->data){break;} }
		postorder((t+m),f);	
		cout<<t->data<<" ";
	}
	}
	void inorder(tree*t,tree *f){
	int m,k;
	if(t!=f){
for(k=0;t+k!=f;k++){
if(	t->left==(t+k)->data){break;} }
	inorder(t+k,f);
	cout<<t->data<<" ";
	for(m=0;t+m!=f;m++){
if(	t->right==(t+m)->data){break;} }
		inorder((t+m),f);	
		
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
cout<<"\n preorder=";
preorder(t,t+n+1);
cout<<"\n postorder=";
postorder(t,t+n+1);
cout<<"\n inorder=";
inorder(t,t+n+1);
	return 0;
}

