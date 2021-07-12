#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main() {
	int n;
	cin >> n;
	vector<float>ar;
	for (int i = 0; i < n; i++) {
		float num;
		cin >> num;
		ar.push_back(num);
	}
	
	sort(ar.begin(), ar.end());
	cout << fixed;
	cout.precision(3);
	for (int i = 0; i < 7; i++) {
		cout << ar[i] << "\n";
	}

}
