f=open("problem/9/file_write.txt","r")
line = f.readline();
while(line !=""):
    print(line,end=" ")
    print(",")
    line = f.readline();