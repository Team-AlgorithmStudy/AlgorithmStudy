#include<iostream>
#include<vector>
using namespace std;
//링의 두번째부터 지름
vector<int>ar;
//링의 개수
int n;
//첫 번째 링의 지름
int k;
int main() {
	//링개수를 저장
	cin >> n;
	//첫번째 링의 지름저장
	cin >> k;
	//첫번째 링을 제외한 지름 저장
	for (int i = 0; i < n-1; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	for (int i = 0; i < n-1; i++) {
		//첫 번째 링과 다른 링의 지름을 비교한 후 큰값 이를 t에 저장
		int t;
		if (k < ar[i]) {
			t = ar[i];
		}
		else {
			t = k;
		}
		//최대공약수 구하는 알고리즘
		while (1) {
			if (k % t==0&&k/t!=0&& ar[i]% t == 0&&ar[i]/t!=0) {
				break;
			}
			t--;
		}
		//출력
		cout << k / t << "/" << ar[i] / t<<" ";
	}
	

}