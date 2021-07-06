#include<iostream>
#include<queue>
#include<string>
#include<stack>
using namespace std;
string n;
int main() {
	cin >> n;
	queue<char>ar;
	for (int i = 0; i < n.size(); i++) {
		ar.push(n[i]);
	}
	stack<char>br;
	int answer = 0;
	bool check = true;
	int k = 1;
	while (!ar.empty()) {
		if (ar.front() == '(' || ar.front() == '[') {
			br.push(ar.front());
			check = true;
			if (ar.front() == '(') {
				k *= 2;
			}
			else {
				k *= 3;
			}
			ar.pop();
		}
		else {
			if (ar.front() == ')') {
				if (br.empty() || br.top() != '(') {
					answer=0;
					break;
				}
				else {
					br.pop();
					if (check) {
						answer += k;
						check = false;
					}
					k /= 2;
				}
			}
			else {
				if (br.empty() || br.top() != '[') {
					answer=0;
					break;
				}
				else {
					br.pop();
					if (check) {
						answer += k;
						check = false;
					}
					k /= 3;
					
				}
			}
			ar.pop();
		}
	}
	if (!br.empty()) {
		cout << "0";
	}
	else {
		cout << answer;
	}
	
}
