#include<iostream>
using namespace std;
int n;
long long zero[91];
long long  one[91];
int main() {
	cin >> n;
	zero[1] = 0, one[1] = 1, zero[2] = 1, one[2] = 0;
	for (int i = 2; i <= n; i++) {
		zero[i] = zero[i - 1] + one[i - 1];
		one[i] = zero[i - 1];
	}
	cout << zero[n] + one[n];
}
