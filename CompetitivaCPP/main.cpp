// C++ code to implement the approach

#include <bits/stdc++.h>
using namespace std;

// Function to count different empty cells
// he can pass through while avoiding
// the obstacles
int numberOfCells(int n, int m, int r,
				  int c, int u, int d,
				  vector<vector<char> >& mat)
{
	// If cell having Obstacle
	if (mat[r] == '#')
		return 0;
	
	queue<vector<int> > que;
	int cnt = 0;
	int i = 0;
	int j = 0;
	
	mat[r] = '#';
	que.push({ r, c, u, d });
	
	// BFS traversal of the matrix
	while (que.size()) {
		auto& f = que.front();
		int rr = f[0];
		int cc = f[1];
		int uu = f[2];
		int dd = f[3];
		que.pop();
		
		++cnt;
		
		// Move left
		i = rr;
		j = cc - 1;
		if (0 <= j && mat[i][j] == '.') {
			
			// Mark the cell visited
			mat[i][j] = '#';
			que.push({ i, j, uu, dd });
		}
		
		// Move right
		i = rr;
		j = cc + 1;
		if (j < m && mat[i][j] == '.') {
			
			// Mark the cell visited
			mat[i][j] = '#';
			que.push({ i, j, uu, dd });
		}
		
		// Move up
		i = rr - 1;
		j = cc;
		if (0 <= i && mat[i][j] == '.' && uu) {
			
			// Mark the cell visited
			mat[i][j] = '#';
			que.push({ i, j, uu - 1, dd });
		}
		
		// Move down
		i = rr + 1;
		j = cc;
		if (i < n && mat[i][j] == '.' && dd) {
			
			// Mark the cell visited
			mat[i][j] = '#';
			que.push({ i, j, uu, dd - 1 });
		}
	}
	
	// Return the count
	return cnt;
}

// Driver code
int main()
{
	int N = 3, M = 3, R = 1, C = 0;
	int U = 1, D = 1;
	vector<vector<char> > mat = { { '.', '.', '.' },
	{ '.', '#', '.' },
	{ '#', '.', '.' } };
	
	// Function call
	cout << numberOfCells(N, M, R, C, U, D, mat);
	return 0;
}
