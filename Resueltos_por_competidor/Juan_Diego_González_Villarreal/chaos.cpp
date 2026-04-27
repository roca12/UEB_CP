#include <bits/stdc++.h>

using namespace std;

vector<int> v;

int toNum(string hora) {
    string temp = hora.substr(0,2)+hora.substr(3,2);
    return stoi(temp);
}

string toString(int num) {
    string s = to_string(num);
    switch (s.size()) {
        case 1: {
            return "00:0"+s;
        }
            case 2: {
            return "00:"+s;
        }
            case 3: {
            return "0"+s.substr(0,1)+":"+s.substr(1,2);
        }
            default: {
            return s.substr(0,2)+":"+s.substr(2,2);
        }
    }
}

bool isPali(int num) {
    string s = to_string(num);
    reverse(s.begin(),s.end());
    return s == to_string(num);
}

void findPalis() {
    for (int i = 0; i<24;i++) {
        for (int j = 0;j<60;j++) {
            int num;
            if (i>0&&j<10) {
                num = stoi(to_string(i)+"0"+to_string(j));
            }else {
                num = stoi(to_string(i)+to_string(j));
            }
            if (isPali(num)) {
                v.push_back(num);
            }
        }
    }
}



int main() {
    findPalis();
    int t;
    cin>>t;
    while (t-->0) {
        string hora;
        cin>>hora;
        int num = toNum(hora);
        bool found = false;
        for (int i = 0; i<v.size(); i++) {
            if (v[i]>num) {
                hora = toString(v[i]);
                found = true;
                break;
            }
        }
        if (found) {
            cout<<hora<<endl;
        }else {
            cout<<"00:00"<<endl;
        }
    }
}
