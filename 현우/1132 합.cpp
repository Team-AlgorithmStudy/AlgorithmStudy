#include<iostream>
#include<string>
#include<algorithm>
#include<stdlib.h>
#include<vector>
using namespace std;
int n;
string ar;
long long num[10] = { 0, };
bool check[10];
long long ans=0;
vector<pair<long long,bool>>p;
bool compare(pair<long long,bool>  a, pair<long long,bool> b) {
	return a.first > b.first;
}
void calc(string a) {
	long long k= 1;
	
	for (int i = a.size() - 1; i >= 0; i--) {
		if (i == 0) {
			check[a[0] - 'A'] = true;
		}
		int q = a[i] - 'A';
		num[q] += k;
		k *= 10;	
	}
}
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> ar;
		calc(ar);
	}
	for (int i = 0; i <= 9; i++) {
		if (num[i] == 0) {
			continue;
		}
		p.push_back(make_pair(num[i],check[i]));
	}
	sort(p.begin(), p.end(),compare);
	if (p.size() == 10) {
		for (int i = 9; i >= 0; i--) {
			if (!p[i].second) {
				long long w = p[i].first;
				p.erase(p.begin() + i);
				p.push_back(make_pair(w, false));
				break;
			}
		}
	}
	
	int t = 9;
	for (int i = 0; i < p.size(); i++) {
		ans +=t * p[i].first;
		t--;
	}
	cout << ans;
}
