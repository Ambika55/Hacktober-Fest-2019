
import math
a = int(input("coefficient a:"))
b = int(input("coefficient b:"))
c = int(input("coefficient c:"))
posroot = (-b + (math.sqrt((b*b) - (4*a*c))))/2*a
negroot = (-b - (math.sqrt((b*b) - (4*a*c))))/2*a
print(posroot)
print(negroot)
