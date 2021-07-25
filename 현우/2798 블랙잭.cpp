#include<iostream>
#include<vector>
#include<algorithm>
#include<math.h>
using namespace std;
int n, m;
vector<int>ar;
int ans = 0;
bool check[101];
void func1() {
	int sum = 0;
	for (int i = 0; i < n; i++) {
		if (check[i]) {
			sum += ar[i];
		}
	}
	if (sum <= m) {
		ans = max(ans, sum);
	}
	
}
void func(int num,int start) {
	if (num == 3) {
		func1();
		return;
	}
	for (int i = start; i < n; i++) {
		check[i] = true;
		func(num + 1, i+1);
		check[i] = false;
	}
}
int main() {
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		int k;
		cin >> k;
		ar.push_back(k);
	}
	func(0, 0);
	cout << ans;
}
