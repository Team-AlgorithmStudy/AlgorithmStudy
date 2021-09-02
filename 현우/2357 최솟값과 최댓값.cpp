#include<iostream>
#include<vector>
#include<cmath>
#include<algorithm>
using namespace std;
#define maxnum 1000000001
int n, m;
vector<int>ar;
int *maxtree;
int *mintree;
int maxInit(int node, int start, int end) {
	if (start == end)return maxtree[node] = ar[start];
	int mid = (start + end) / 2;
	return maxtree[node] = max(maxInit(node * 2, start, mid), maxInit(node * 2 + 1, mid + 1, end));
}
int minInit(int node, int start, int end) {
	if (start == end)return mintree[node] = ar[start];
	int mid = (start + end) / 2;
	return mintree[node] = min(minInit(node * 2, start, mid), minInit(node * 2 + 1, mid + 1, end));
}
int maxSearch(int node, int start, int end, int left, int right) {
	if (end < left || start > right)return 0;
	if (left <= start && end <= right) {
		return maxtree[node];
	}
	if (start == end)return 0;
	int mid = (start + end) / 2;
	return max(maxSearch(node * 2, start, mid, left, right), maxSearch(node * 2 + 1, mid + 1, end, left, right));
}
int minSearch(int node, int start, int end, int left, int right) {
	if (end < left || start > right)return maxnum;
	if (left <= start && end <= right) {
		return mintree[node];
	}
	if (start == end)return maxnum;
	int mid = (start + end) / 2;
	return min(minSearch(node * 2, start, mid, left, right), minSearch(node * 2 + 1, mid + 1, end, left, right));
}
int main() {
	ios_base :: sync_with_stdio(false);
cin.tie(NULL);
cout.tie(NULL);
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	int height = ceil(log2(n));
	maxtree = new int[1 << (height + 1)];
	mintree = new int[1 << (height + 1)];
	maxInit(1, 0, n - 1);
	minInit(1, 0, n - 1);
	for (int i = 0; i < m; i++) {
		int start, end;
		cin >> start >> end;
		cout << minSearch(1, 0, n - 1, start-1, end-1) << " " << maxSearch(1, 0, n - 1, start-1, end-1) << "\n";
	}

}
