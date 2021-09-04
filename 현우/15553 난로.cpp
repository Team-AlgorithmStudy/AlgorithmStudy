#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n, k;
vector<int>ar;
vector<int>time;
bool compare(int a, int b) {
	return a > b;
}
int main() {
	cin >> n >> k;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	int totalTime = ar[n - 1] - ar[0] + 1;
	for (int i = 1; i < n; i++) {
		time.push_back(ar[i] - ar[i - 1]-1);
	}
	sort(time.begin(), time.end(),compare);
	k--;
	int cnt = 0;
	while (k != 0) {
		totalTime -= time[cnt];
		cnt++;
		k--;
	}
	cout << totalTime;
	

}
