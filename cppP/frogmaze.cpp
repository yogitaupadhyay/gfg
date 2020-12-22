#include <cstdio>
#include <cmath>
#include <iostream>
#include <set>
#include <algorithm>
#include <vector>
#include <map>
#include <cassert>
#include <string>
#include <cstring>
#include <queue>

using namespace std;

#define rep(i,a,b) for(int i = a; i < b; i++)
#define S(x) scanf("%d",&x)
#define S2(x,y) scanf("%d%d",&x,&y)
#define P(x) printf("%d\n",x)
#define all(v) v.begin(),v.end()
#define FF first
#define SS second
#define pb push_back
#define mp make_pair

typedef long long int LL;
typedef pair<int, int > pii;
typedef vector<int > vi;

int dx[4] = {-1, 0, 1, 0};
int dy[4] = {0, 1, 0, -1};

int n,m;
string s[20];
bool vis[20][20][2];
pii tunnel[20][20];
int M[20][20];

double G[400][400];
double X[400];

void dfs(int x, int y, int f) {
  // printf("%d %d\n",x,y);
  if(x < 0 || x >= n || y < 0 || y >= m) {
    return;
  }
  if(s[x][y] == '#' || s[x][y] == '*' || vis[x][y][f]) {
    return;
  }
  if(f && tunnel[x][y] != mp(x,y)) {
    dfs(tunnel[x][y].FF, tunnel[x][y].SS, 0);
    return;
  }
  vis[x][y][f] = true;
  if(s[x][y] == '%') {
    return;
  }
  rep(i,0,4) {
    dfs(x + dx[i], y + dy[i], 1);
  }
}

int main() {
  int k;
  scanf("%d%d%d",&n,&m,&k);
  pii st;
  rep(i,0,n) {
    cin >> s[i];
    rep(j,0,m) if(s[i][j] == 'A') st = mp(i,j);
  }

  rep(i,0,n) rep(j,0,m) tunnel[i][j] = mp(i,j);
  rep(i,0,k) {
    int x1,y1;
    S2(x1,y1); x1--; y1--;
    int x2,y2;
    S2(x2,y2); x2--; y2--;
    tunnel[x1][y1] = mp(x2,y2);
    tunnel[x2][y2] = mp(x1,y1);
  }
  dfs(st.FF, st.SS, 0);
  int cnt = 0;
  memset(M, -1, sizeof(M));
  rep(i,0,n) rep(j,0,m) if(vis[i][j][0] || vis[i][j][1]) {
    M[i][j] = cnt++;
  }

  int eq = 0;
  bool ok = false;
  rep(i,0,n) rep(j,0,m) if(vis[i][j][0] || vis[i][j][1]) {
    if(s[i][j] == '%') {
      ok = true;
      G[eq][M[i][j]] = 1.0;
      X[eq] = 1.0;
      eq++;
      continue;
    }
    vi v;
    int good = 0;
    rep(k,0,4) {
      int a = i + dx[k];
      int b = j + dy[k];
      if(a < 0 || a >= n || b < 0 || b >= m) continue;
      if(s[a][b] == '#') continue;
      if(tunnel[a][b] != mp(a,b)) {
        int aa = tunnel[a][b].FF;
        int bb = tunnel[a][b].SS;
        a = aa; b = bb;
      }
      good++;
      if(vis[a][b][0] || vis[a][b][1]) {
        v.pb(M[a][b]);
      }
    }
    G[eq][M[i][j]] = -1.0;
    rep(k,0,v.size()) {
      G[eq][v[k]] = 1.0 / (double)good;
    }
    eq++;
  }
  if(!ok) {
    P(0);
    return 0;
  }

  assert(eq == cnt);

  rep(i,0,eq) {
    if(G[i][i] == 0.0) {
      int id = -1;
      rep(j,i+1,eq) if(G[j][i]) {
        id = j;
        break;
      }
      if(id == -1) continue;
      rep(j,0,eq) swap(G[i][j], G[id][j]); swap(X[i], X[id]);
    }

    X[i] /= G[i][i];
    rep(j,i+1,eq) G[i][j] /= G[i][i];
    G[i][i] = 1.0;

    rep(j,i+1,eq) if(G[j][i]) {
      rep(k,i+1,cnt) {
        G[j][k] -= G[i][k] * G[j][i];
      }
      X[j] -= X[i] * G[j][i];
      G[j][i] = 0.0;
    }
  }

  for(int i = eq - 1; i >= 0; i--) {
    for(int j = i - 1; j >= 0; j--) {
      for(int k = j - 1; k >= 0; k--) {
        G[j][k] -= G[j][i] * G[i][k];
      }
      X[j] -= X[i] * G[j][i];
      G[j][i] = 0;
    }
  }
  // rep(i,0,eq) {
  //   rep(j,0,eq) printf("%lf ",G[i][j]); printf("\n");
  // }
  printf("%lf\n",X[M[st.FF][st.SS]]);
  return 0;
}
