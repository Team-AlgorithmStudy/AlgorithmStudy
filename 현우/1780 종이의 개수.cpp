#include<iostream>
using namespace std;
int ar[2188][2188];
int n;
int o = 0, z = 0, m = 0;
void func(int y, int x, int size) {
	bool one, zero, minus;
	one = true, zero = true, minus = true;
	for (int i = y; i < y + size; i++) {
		for (int j = x; j < x + size; j++) {
			if (ar[i][j] == 1) { zero = false, minus = false; }
			if (ar[i][j] == 0) { one = false, minus = false; }
			if (ar[i][j] == -1) { zero = false,one = false; }
		}
	}
	if (one) { o++; return; }
	if (zero) { z++; return; }
	if (minus) { m++; return; }
	func(y, x, size / 3);
	func(y, x+size/3, size / 3);
	func(y, x + (size*2) / 3, size / 3);
	func(y+size/3, x, size / 3);
	func(y+size/3, x+size/3, size / 3);
	func(y + size / 3, x +( size*2) / 3, size / 3);
	func(y + (size * 2) / 3, x, size / 3);
	func(y + (size*2) / 3, x + size / 3, size / 3);
	func(y + (size * 2) / 3, x + (size*2) / 3, size / 3);
}
int main() {
	cin >> n;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			cin>>ar[i][j];
		}
	}
	func(1, 1, n);
	cout << m << "\n";
	cout << z << "\n";
	cout << o << "\n";
}
