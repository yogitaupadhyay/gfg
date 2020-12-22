#include <iostream>
using namespace std;
#define MAX 100

int X, Y, L;
int row, col;
int a[MAX][MAX];
bool visited[MAX][MAX];
int ans;

struct Pair{
    int first;
    int second;
    int l;
};

template <class Item>
class Queue{
    struct node{
        Item item;
        node* next;
        node(Item i){
            item = i;
            next = NULL;
        }
    };
    typedef node* link;
    link head;
    link tail;
    int size;
public:
    Queue(){
        head = NULL;
        tail = NULL;
        size = 0;
    }
    void put(Item item){
        link temp = tail;
        tail = new node(item);
        if(head == NULL){
            head = tail;
        }else{
            temp->next = tail;
        }
        size++;
    }
    Item get(){
        size--;
        Item item = head->item;
        head = head->next;
        if(head == NULL){
            tail = NULL;
        }
        return item;
    }
    bool isEmpty(){
        return (size == 0);
    }
};

bool inRange(int x, int y){
    return (x>=0 && x<row && y>=0 && y<col);
}

bool right(int x, int y){
    return (a[x][y] == 1 || a[x][y] == 3 || a[x][y] == 4 || a[x][y] == 5);
}

bool left(int x, int y){
    return (a[x][y] == 1 || a[x][y] == 3 || a[x][y] == 6 || a[x][y] == 7);
}

bool up(int x, int y){
    return (a[x][y] == 1 || a[x][y] == 2 || a[x][y] == 4 || a[x][y] == 7);    
}

bool down(int x, int y){
    return (a[x][y] == 1 || a[x][y] == 2 || a[x][y] == 5 || a[x][y] == 6);
}

void flow(int x, int y, int l){
    //cout<<x<<" "<<y<<" "<<endl;
    if(l == 0){
        return;
    }
    if(!visited[x][y]) ans++;
    visited[x][y] = true;
    if(inRange(x-1, y) && up(x, y) && down(x-1, y)){
        flow(x-1, y, l-1);
    }
    if(inRange(x+1, y) && down(x, y) && up(x+1, y)){
        flow(x+1, y, l-1);
    }
    if(inRange(x, y-1) && left(x, y) && right(x, y-1)){
        flow(x, y-1, l-1);
    }
    if(inRange(x, y+1) && right(x, y) && left(x, y+1)){
        flow(x, y+1, l-1);
    }

}

void flow(int x, int y){
    Queue<Pair> queue;
    Pair p;
    p.first = x;
    p.second = y;
    p.l = L;
    int l;
    visited[x][y] = true;
    queue.put(p);
    while(!queue.isEmpty()){
        p = queue.get();
        x = p.first;
        y = p.second;
        l = p.l;
        if(l == 0){
            continue;
        }
        ans++;
        if(inRange(x-1, y) && !visited[x-1][y] && up(x, y) && down(x-1, y)){
            p.first = x-1;
            p.second = y;
            p.l = l-1;
            visited[x-1][y] = true;
            queue.put(p);
        }
        if(inRange(x+1, y) && !visited[x+1][y] && down(x, y) && up(x+1, y)){
            p.first = x+1;
            p.second = y;
            p.l = l-1;
            visited[x+1][y] = true;
            queue.put(p);
        }
        if(inRange(x, y-1) && !visited[x][y-1] && left(x, y) && right(x, y-1)){
            p.first = x;
            p.second = y-1;
            p.l = l-1;
            visited[x][y-1] = true;
            queue.put(p);
        }
        if(inRange(x, y+1) && !visited[x][y+1] && right(x, y) && left(x, y+1)){
            p.first = x;
            p.second = y+1;
            p.l = l-1;
            visited[x][y+1] = true;
            queue.put(p);
        }
    }
}

int solve(){
    cin>>row>>col>>X>>Y>>L;
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            cin>>a[i][j];
            visited[i][j] = false;
        }
    }
    ans = 0;
    if(a[X][Y]>0)
        flow(X, Y);
    cout<<"Ans = "<<ans<<endl<<endl;
}

int main(){
    int T;
    cin>>T;
    for(int i=0;i<T;i++){
    	//cout<<"#"<<i<<" ";
        solve();
    }
    return 0;
}
/**
5 6 2 2 6
3 0 0 0 0 3
2 0 0 0 5 6
1 3 4 1 1 1
2 0 2 0 0 2
0 0 4 3 1 1
*/
