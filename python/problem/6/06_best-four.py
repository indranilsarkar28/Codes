a = int(input("Enter a letter: "))
b = int(input("Enter b letter: "))
c = int(input("Enter c letter: "))
d = int(input("Enter d letter: "))

if(a>b and a>c and a>d):
    print("a is the largest")
if(b>a and b>c and b>d):
    print("b is the largest")
if(c>a and c>b and c>d):
    print("c is the largest")
if(d>a and d>b and d>c):
    print("d is the largest")