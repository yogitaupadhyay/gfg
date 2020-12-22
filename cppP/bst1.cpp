#include <iostream>
#include <cstddef>

using namespace std;
class node{
	public:
		int data;
		node*left;
		node*right;
		node(int d){
			data=d;
			left=NULL;
			right=NULL;
		}
};
class solution{
public:
	node* insert(node*root,int data){
		if(root==NULL){
			return new node(data);
		}
			else{
				node*cur;
				if(data<=root->data){
					cur=insert(root->left,data);
					root->left=cur;
				}
				else{
					cur=insert(root->right,data);
					root->right=cur;
				}
			}
			return root;
	}
	int getheight(node*root){
		if(root==NULL){
			return -1;
		}
		int leftheight=getheight(root->left);
		int rightheight=getheight(root->right);
		return (leftheight>rightheight?leftheight:rightheight) +1;
	}
};
int main(){
	int data;
	node*root=NULL;
	solution mytree;
	int n;
	cin>>n;
	while(n-->0){
		cin>>data;
		root=mytree.insert(root,data);
		}
	int height=mytree.getheight(root);
	cout<<height;
	return 0;
}
