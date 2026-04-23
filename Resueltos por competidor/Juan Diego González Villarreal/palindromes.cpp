#include <bits/stdc++.h>

using namespace std;

unordered_map <char,char> revs = {
    {'A','A'},{'E', '3'},{'H', 'H'},{'I','I'},
    {'J', 'L'},{'L','J'},{'M','M'},{'O','O'},
    {'S','2'},{'T','T'},{'U','U'},{'V','V'},
    {'W','W'},{'X','X'},{'Y','Y'},{'Z', '5'},
    {'1','1'},{'2','S'},{'3','E'},{'5','Z'},
    {'8','8'}
};

bool esPalindromo(string cadena){
    string temp;
     for(int i = cadena.length()-1; i>=0; i--){
            temp+=cadena[i];
        }
    return cadena == temp;
}

bool esEspejo(string cadena){
    string temp;
    string rev;
    for(char c: cadena){
        if(revs.find(c)!=revs.end()){
            temp+=revs[c];
        }else{
            temp+=c;
        }
    }
    for(int i = temp.length()-1; i>=0; i--){
            rev+=temp[i];
    }
    return cadena == rev;
}

int main(){
    string line;
    while(cin>>line){
        bool mirror = esEspejo(line);
        bool palindrome = esPalindromo(line);
        if(mirror && palindrome){
            cout<<line<<" -- is a mirrored palindrome."<<endl;
        }else if(mirror && !palindrome){
             cout<<line<<" -- is a mirrored string."<<endl;
        }else if(palindrome && !mirror){
             cout<<line<<" -- is a regular palindrome."<<endl;
        }else{
             cout<<line<<" -- is not a palindrome."<<endl;
        }
    }
}