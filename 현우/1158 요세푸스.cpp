#include<iostream>
#include<queue>
using namespace std;
int n, k;
int main() {
	cin >> n >> k;
	queue<int>ar;
	for (int i = 1; i <= n; i++) {
		ar.push(i);
	}
	cout << "<";
	int time = k;
	while (!ar.empty()) {
		time--;
		if (time == 0) {
			cout <<ar.front();
			time = k;
			ar.pop();
			if (!ar.empty()) {
				cout << ", ";
			}
		}
		else {
			ar.push(ar.front());
			ar.pop();
		}
		
		
	}
	cout << ">";
}
