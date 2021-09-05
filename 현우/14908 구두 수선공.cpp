#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector< pair<double, int> > arr;
int n;
int main()
{
	cin >> n;
	for (int i = 0; i < n; i++) {
		double a, b;
		cin >> a >> b;
		arr.push_back({ (a / b),i+1 });
	}
	sort(arr.begin(), arr.end());
	for (int i = 0; i < n; i++) {
		cout<< arr[i].second << " ";
	}
}
