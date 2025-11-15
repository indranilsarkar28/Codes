import random

# def game():
#     print("Start Game")
#     score = random.randint(1,62)
#     with open ("problem/9/file.txt") as f:
#         highScore = f.read()
#         if(highScore!=""):
#             highScore = int (highScore)
#         else:
#             highScore = 0
    
#     print(f"Your score {score}")
#     with open ("problem/9/file.txt","w") as f:
#         if(highScore<score):
#             f.write(str(score))
    
#     return score()

# game()








def game():
    print("Game Start")
    score=random.randint(1,62)
    with open ("problem/9/file.txt") as f:
        hiscore = f.read()
        if(hiscore!=""):
            hiscore=(int)(hiscore)
        else:
            hiscore=0
    
    print(f"Your score : {score}")
    if(score>hiscore):
        with open ("problem/9/file.txt" , "w") as f:
            f.write(str(score))
            
    return score;


game()
