#include <bits/stdc++.h>
using namespace std;

bool isPalindrome(string s)
{
	string reves=s;
	reverse(reves.begin(), reves.end());
	return s == reves;
}

bool isMirrored(string s)
{
	
	for(int i=0; i<s.size(); i++){
		if(s[i]!=s[i-1-i]) return false;
	}
	return true;
}

int main()
{  
	char normal[] = {'A', 'E', 'H', 'I', 'J', 'L',
		'M', 'O', 'S', 'T', 'U', 'V',
		'W', 'X', 'Y', 'Z', '1', '2',
		'3', '5', '8'};
	char espejo[]   = {'A', '3', 'H', 'I', 'L', 'J',
		'M', 'O', '2', 'T', 'U', 'V',
		'W', 'X', 'Y', '5', '1', 'S', 
		'E', 'Z', '8'};
	
	string s;
	while (cin >> s)
	{
		bool palindromo = isPalindrome(s);
		bool mirrored = isMirrored(s);
		
		cout <<s<< " -- "; 
		if (!palindromo && !mirrored)
			cout<<"is not a palindrome."<< endl;
		else if (palindromo && !mirrored)
			cout<<"is a regular palindrome."<<endl;
		else if (!palindromo && mirrored)
			cout<<"is a mirrored string."<< endl;
		else 
			cout<<"is a mirrored palindrome."<< endl;
		cout << endl;
	}
	return 0;
}
