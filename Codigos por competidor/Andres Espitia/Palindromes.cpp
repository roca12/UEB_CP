#include <bits/stdc++.h>
using namespace std;

string traducirLetra(char letra){
	switch(letra) {
	case 'A'  :
		return ".-";
		break;
	case 'B'  :
		return "-...";
		break;
	case 'C'  :
		return "-.-.";
		break;
	case 'D'  :
		return "-..";
		break;
	case 'E'  :
		return ".";
		break;
	case 'F'  :
		return "..-.";
		break;
	case 'G'  :
		return "--.";
		break;
	case 'H'  :
		return "....";
		break;
	case 'I'  :
		return "..";
		break;
	case 'J'  :
		return ".---";
		break;
	case 'K'  :
		return "-.-";
		break;
	case 'L'  :
		return ".-..";
		break;
	case 'M'  :
		return "--";
		break;
	case 'N'  :
		return "-.";
		break;
	case 'O'  :
		return "---";
		break;
	case 'P'  :
		return ".--.";
		break;
	case 'Q'  :
		return "--.-";
		break;
	case 'R'  :
		return ".-.";
		break;
	case 'S'  :
		return "...";
		break;
	case 'T'  :
		return "-";
		break;
	case 'U'  :
		return "..-";
		break;
	case 'V'  :
		return "...-";
		break;
	case 'W'  :
		return ".--";
		break;
	case 'X'  :
		return "-..-";
		break;
	case 'Y'  :
		return "-.--";
		break;
	case 'Z'  :
		return "--..";
		break;
	case 'a'  :
		return ".-";
		break;
	case 'b'  :
		return "-...";
		break;
	case 'c'  :
		return "-.-.";
		break;
	case 'd'  :
		return "-..";
		break;
	case 'e'  :
		return ".";
		break;
	case 'f'  :
		return "..-.";
		break;
	case 'g'  :
		return "--.";
		break;
	case 'h'  :
		return "....";
		break;
	case 'i'  :
		return "..";
		break;
	case 'j'  :
		return ".---";
		break;
	case 'k'  :
		return "-.-";
		break;
	case 'l'  :
		return ".-..";
		break;
	case 'm'  :
		return "--";
		break;
	case 'n'  :
		return "-.";
		break;
	case 'o'  :
		return "---";
		break;
	case 'p'  :
		return ".--.";
		break;
	case 'q'  :
		return "--.-";
		break;
	case 'r'  :
		return ".-.";
		break;
	case 's'  :
		return "...";
		break;
	case 't'  :
		return "-";
		break;
	case 'u'  :
		return "..-";
		break;
	case 'v'  :
		return "...-";
		break;
	case 'w'  :
		return ".--";
		break;
	case 'x'  :
		return "-..-";
		break;
	case 'y'  :
		return "-.--";
		break;
	case 'z'  :
		return "--..";
		break;	
	case '0'  :
		return "-----";
		break;
	case '1'  :
		return ".----";
		break;
	case '2'  :
		return "..---";
		break;
	case '3'  :
		return "...--";
		break;
	case '4'  :
		return "....-";
		break;
	case '5'  :
		return ".....";
		break;
	case '6'  :
		return "-....";
		break;
	case '7'  :
		return "--...";
		break;
	case '8'  :
		return "---..";
		break;
	case '9'  :
		return "----.";
		break;
	}
	return "";
}
	
	bool isPalindromo(string s){
		for(int i=0; i<s.length(); i++){
			if(s[i]!=s[s.length()-1-i]) return false;
		}
		return true;
	}
		
		int main(int argc, char *argv[]) {
			string s;
			getline(cin,s);
			string imp ="";
			for(int i=0; i<s.length(); i++){
				imp += traducirLetra(s[i]);
			}
			string comp = imp;
			reverse(comp.begin(),comp.end());
			if(imp == "") cout<<"NO";
			else if(imp == comp) cout<<"YES";
			else cout<<"NO";
			cout<<endl;
			return 0;
		}
