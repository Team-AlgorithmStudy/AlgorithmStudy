#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main() {
	int n;
	cin >> n;
	vector<int>ar;
	long long ans = 0;
	long long sum = 0;
	for (int i = 0; i < n; i++) {
		long long a;
		cin >> a;
		ar.push_back(a);
		ans = max(ans, a);
		sum += a;
	}
	if (sum - ans >= ans) {
		if (sum % 2 == 1) {
			cout << 1;
		}
		else {
			cout << 0;
		}
	}
	else {
		cout << -sum +ans*2;
	}
}
