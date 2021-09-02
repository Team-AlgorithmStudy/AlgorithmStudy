#include<iostream>
#include<cmath>
using namespace std;
#define nanugi 1000000007;
int n, m, k;
long long ar[1000001];
long long *tree;
long long init(int node,int start,int end) {
	if (start == end) {
		tree[node] = ar[end]%nanugi;
		return tree[node];
	}
	int mid = (start + end) / 2;
	return tree[node] = (init(node * 2, start, mid) * init(node * 2 + 1, mid + 1, end))%nanugi;
}
long long sum(int node, int start, int end, int left, int right) {
	if (left > end || right < start)return 1;
	if (left <= start && end <=right) {
		return tree[node];
	}
	if (start == end) {
		return 1;
	}
	int mid = (start + end) / 2;
	return (sum(node * 2, start, mid, left, right)*sum(node * 2 + 1, mid + 1, end, left, right) )% nanugi;
}
long long update(int node, int start, int end, int index, int now) {
	if (start > index || end < index)return tree[node];
	if (start == end)return tree[node]=now;
	int mid = (start + end) / 2;
	return tree[node]= (update(node * 2, start, mid, index, now)*update(node * 2 + 1, mid + 1, end, index, now))%nanugi;
}
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> n >> m >> k;
	int height = ceil(log2(n));
	tree = new long long[1<<height+1];
	for (int i = 0; i < n; i++) {
		cin >> ar[i];
	}
	init(1, 0, n-1);
	for (int i = 0; i < m + k; i++) {
		int a, b;
		long long c;
		cin >> a >> b >> c;
		if (a == 1) {
			update(1, 0, n-1, b-1, c);

		}
		else {
			cout << sum(1, 0, n-1, b-1, c-1) << "\n";
		}
	}
}
