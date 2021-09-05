# N : 배열의 크기, M : 숫자가 더해지는 횟수, K : 연속 가능한 횟수
# 문제 : 첫째줄에 N,M,K 의 자연수가 주어지며 공백으로 주어진다
# 둘째줄에 N개의 자연수가 주어진다 => N 은 1 이상 10,000 이하의 수
# K는 항상 M 보다 작거나 같다
# 예시 (입력)
# 5 8 3
# 2 4 5 4 6
# 출력
# 46

import sys
# N,M,K 공백으로 구분하여 입력받기
N,M,K = map(int, sys.stdin.readline().split())

# N개의 수를 공백으로 구분하여 입력받기
data = list(map(int,sys.stdin.readline().split()))

# 입력받은 수들 정렬
data.sort()
# 가장 큰 수
first = data[N - 1]
# 두 번째로 큰 수
second = data[N - 2]

result = 0

while True:
    # 가장 큰 수를 K번 더하기
    for i in range(K):
        # M이 0 이라면 반복문 끝
        if M == 0 :
            break
        # result 에 가장 큰 수 더하기
        result += first
        # 더할 때마다 1씩 빼기
        M -= 1
        # M이 0이라면 반복문 끝
    if M == 0 :
        break
    # 두 번째로 큰 수를 한번 더하기
    result += second
    # 더할 때마다 1씩 빼기
    M -= 1
print(result)

# 위의 문제를 수학적으로 풀이했을 경우(시간초과시)
# 예시 (입력)
# 5 8 3
# 2 4 5 4 6
# 출력
# 46

# *** 반복되는 수열에대해 파악하기
# => (6+6+6+5) + (6+6+6+5) = 46
# -> 6+6+6+5 : 반복되는 수열의 형태
# 수열의 길이 -> K(3) + 1 = 4
# => M(8) 을 (K + 1)로 나눈 몫이 수열이 반복되는 횟수가 된다
# 반복되는 횟수(2)에 K(3) 을 곱해주면 가장 큰 수가 등장하는 횟수가 된다 -> 6번
# * M(8)이 (K+1)로 나누어 떨어지지 않는 경우도 고려해야 한다 -> M을 (K+1)로 나눈 나머지 만큼 가장 큰 수가 추가로 더해지므로 이를 고려해야 한다
# **=> 가장 큰 수가 더해지는 횟수의 식 : int(M / (K+1)) * K + M %(K+1)
# N,M,K 공백으로 구분하여 입력받기
N,M,K = map(int, sys.stdin.readline().split())

# N개의 수를 공백으로 구분하여 입력받기
data = list(map(int,sys.stdin.readline().split()))

# 입력받은 수들 정렬
data.sort()
# 가장 큰 수
first = data[N - 1]
# 두 번째로 큰 수
second = data[N - 2]

# 가장 큰 수가 더해지는 횟수 계산
count = int(M /(K+1)) * K
count += M % (K+1)

result = 0
# 가장 큰 수 더하기
result += (count) * first
# 두 번째로 큰 수 더하기
result += (M - count) * second

print(result)