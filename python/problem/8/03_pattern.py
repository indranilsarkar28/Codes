def pattern(n,s):
    if(n==0):
        return 
    print(" "*s , end="")
    print("*"*n)
    pattern (n-1,s+1)

n = int(input("enter a number : "))
pattern(n,0)