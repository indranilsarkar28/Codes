import random
while(1):
    print('''
1)play
2)Exit''')
    check=int(input("Enter your choice:"))
    if(check !=1 and check!=2):
        print("Give correct input")
        continue
    if(check==2):
        break
    if(check==1):
        computer = random.choice([1,-1,0])
        your = input('''Enter your choice 
s = Stone
p = Paper
s = Siser
=> ''')
        youDic={"s":1 , "p":-1 , "s":0}
        reversDic={1:"Stone" , -1:"Paper" , 0:"Siser"}
        you = youDic[your]
        print(f"You chose :- {reversDic[you]}\nComputer chose :- {reversDic[computer]}")
        if(computer==you):
            print("oops! Draw")
        else:
            if(computer==1 and you==-1):
                print("You win")
            elif(computer==1 and you==0):
                print("Loose")
            if(computer==-1 and you==0):
                print("You win")
            elif(computer==-1 and you==1):
                print("Loose")
            if(computer==0 and you==1):
                print("You win")
            elif(computer==0 and you==-1):
                print("Loose")


