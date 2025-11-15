class Employee:
    language = "pythone"
    salary = 120000

    def __init__(self,name,salary,language):
        self.name=name
        self.salary=salary
        self.language=language
        print("I am creation a object  ")

harry = Employee("Indranil" , 1220000 , "java")
print(harry.name , harry.salary , harry.language)