#include<iostream>
#include<vector>
#include<cmath>
#include<algorithm>
using namespace std;
int n, m;
#define minnum 1000000001;
vector<int>ar;
int *tree;
int init(int node, int start, int end) {
	if (start == end)return tree[node] = ar[start];
	int mid = (start +end)/2;
	return tree[node] = min(init(node * 2, start, mid), init(node * 2+1, mid + 1, end));
}
int searchMin(int node, int start, int end, int left, int right) {
	if (start > right || end < left)return minnum;
	if (left <= start && end <= right)return tree[node];
	if (start == end)return minnum;
	int mid = (start + end) / 2;
	return min(searchMin(node * 2, start, mid, left, right), searchMin(node * 2 + 1, mid + 1, end, left, right));
}
int main() {
	cin >> n >> m;
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	int height = ceil(log2(n));
	tree = new int[1 << (height + 1)];
	init(1, 0, n - 1);
	for (int i = 0; i < m; i++) {
		int start, end;
		cin >> start >> end;
		cout << searchMin(1, 0, n - 1, start - 1, end - 1) << "\n";
	}
}
