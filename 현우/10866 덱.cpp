#include<iostream>
#include<string>
#include<deque>
using namespace std;
int n;
deque<int>de;
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		string a;
		cin >> a;
		if (a == "push_back") {
			int k;
			cin >> k;
			de.push_back(k);
		}
		else if (a == "push_front") {
			int k;
			cin >> k;
			de.push_front(k);
		}
		else if (a == "pop_front") {
			if (de.empty()) {
				cout << "-1" << "\n";
			}
			else {
				cout << de.front() << "\n";
				de.pop_front();
			}
		}
		else if (a == "pop_back") {
			if (de.empty()) {
				cout << "-1" << "\n";
			}
			else {
				cout << de.back() << "\n";
				de.pop_back();
			}
		}
		else if (a == "size") {
			cout << de.size() << "\n";
		}
		else if (a == "empty") {
			cout << de.empty() << "\n";
		}
		else if (a == "front") {
			if (de.empty()) {
				cout << "-1" << "\n";
			}
			else {
				cout << de.front() << "\n";
			}
		}
		else if (a == "back") {
			if (de.empty()) {
				cout << "-1" << "\n";
			}
			else {
				cout << de.back() << "\n";
			}
		}
	}
}
