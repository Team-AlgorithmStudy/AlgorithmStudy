#include<iostream>
using namespace std;
int n;
int main() {
	int a[46] = { 0, };
	int b[46] = { 0, };
	a[0] = 1;
	cin >> n;
	for (int i = 1; i <= n; i++) {
		a[i] = b[i - 1];
		b[i] = a[i - 1] + b[i - 1];
	}
	cout << a[n] << " " << b[n];
}
