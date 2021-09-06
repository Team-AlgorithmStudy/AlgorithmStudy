#include<iostream>
#include<math.h>
#include<vector>
using namespace std;
#define division 10007
int n;
int main() {
	cin >> n;
	long long ans = 1;
	while (n >= 5) {
		ans *= 3;
		ans %= division;
		n -= 3;
	}
	cout << (ans*n) % division;
}
