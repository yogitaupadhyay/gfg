#include <bits/stdc++.h>

using namespace std;

class SinglyLinkedListNode {
    public:
        int data;
        SinglyLinkedListNode *next;

        SinglyLinkedListNode(int node_data) {
            this->data = node_data;
            this->next = NULL;
        }
};

class SinglyLinkedList {
    public:
        SinglyLinkedListNode *head;
        SinglyLinkedListNode *tail;

        SinglyLinkedList() {
            this->head = NULL;
            this->tail = NULL;
        }

        void insert_node(int node_data) {
            SinglyLinkedListNode* node = new SinglyLinkedListNode(node_data);

            if (!this->head) {
                this->head = node;
            } else {
                this->tail->next = node;
            }

            this->tail = node;
        }
};

void print_singly_linked_list(SinglyLinkedListNode* node, string sep, ofstream& fout) {
    while (node) {
        cout << node->data;

        node = node->next;

        if (node) {
            fout << sep;
        }
    }
}

void free_singly_linked_list(SinglyLinkedListNode* node) {
    while (node) {
        SinglyLinkedListNode* temp = node;
        node = node->next;

        free(temp);
    }
}
SinglyLinkedListNode* mergeLists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {
if(head1==NULL){
    return head1;
}
    if(head2==NULL){
    return head2;
}
SinglyLinkedListNode*dummy=NULL;
if(head1->data<head2->data){
	dummy=head1;
}else if(head1->data>head2->data){
	dummy=head2;
}
 SinglyLinkedListNode*start1=head1;
 SinglyLinkedListNode*start2=head2;
 SinglyLinkedListNode*save=head1;
     SinglyLinkedListNode*next;
               cout<<"head1="<<head1<<"\n";
               cout<<"head2="<<head2<<"\n";
                          while(start1&&start2){
                              cout<<"hello"<<"\n";
                              if(start1->data<=start2->data){
                                  save=start1;
                                  cout<<"save="<<save<<"\n";
                                  start1=start1->next;
                                  cout<<"start1="<<start1<<"\n";
                                  
                              }else{
                              	cout<<"save="<<save<<"\n";
                              	cout<<"hello1s"<<"\n";
                                   save->next=start2;
                                   
                                  next=start2->next;
                                  cout<<"next="<<next<<"\n";
                                  start2->next=start1;
                                  cout<<"start2->next="<<start2->next<<"\n";
                                  start2=next;
                                  cout<<"start2="<<start2<<"\n";
                                  
                              }
                          }
     
                          if(start1==NULL&&start2!=NULL){
                              save->next=start2;
                              cout<<"save->next"<<save->next<<"\n";
                          }
cout<<"dummy="<<dummy<<"\n";
    return dummy;
}
int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int tests;
    cin >> tests;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int tests_itr = 0; tests_itr < tests; tests_itr++) {
        SinglyLinkedList* llist1 = new SinglyLinkedList();

        int llist1_count;
        cin >> llist1_count;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        for (int i = 0; i < llist1_count; i++) {
            int llist1_item;
            cin >> llist1_item;
            cin.ignore(numeric_limits<streamsize>::max(), '\n');

            llist1->insert_node(llist1_item);
        }
      
      	SinglyLinkedList* llist2 = new SinglyLinkedList();

        int llist2_count;
        cin >> llist2_count;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        for (int i = 0; i < llist2_count; i++) {
            int llist2_item;
            cin >> llist2_item;
            cin.ignore(numeric_limits<streamsize>::max(), '\n');

            llist2->insert_node(llist2_item);
        }

        SinglyLinkedListNode* llist3 = mergeLists(llist1->head, llist2->head);
cout<<"llist="<<llist3<<"\n";
        print_singly_linked_list(llist3, " ", fout);
        fout << "\n";

        free_singly_linked_list(llist3);
    }

    fout.close();

    return 0;
}

