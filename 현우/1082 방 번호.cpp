#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int n;
int num[11] = { 0, };
int total;
int m = 51;
string ar[51];
string ans = "0";
string ma(string a, string b) {
	if (a.size() == b.size()) {
		if (a > b) {
			return a;
		}
		return b;
	}
	if (a.size() > b.size()) {
		return a;
	}
	return b;
}
void func(int k) {
	if (total < k) {
		return;
	}
	for (int i = 0; i < n; i++) {
		if (k - num[i] >= m) {
			string q = ar[k - num[i]];
			if (q[0] == '0') {
				continue;
			}
			q += i + '0';
			ar[k] = ma(ar[k], q);
		}
	}
	func(k + 1);
}
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> num[i];
		m = min(m, num[i]);
		ar[num[i]] =i + '0';
	}
	cin >> total;
	func(m+1);
	for (int i = m; i <= total; i++) {
		ans = ma(ans, ar[i]);
	}
	cout << ans;
}
