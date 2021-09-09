import sys

a = 500
b = 100
c = 50
d = 10
e = 5
f = 1

n = int(sys.stdin.readline())

m = int(1000 - n)
count = 0

while True:
    if m >= a:
        m -= a
        count += 1
        if m == 0:
            break
    elif m >= b:
        m -= b
        count += 1
        if m == 0:
            break
    elif m >= c:
        m -= c
        count += 1
        if m == 0:
            break
    elif m >= d:
        m -= d
        count += 1
        if m == 0:
            break
    elif m >= e:
        m -= e
        count += 1
        if m == 0:
            break
    elif m >= f:
        m -= f
        count += 1
        if m == 0:
            break

print(count)
