#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int func(int a, int b)
{
	if (b == 0) return a;
	return func(b, a % b);
}
int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int n;
	cin >> n;
	vector<int>ar;
	vector<int>br;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	sort(ar.begin(), ar.end());
	vector<int>ans;
	int gcd = ar[1] - ar[0];
	for (int i = 2; i < n; i++) {
		gcd = func(gcd, ar[i] - ar[i - 1]);
	}
	int start = gcd;
	int k = start;
	for (int i = 2; i * i <= gcd; i++)
		if (gcd % i == 0)
		{
			ans.push_back(i);
			ans.push_back(gcd / i);
		}
	ans.push_back(gcd);
	sort(ans.begin(), ans.end());
	ans.erase(unique(ans.begin(), ans.end()), ans.end());
	for (int i = 0; i < ans.size(); i++) {
		cout << ans[i] << " ";
	}
	if (ans.size() == 0) {
		cout << "0";
	}
}
