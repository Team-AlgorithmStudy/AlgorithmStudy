#include<iostream>
#include<vector>
using namespace std;
//���� �ι�°���� ����
vector<int>ar;
//���� ����
int n;
//ù ��° ���� ����
int k;
int main() {
	//�������� ����
	cin >> n;
	//ù��° ���� ��������
	cin >> k;
	//ù��° ���� ������ ���� ����
	for (int i = 0; i < n-1; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	for (int i = 0; i < n-1; i++) {
		//ù ��° ���� �ٸ� ���� ������ ���� �� ū�� �̸� t�� ����
		int t;
		if (k < ar[i]) {
			t = ar[i];
		}
		else {
			t = k;
		}
		//�ִ����� ���ϴ� �˰���
		while (1) {
			if (k % t==0&&k/t!=0&& ar[i]% t == 0&&ar[i]/t!=0) {
				break;
			}
			t--;
		}
		//���
		cout << k / t << "/" << ar[i] / t<<" ";
	}
	

}