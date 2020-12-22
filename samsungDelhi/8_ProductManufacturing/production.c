#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

#define MAX(a,b) (a>b)?(a):(b)

int D; /*CPU*/;
int E; /*Memory*/;
int F; /*Board*/;
int d; /*cpu price per unit*/
int e; /*memory price per unit*/
int N; /*model*/
int model[8][4]; /*0-CPU, 1-Memory, 2-Board,3-Price*/
int visited[8];
int max_cost;

void getMax(int c, int m, int b, int n, int cost)
{
	int i, j;
	max_cost = MAX(max_cost, (cost+ c*d + m*e));

	if ((n == 4) || (c == 0) || (m == 0) || (b == 0))
	{
		return;
	}

	for (i = 0; i < N; i++)
	{
		if (visited[i] == 0)
		{
			visited[i] = 1;
			j = 1;
			while (1)
			{
				if ((j*model[i][0] <= c) && (j*model[i][1] <= m) && (j*model[i][2] <= b))
					getMax(c - j*model[i][0], m - j*model[i][1], b - j*model[i][2], n + 1, cost + j*model[i][3]);
				else
					break;
				j++;
			}
		}
		visited[i] = 0;
	}
}


int main()
{
	int tc, T;
	int i;

	//freopen("input.txt", "r", stdin);
	//setbuf(stdout, NULL);
	scanf("%d", &T);
	for (tc = 1; tc <= T; tc++)
	{
		scanf("%d", &D);
		scanf("%d", &E);
		scanf("%d", &F);
		scanf("%d", &d);
		scanf("%d", &e);
		scanf("%d", &N);
		for (i = 0; i < N; i++)
		{
			visited[i] = 0;
			scanf("%d", &model[i][0]);
			scanf("%d", &model[i][1]);
			scanf("%d", &model[i][2]);
			scanf("%d", &model[i][3]);
		}
		max_cost = 0;
		getMax(D, E, F, 1, 0);

		printf("case#%d %d\n", tc, max_cost);
	}
	return 0;
}