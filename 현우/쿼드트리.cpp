#include<iostream>
#include<string>
using namespace std;
int n;
int ar[65][65];
void func(int y, int x, int size) {
	bool one, zero;
	one = true, zero = true;
	for (int i = y; i < y + size; i++) {
		for (int j = x; j < x + size; j++) {
			if (ar[i][j] == 1) { zero = false; }
			if (ar[i][j] == 0) { one = false; }
		}
	}

	if (one) { cout << "1"; return; }
	if (zero) { cout << "0"; return; }
	cout << "(";
	func(y, x, size/2);
	func(y, x + size / 2, size / 2);
	func(y + size / 2, x, size / 2);
	func(y + size / 2, x + size / 2, size / 2);
	cout << ")";

}
int main() {
	cin >> n;
	for (int i = 1; i <= n; i++) {
		string a;
		cin >> a;
		for (int j = 1; j <= n; j++) {
			ar[i][j] = a[j - 1]-'0';
		}
	}
	func(1, 1, n);
}
