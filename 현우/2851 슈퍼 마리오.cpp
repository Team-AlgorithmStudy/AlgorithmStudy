#include<iostream>
#include<algorithm>
#include<vector>
#include<math.h>
using namespace std;
int main() {
	int ans = 0;
	vector<int>ar;
	for (int i = 0; i < 10; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	for (int i = 0; i < 10; i++) {
		if (ans + ar[i] <= 100) {
			ans += ar[i];
		}
		else {
			if (ans + ar[i] - 100 <= 100 - ans) {
				ans += ar[i];
			}
			break;
		}
	}
	cout << ans;
}
