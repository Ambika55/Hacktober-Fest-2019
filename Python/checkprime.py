n=int(input())
count=0
if(n==1):
    count=2
    print("1 is neither prime nor composite")
for i in range(2,n):
    if(n%i==0):
        count=1
        break
if(count==0):
    print("Prime")
elif(count==1):
    print("Not Prime")

