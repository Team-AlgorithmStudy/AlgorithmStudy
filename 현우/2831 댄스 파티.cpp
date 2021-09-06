#include<iostream>
#include<queue>
#include<algorithm>
#include<math.h>
using namespace std;
int n;
int main() {
	priority_queue<int>pb, mb, pg, mg;
	cin >> n;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		if (a > 0) {
			pb.push(a);
		}
		else {
			mb.push(-a);
		}
	}
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		if (a > 0) {
			pg.push(a);
		}
		else {
			mg.push(-a);
		}
	}
	int ans = 0;
	while (1) {
		if (pb.empty() || mg.empty()) {
			break;
		}
		if (pb.top() < mg.top()) {
			ans++;
			pb.pop();
			mg.pop();
		}
		else {
			pb.pop();
		}
	}
	while (1) {
		if (mb.empty() || pg.empty()) {
			break;
		}
		if (mb.top() > pg.top()) {
			ans++;
			mb.pop();
			pg.pop();
		}
		else {
			pg.pop();
		}
	}
	cout << ans;
	
}
