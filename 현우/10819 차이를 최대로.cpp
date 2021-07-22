#include<iostream>
#include<math.h>
#include<algorithm>
using namespace std;
int n;
int ar[9];
int ex[9];
bool check[9];
int ans = 0;
void func1() {
	int k = 0;
	for (int i = 1; i < n; i++) {
		k += abs(ex[i] - ex[i + 1]);
	}
	ans = max(ans, k);
}
void func(int index) {
	if (index > n) {
		func1();
		return;
	}
	for (int i = 1; i <= n; i++) {
		if (!check[i]) {
			ex[index] = ar[i];
			check[i] = true;
			func(index + 1);
			check[i] = false;
		}
	}
}
int main() {
	cin >> n;
	for (int i = 1; i <= n; i++) {
		cin >> ar[i];
	}
	func(1);
	cout << ans;
}
