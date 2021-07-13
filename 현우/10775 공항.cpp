#include<iostream>
#include<vector>
using namespace std;
int g, p;
int ar[100001];
int parent(int a) {
	if (ar[a] == a)return a;
	return ar[a]=parent(ar[a]);
}
void change(int a) {
	int k = parent(a);
	ar[a] = parent(k-1);
}
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0); //cin 실행속도 향상
	cin >> g >> p;
	int cnt = 0;
	for (int i = 1; i <= g; i++) {
		ar[i] = i;
	}
	bool check = false;
	for (int i = 0; i <p; i++) {
		int air;
		cin >> air;
		int k = parent(air);
		if (check) {
			continue;
		}
		if (k > 0) {
			cnt++;
			change(k);
		}
		else {
			check = false;
			break;
		}
	}
	cout << cnt;
}
