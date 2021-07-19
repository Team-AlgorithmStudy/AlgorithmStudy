#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;
int n, m;
bool check[201];
vector<int>v[201];
int ans = 0;
bool func1(int i) {
	bool re = true;
	for (int k = 0; k < v[i].size(); k++) {
		if (check[v[i][k]]) {
			re = false;
			break;
		}
	}
	return re;
}
void func(int num,int start) {
	if (num == 3) {
		ans++;
		return;
	}
	for (int i = start; i <= n; i++) {
		if (func1(i)) {
			check[i] = true;
			func(num + 1, i + 1);
			int k = ans;
			check[i] = false;
		}
		
	}
	return;

}
int main() {
	cin >> n >> m;
	for (int i = 0; i < m; i++) {
		int a, b;
		cin >> a >> b;
		if (b > a) {
			int swap = b;
			b = a;
			a = swap;
		}
		v[a].push_back(b);
	}
	func(0,1);
	cout << ans;

}
