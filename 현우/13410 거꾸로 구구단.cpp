#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;
int n, k;
vector<string>ar;
vector<int>br;
int main() {
	cin >> n >> k;
	for (int i = 1; i <= k; i++) {
		int number = n * i;
		ar.push_back(to_string(number));
		reverse(ar[i-1].begin(), ar[i-1].end());
		br.push_back(stoi(ar[i-1]));
	}
	sort(br.begin(), br.end());
	cout << br[k - 1];
	
}
