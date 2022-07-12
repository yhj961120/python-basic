class Animal:
    def __init__(self):
        self.age=1
    def happyBirth(self) : 
        self.age+=1
    
class human(Animal):
    def __init__(self):
        super(). __init__()
        self.money=10000
    def albamon(self):
        self.money+=1   
    
h = human()
print(h.age)
print(h.money)
h.happyBirth()
h.albamon()
print(h.age)
print(h.money)
