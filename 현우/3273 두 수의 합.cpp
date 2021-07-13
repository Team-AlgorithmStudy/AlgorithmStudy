#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int n;
	cin >> n;
	vector<int>ar;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	int num;
	cin >> num;
	sort(ar.begin(), ar.end());
	int cnt = 0;
	for (int i = 0; i < n - 1; i++) {
		int sum = ar[i];
		if (num - sum < sum) {
			break;
		}
		for (int j = i + 1; j < n; j++) {
			if (sum + ar[j] == num) {
				cnt++;
			}
			else if (sum + ar[j] > num) {
				break;
			}
		}
	}
	cout << cnt;
}
