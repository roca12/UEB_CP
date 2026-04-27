#include <bits/stdc++.h>
using namespace std;

bool esPalindromo(string s){
	string reves=s;
	reverse(reves.begin(), reves.end());
	return s == reves;
}
	
	bool comparar(char a, char b){
		char inicio[] = {'A','E','H','I','J','L','M','O','S','T','U','V','W','X','Y','Z','1','2','3','5','8'};
		char hasta[] =  {'A','3','H','I','L','J','M','O','2','T','U','V','W','X','Y','5','1','S','E','Z','8'};
		for(int i=0; i<21; i++){
			if(a == inicio[i] && b==hasta[i]) return true;
		}
		return false;
	}
		
		bool esMirrored(string s){
			for(int i=0; i<s.length(); i++){
				if(!comparar(s[i], s[s.length()-1-i])) return false;
			}
			return true;
		}
			
			
			int main(int argc, char *argv[]) {
				string s;
				while(cin>>s){
					bool palindromo = esPalindromo(s), mirrored = esMirrored(s);
					
					if(!palindromo && !mirrored) cout<<s<<" -- is not a palindrome."<<endl;
					if(palindromo && !mirrored) cout<<s<<" -- is a regular palindrome."<<endl;
					if(!palindromo && mirrored) cout<<s<<" -- is a mirrored string."<<endl;
					if(palindromo && mirrored==true) cout<<s<<" -- is a mirrored palindrome."<<endl;
					cout<<endl;
				}
				return 0;
			}
