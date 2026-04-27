#include<bits/stdc++.h>

using namespace std;

int main(){
	int ronda = 0;
	
	while(cin>>ronda && ronda!=-1){
		cout<<"Round "<<ronda<<endl;
		
		string palabra, letras;
		cin>>palabra>>letras;
		
		set<char> pal, let;
		
		for(char c : palabra){
			pal.insert(c);
		}
		
		for(char c : letras){
			let.insert(c);
		}
		
		int op = 7;
		
		for(int i=0; i<letras.length(); i++){
			
			if(let.count(letras[i])){
				let.erase(letras[i]);
				if(pal.count(letras[i])){
					pal.erase(letras[i]);
				}else{
					op--;
				}
			}
			
			if(pal.empty()){
				cout<<"You win."<<endl;
				break;
			}
			if(op==0){
				cout<<"You lose."<<endl;
				break;
			}
		}
		if(pal.empty()==false && op>0){
			cout<<"You chickened out."<<endl;
		}
		
	}
}
