def prime(n):
    for i in range(2,n):
        if n%i==0:
            return False
    return True
sum=0
for i in range(2,11):
    if(prime(i)):
        sum=sum+i

print(sum)