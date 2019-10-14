from math import gcd

def lcm(a,b):
    return int(a*b/gcd(a,b))

a = int(input())
b = int(input())
c = int(input())
print(lcm(lcm(a,b),c))
