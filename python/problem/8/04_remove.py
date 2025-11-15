def remove (l , word):
    for item in l:
        l.remove(word)
        return l


l = ["indranil" , "Aritra" , "su" , "Nirupom"]
print(remove(l,"su"))