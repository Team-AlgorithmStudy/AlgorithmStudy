#include<iostream>
#include<algorithm>
using namespace std;
int ar[50001] ;
int n;
int main() {
	cin >> n;
	for (int i = 1; i <= 50000; i++) {
		ar[i] = 987654321;
	}
	for (int i = 1; i <= 223; i++) {
		ar[i*i] = 1;
	}
	for (int j = 2; j <= n; j++) {
		int k = 1;
		while (1) {
			if (j - k*k > 0) {
				ar[j] = min(ar[j], ar[j - k * k] + 1);
				k++;
			}
			else {
				break;
			}
		}
	}
	cout << ar[n];
}
