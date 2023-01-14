#include <bits/stdc++.h>
#define len(x) x.size()
using namespace std;

int main(){
    int n;
    cin>>n;
    cin.ignore();
    string maze[n];
    for(int i=0;i<n;i++){
        cin>>maze[i];
    }
    int col = 0, rows = 0;
    for(int i=0;i<n;i++){
        if(maze[i][0]=='0'){
            int zeros = count(maze[i].begin(), maze[i].end(), '0');
            if(zeros == len(maze[i])){
                rows++;
            }
        }
    }
    for(int i=0;i<n;i++){
        if(maze[0][i]=='0'){
            int zeros = 0;
            for(int j=0;j<n;j++){
                if(maze[j][i]=='0'){
                    zeros++;
                }
            }
            if(zeros == len(maze[i])){
                col++;
            }
        }
    }
    cout<<((rows==col)?"+":((rows>col)?"-":"|"))<<endl;
    return 0;
}
