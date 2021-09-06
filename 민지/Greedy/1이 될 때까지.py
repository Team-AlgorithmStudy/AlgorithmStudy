# N이 1이 될 때까지 반복한다 -> N이 K로 나누어질때만 선택 가능
# 반복할 연산 : 1) N에서 1을 뺀다 -> 2) N을 K로 나눈다
# 입력조건 : N(2<= N <= 100,000) 과 K(2<= N <= 100,000) 가 자연수로 주어진다 -> N은 항상 K 보다 크거나 같다
# 출력조건 : N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 횟수의 최솟값을 출력한다
# 입력예시  |  출력예시
# 25 5    |  2

import sys

N, K = map(int, sys.stdin.readline().split())

result = 0

while N >= K:
    # N이 K로 나누어떨어지지 않으면 N에서 1씩 빼기
    while N % K != 0:
        N -= 1
        result += 1
    # K로 나누기
    N //= K
    result += 1

# 마지막으로 남은 수에 대하여 1씩 빼기
while N > 1:
    N -= 1
    result += 1

print(result)

# 모범답안
answer = 0

while True :
    # N == K로 나누어 떨어지는 수 가 될 때까지 1씩 뺴기
    target = (N//K) * K
    answer += (N - target)
    N = target
    # N이 K보다 작을 때 (더이상 나눌 수 없을 때) 반복문 탈출
    if( N < K) :
        break
    # K로 나누기
    answer += 1
    N //= K

# 마지막으로 남은 수에 대하여 1씩 빼기
answer += (N -1)
print(answer)