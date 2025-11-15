st="Hey nice to meet you"

f=open("problem/9/file_write.txt","w")

f.write(st)

f=open("problem/9/file_write.txt","r")
print(f.read())
f.close()

