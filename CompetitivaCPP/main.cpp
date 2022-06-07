
#include<bits/stdc++.h>

using namespace std;

const int maxn=1e3+50;
const int maxm=1e3+50;
const int inf=0x3f3f3f3f;
int movimientos[][2]={{0,1},{1,0},{0,-1},{-1,0}};

char laberinto[maxn][maxm];

struct node{
	int x,y,s,b;
	node(){}
	node(int _x,int _y,int _s,int _b):x(_x),y(_y),s(_s),b(_b){}
};

int paso[maxn][maxm];
bool visitado[maxn][maxm];
int n,m;

bool safe(int x,int y)
{
	if(!visitado[x][y]&&x>=0&&y>=0&&x<n&&y<m&&laberinto[x][y]!='#'){
		return true;
	}
	return false;
}

void bfs()
{
	node temp,chu;
	memset(visitado,false,sizeof(visitado));
	memset(paso,inf,sizeof(paso));
	queue<node>q;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(laberinto[i][j]=='F'){
				temp.x=i;temp.y=j;
				temp.s=0;temp.b=1;
				q.push(temp);
			}else if(laberinto[i][j]=='J'){
				chu.x=i;chu.y=j;
				chu.s=0;chu.b=0;
			}
		}
	}
	q.push(chu);
	paso[chu.x][chu.y]=0;
	while(!q.empty()){
		node u=q.front();
		q.pop();
		if(!u.b){
			if(u.x==0||u.x==n-1||u.y==0||u.y==m-1){
				printf("%d\n",u.s+1);
				return;
			}
		}
		for(int i=0;i<4;i++){
			temp.x=u.x+movimientos[i][0];temp.y=u.y+movimientos[i][1];
			temp.s=u.s+1;temp.b=u.b;
			if(safe(temp.x,temp.y)){
				if(temp.b){
					visitado[temp.x][temp.y]=1;
					laberinto[temp.x][temp.y]='F';
					q.push(temp);
				}else{
					if(laberinto[temp.x][temp.y]=='.'&&paso[temp.x][temp.y]>paso[u.x][u.y]+1){
						paso[temp.x][temp.y]=paso[u.x][u.y]+1;
						q.push(temp);
					}
				}
			}
		}
	}
	printf("IMPOSSIBLE\n");
}

int main()
{
	int t;
	scanf("%d",&t);
	for(int i=0;i<t;i++){
		scanf("%d%d",&n,&m);
		for(int i=0;i<n;i++){
			scanf("%s",laberinto[i]);
		}
		bfs();
	}
	return 0;
}
