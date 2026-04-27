#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	string s;
	while(cin>>s){
		bool palindromo = true, mirrored = true;
		for(int i=0; i<s.length()/2; i++){
			if(s[i]!=s[s.length()-1-i] && palindromo) palindromo=false;
			if((s[i]=='A' && s[s.length()-1-i]!='A') || (s[i]=='E' && s[s.length()-1-i]!='3') || (s[i]=='H' && s[s.length()-1-i]!='H') ||(s[i]=='I' && s[s.length()-1-i]!='I') ||(s[i]=='J' && s[s.length()-1-i]!='L') ||(s[i]=='L' && s[s.length()-1-i]!='J') ||(s[i]=='M' && s[s.length()-1-i]!='M') || (s[i]=='O' && s[s.length()-1-i]!='O') || (s[i]=='S' && s[s.length()-1-i]!='2') || (s[i]=='T' && s[s.length()-1-i]!='T') || (s[i]=='U' && s[s.length()-1-i]!='U') || (s[i]=='V' && s[s.length()-1-i]!='V') || (s[i]=='W' && s[s.length()-1-i]!='W') || (s[i]=='X' && s[s.length()-1-i]!='X') ||(s[i]=='Y' && s[s.length()-1-i]!='Y') || (s[i]=='Z' && s[s.length()-1-i]!='5') || (s[i]=='1' && s[s.length()-1-i]!='1') || (s[i]=='2' && s[s.length()-1-i]!='S') || (s[i]=='3' && s[s.length()-1-i]!='E') || (s[i]=='5' && s[s.length()-1-i]!='Z') || (s[i]=='8' && s[s.length()-1-i]!='8') && mirrored = true) mirrored=false;
			if(!mirrored && !palindromo) break;
		}
		if(!palindromo && !mirrored) cout<<s<<" -- is not a palindrome."<<endl;
		if(palindromo && !mirrored) cout<<s<<" -- is a regular palindrome."<<endl;
		if(!palindromo && mirrored) cout<<s<<" -- is a mirrored string."<<endl;
		if(palindromo && mirrored==true) cout<<s<<" -- is a mirrored palindrome."<<endl;
	}
	return 0;
}
