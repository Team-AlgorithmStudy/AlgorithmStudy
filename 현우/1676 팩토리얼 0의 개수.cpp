#include<iostream>
#include<algorithm>
using namespace std;
long long a=0;
long long b=0;

int n;
int main() {
	cin >> n;
	for (int i = 1; i <= n; i++) {
		int k = i;
		while (1) {
			if (k % 2 == 0) {
				k /= 2;
				a++;
				continue;
			}
			if (k % 5 == 0) {
				k /= 5;
				b++;
				continue;
			}
			break;
		}
	}
	cout << min(a, b);
}
