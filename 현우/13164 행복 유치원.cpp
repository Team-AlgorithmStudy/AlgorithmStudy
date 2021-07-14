#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n, k;
int main() {
	cin >> n >> k;
	vector<int>ar;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	vector<int>dif;
	for (int i = 1; i < n; i++) {
		dif.push_back(ar[i] - ar[i - 1]);
	}
	sort(dif.begin(), dif.end());
	int ans = 0;
	for (int i = 0; i < dif.size()-k+1; i++) {
		ans += dif[i];
	}
	cout << ans;
}
