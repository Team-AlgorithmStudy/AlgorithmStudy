#include<iostream>
#include<queue>
#include<vector>
using namespace std;
int main() {
	int n;
	cin >> n;
	vector<long long>dis;
	vector<long long>gas;
	priority_queue<long long>q;
	long long ans = 0;
	for (int i = 0; i < n - 1; i++) {
		long long a;
		cin >> a;
		dis.push_back(a);
	}
	for (int i = 0; i < n; i++) {
		long long a;
		cin >> a;
		gas.push_back(-a);
	}
	for (int i = 0; i < n - 1; i++) {
		q.push(gas[i]);
		ans -= q.top()*dis[i];
	}
	cout << ans;
}
