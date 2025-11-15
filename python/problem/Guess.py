import random 

n = random.randint(1,99)
a = -1
count = 1
while(a != n):
    
    a = int(input("Guess the number :"))
    if(a>n):
        print("Nuber is to large")
    if(a<n):
        print("Number is too low")

    count +=1

print(f"congress your score is :{count}")
    

    
 