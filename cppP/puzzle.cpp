using namespace std;

bool prime[20];

int matrix[3][3];
int solved[3][3] = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
};

void display()
{
    for(int row = 0; row<3;row++)
        {
            for(int col = 0;col<3;col++)
            {
                cout<<matrix[row][col]<<" ";
            }
            cout<<endl;
        }
        cout<<endl<<endl;

}

bool check(){
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(matrix[i][j]!=solved[i][j])
                return false;
        }
    }
    return true;
}

int min(int a,int b)
{
    return (a<b)?a:b;
}

void generate(){
    memset(prime,true,sizeof(prime));
    for(int i=2;i*i<20;i++){
        if(prime[i]==true)
        {
            for(int j=2*i;j<20;j+=i)
                prime[j]=false;
        }
    }
}

int getMoves(int row, int col){
    if(row < 0 ||col< 0 || row>=3||col>=3){
        return 0;
    }
    if(check()){
        return 0;
    }

    int moves = 0;

    for(int i = row-1 ; i<= row+1 ;i++)
    {
        for(int j = col -1 ; j<=col+1;j++)
        {
            if((i!=row-1&&j!=col-1)||(i!=row+1&&j!=col+1)||(i!=row+1&&j!=col-1)||(i!=row-1&&j!=col+1)){

                if(prime[matrix[row][col]+matrix[i][j]]==true)
                {
                    moves+=getMoves(i,j);
                    int temp;
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[row][col];
                    matrix[row][col] = temp;
                    display();
                }
            }   
        }
    }
    return moves;
}

int Moves(){
    int minMoves = INF;
    for(int row = 0;row<3;row++)
    {
        for(int col = 0;col<3;col++)	
        {
            int moves = getMoves(row,col);
            minMoves = min(moves,minMoves);
        }
    }
    return minMoves;
}



int main(){
    generate();
    int t;
    cin>>t;
    while(t--)
    {
        for(int row = 0; row<3;row++)
        {
            for(int col = 0;col<3;col++)
            {
                cin>>matrix[row][col];
            }
        }

    }
    cout<<Moves();
}
