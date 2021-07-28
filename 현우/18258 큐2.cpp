#include<iostream>
#include<queue>
#include<string>
using namespace std;
int n;
int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(NULL);
	std::cout.tie(NULL);
	cin >> n;
	queue<int>ar;
	for (int i = 0; i < n; i++) {
		string a;
		cin >> a;
		if (a == "push") {
			int k;
			cin >> k;
			ar.push(k);
		}
		else if (a == "pop") {
			if (ar.empty()) {
				cout << "-1" << "\n";
				continue;
			}
			cout << ar.front() << "\n";
			ar.pop();
		}
		else if (a == "size") {
			cout << ar.size() << "\n";
		}
		else if (a == "empty") {
			cout << ar.empty() << "\n";
		}
		else if (a == "front") {
			if (ar.empty()) {
				cout << "-1" << "\n";
			}
			else {
				cout << ar.front() << "\n";
			}
		}
		else if (a == "back") {
			if (ar.empty()) {
				cout << "-1" << "\n";
			}
			else {
				cout << ar.back() << "\n";
			}
		}

	}
}
