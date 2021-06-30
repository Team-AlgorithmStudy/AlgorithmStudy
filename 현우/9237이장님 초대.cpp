#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n;
vector<int>tree;
bool compare(int a, int b) {
	return a > b;
}
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int day;
		cin >> day;
		tree.push_back(day);
	}
  //내림차순
	sort(tree.begin(), tree.end(), compare);
	int ma = 0;
	for (int i = 0; i < n; i++) {
		ma = max(ma, tree[i] + 2 + i);
	}
	cout << ma;
}
