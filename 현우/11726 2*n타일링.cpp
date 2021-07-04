#include<iostream>
using namespace std;
int n;
long long ar[1001] = { 0, };
int k = 10007;
int main() {
	cin >> n;
	ar[1]=1,ar[2] = 2, ar[3] = 3;
	for (int i = 4; i <= 1000; i++) {
		ar[i] = ar[i - 2]%k +ar[i-1]%k;
		ar[i] %= k;
	}
	cout << ar[n];
}
