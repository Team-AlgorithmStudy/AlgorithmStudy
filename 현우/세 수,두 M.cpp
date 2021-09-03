#include<iostream>
#include<vector>
#include<algorithm>
#include<math.h>
using namespace std;
int n;
vector<long long>ar;
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		long long a;
		cin >> a;
		ar.push_back(a);
	}
	sort(ar.begin(), ar.end());
	long long ans = 0;
	for (int i = 0; i < n - 2; i++) {
		long long sum = ar[n - 1] + ar[i] + ar[i+1];
		long long t = abs(sum  - ar[i + 1] * 3);
		ans = max(ans,t);
	}
	for (int i = n - 1; i >= 2; i--) {
		long long sum = ar[0] + ar[i] + ar[i - 1];
		long long  t=abs(-sum  + ar[i - 1] * 3);
		ans = max(ans,t);
	}
	cout << ans ;
}
