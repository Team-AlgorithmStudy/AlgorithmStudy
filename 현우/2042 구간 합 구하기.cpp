#include<iostream>
#include<vector>
#include<cmath>
using namespace std;
int n, m, k;
static long long ar[1000001];
long long *tree;
long long inIt(int start, int end, int node) {
	if (start == end) {
		tree[node] = ar[start];
		return tree[node];
	}
	int mid = (start + end) / 2;
	return tree[node] = inIt(start, mid, node * 2) + inIt(mid + 1, end, node * 2 + 1);
}
long long sum(int start, int end, int node, int left, int right) {
	if (left > end || right < start)return 0;
	if (left <= start && end <= right)return tree[node];
	int mid = (start + end) / 2;
	return (sum(start, mid, node * 2,left,right) + sum(mid + 1, end, node * 2 + 1,left,right));
}
void update(int start, int end, int node, int index, long long dif) {
	if (index<start || index>end) {
		return;
	}
	tree[node] += dif;
	if (start == end)return;
	int mid = (start + end) / 2;
	update(start, mid, node * 2,index, dif);
	update(mid + 1,end, node * 2 + 1, index,dif);
}
int main() {
	cin >> n >> m >> k;
	for (int i = 0; i <n; i++) {
		cin >> ar[i];
	}
	int height = ceil(log2(n));
	tree = new long long[1 << (height + 1)];
	inIt(0,n-1, 1);
	for (int i = 0; i < m + k; i++) {
		long long a, b, c;
		cin >> a >> b >> c;
		if (a == 1) {
			long long diff = c - ar[b - 1];
			ar[b - 1] = c;
			update(0, n-1, 1, b-1, diff);
		}
		else if(a==2){
			cout<<sum(0, n-1, 1, b-1, c-1)<<"\n";
		}
	}
}
