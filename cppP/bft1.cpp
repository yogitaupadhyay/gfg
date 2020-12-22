#include <bits/stdc++.h>	

using namespace std;

class Node {
    public:
        int data;
        Node *left;
        Node *right;
        Node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

class Solution {
    public:
  		Node* insert(Node* root, int data) {
            if(root == NULL) {
                return new Node(data);
            } else {
                Node* cur;
                if(data <= root->data) {
                    cur = insert(root->left, data);
                    root->left = cur;
                } else {
                    cur = insert(root->right, data);
                    root->right = cur;
               }

               return root;
           }
        }
        void levelOrder(Node * root) {
queue<int>q;
        q.push(root->data);
        while(!q.empty()){
            int t=q.front();
            cout<<t;
            q.pop();
            Node* start=root;
            cout<<"t="<<t<<"\n";
            
            cout<<"start="<<start->data<<"\n";
            while(start->data!=t){
            	cout<<"hello \n";
                 if(t<start->data){
                start=start->left;
            }else if(t>start->data){
                start=start->right;
            }
            }
           cout<<"start-left-data="<<start->left->data<<"\n";
            
            q.push(start->left->data);
            q.push(start->right->data);
        }
         }
         }; //End of Solution

int main() {
  
    Solution myTree;
    Node* root = NULL;
    
    int t;
    int data;

    std::cin >> t;

    while(t-- > 0) {
        std::cin >> data;
        root = myTree.insert(root, data);
    }
  
	myTree.levelOrder(root);
    return 0;
}

