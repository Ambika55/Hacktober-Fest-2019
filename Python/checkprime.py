n=int(input())

div=2
while(div*div<=n):
    if(n%div==0):
        print("NOT PRIME")
        exit()
    div+=1

if(n==1):
    print("None")
else:
    print("PRIME")
