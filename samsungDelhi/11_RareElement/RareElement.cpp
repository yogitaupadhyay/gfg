#include<iostream>
using namespace std;
#define MAX 21
int N, C;
int mat[MAX][MAX];
int rare[8][2];
int visited[8][MAX][MAX];

struct Pair{
    int first;
    int second;
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
    return (x>=0 && x<N && y>=0 && y<N);
}

void bfs(int n, int x, int y){
    Queue<Pair> queue;
    Pair p;
    p.first = x;
    p.second = y;
    queue.put(p);
    visited[n][x][y] = 0;
    while(!queue.isEmpty()){
        p = queue.get();
        x = p.first;
        y = p.second;
        if(inRange(x-1, y) && mat[x-1][y] == 1 && visited[n][x-1][y] == -1){
            visited[n][x-1][y] = visited[n][x][y] + 1;
            p.first = x-1;
            p.second = y;
            queue.put(p);
        }
        if(inRange(x+1, y) && mat[x+1][y] == 1 && visited[n][x+1][y] == -1){
            visited[n][x+1][y] = visited[n][x][y] + 1;
            p.first = x+1;
            p.second = y;
            queue.put(p);
        }
        if(inRange(x, y-1) && mat[x][y-1] == 1 && visited[n][x][y-1] == -1){
            visited[n][x][y-1] = visited[n][x][y] + 1;
            p.first = x;
            p.second = y-1;
            queue.put(p);
        }
        if(inRange(x, y+1) && mat[x][y+1] == 1 && visited[n][x][y+1] == -1){
            visited[n][x][y+1] = visited[n][x][y] + 1;
            p.first = x;
            p.second = y+1;
            queue.put(p);
        }
    }
}

void print(int n){
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            cout<<visited[n][i][j]<<" ";
        }
        cout<<endl;
    }
    cout<<endl;
}

int solve(){
    cin>>N>>C;
    for(int i=0, x, y;i<C;i++){
        cin>>rare[i][0]>>rare[i][1];
        rare[i][0]--;
        rare[i][1]--;
    }
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            cin>>mat[i][j];
            for(int k=0;k<7;k++){
                visited[k][i][j] = -1;
            }
        }
    }
    
    for(int i=0;i<C;i++){
        bfs(i, rare[i][0], rare[i][1]);
        print(i);
    }
    
    int ans = -1, tSum = 0, ansMax;
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            tSum = 0;
            for(int k=0, m=0; k<C;k++){
                if(visited[k][i][j] == -1)
                    break;
                tSum += visited[k][i][j];
                m = max(m, visited[k][i][j]);
                if(k == C-1){
                    if(ans == -1){
                        ans = tSum;
                        ansMax = m;
                    }else if(tSum<ans){
                        ans = tSum;
                        ansMax = m;
                    }
                }
            }

        }
    }
    cout<<ans<<" "<<ansMax<<endl;
}

int main(){
    int T;
    cin>>T;
    while(T--){
        solve();
    }
    return 0;
}
