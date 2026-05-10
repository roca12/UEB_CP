/*
 * Autor: Juan Diego Gonzalez Villarreal
 * Problema: Good Morning!
 * Juez online: HackerRank
 * Veredicto: Accepted
 * URL:https://vjudge.net/problem/HackerRank-good-morning/origin
 */
#include<bits/stdc++.h>
typedef long long ll;
#define pii pair<int,int>
using namespace std;
const unordered_map<int,pii> mp = {
	{1,{0,0}},{2,{0,1}},{3,{0,2}},
	{4,{1,0}},{5,{1,1}},{6,{1,2}},
	{7,{2,0}},{8,{2,1}},{9,{2,2}},
	{0,{3,1}}
};
vector<int> vals;
bool valid(pii p1, pii p2){
	return p2.first>=p1.first && p2.second>=p1.second;
}
void precalc(){
	for(int i = 1;i<=200;i++){
		if(i<=9)vals.push_back(i);
		else{
			string tmp = to_string(i);
			bool flag = true;
			for(int j = 1;j<tmp.size();j++){
				pii p1 = mp.at(tmp[j-1]-'0'), p2 = mp.at(tmp[j]-'0');
				if(!valid(p1,p2)){
					flag = false;
					break;
				}
			}
			if(flag) vals.push_back(i);
		}
	}
}
int main(){
	precalc();
	int t;
	cin>>t;
	while(t--){
		int num;
		cin>>num;
		auto small = lower_bound(vals.begin(), vals.end(), num);
		auto large = upper_bound(vals.begin(), vals.end(), num);
		if(*small==num){
			cout<<num<<endl;
		}else{
			if(small!=vals.begin()){
				small--;
				int d1 = abs(num-*small), d2 = abs(num-*large);
				if(d1<d2)cout<<*small<<endl;
				else cout<<*large<<endl;
			}else{
				cout<<*large<<endl;
			}
		}
	}
}