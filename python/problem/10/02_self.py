class Employee:
    language = "python"
    salary = 122000

    def getInfo(self):
        print(f"The language is {self.language}. The salary is {self.salary}")


harry = Employee()
harry.getInfo()