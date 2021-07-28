#include<iostream>
using namespace std;
int n;
int ar[129][129];
int o = 0;
int z = 0;
void func(int x, int y, int size) {
	bool zero = true;
	bool one = true;
	for (int i = y; i <y+ size; i++) {
		for (int j = x; j <x+ size; j++) {
			if (ar[i][j] == 1)zero = false;
			if (ar[i][j] == 0)one = false;
		}
	}
	if (zero) { z++; return; }
	if (one) { o++; return; };
	func(x, y, size / 2);
	func(x, y + size / 2, size / 2);
	func(x + size / 2,y, size / 2);
	func(x + size / 2, y + size / 2, size / 2);
}
int main() {
	cin >> n;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			cin >> ar[i][j];
		}
	}
	func(1, 1, n);
	cout << z << "\n";
	cout << o << "\n";
}
