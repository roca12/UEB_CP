#include <bits/stdc++.h>
using namespace std;

string preorder, inorder;

string build(string preorder, string inorder) {
    if (preorder.empty()) return "";
    char root = preorder[0];
    int pos = inorder.find(root);
    string inLeft = inorder.substr(0, pos);
    string inRight = inorder.substr(pos + 1);
    string preLeft = preorder.substr(1, inLeft.size());
    string preRight = preorder.substr(1 + inLeft.size());
    return build(preLeft, inLeft) + build(preRight, inRight) + root;
}

int main() {
    while (cin >> preorder >> inorder) {
        cout << build(preorder, inorder) << endl;
    }
    return 0;
}