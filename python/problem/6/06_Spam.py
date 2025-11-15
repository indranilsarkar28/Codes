p1 = "Click this"
p2 = "Bye this"
p3 = "Spam this"
p4 = "Subscribe this"

message = input("Enter your message: ")

if ((p1 in message) or (p2 in message) or (p3 in message) or (p4 in message)):
    print("Spam detected")
else:
    print("No spam detected")
