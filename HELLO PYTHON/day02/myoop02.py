class Xi:
    def __init__(self):
        self.money = 1000
    def steal(self,smoney):
        self.money += smoney

class Putin:
    def __init__(self):
        self.nuclear =5000
    def alzheimer(self):
        self.nuclear -= 1
        
class JungEun:
    def __init__(self):
        self.missile = 10000
    def ssorau(self):
        self.missile -=100 
                
class Sungwoo(Xi,Putin,JungEun):
    def __init__(self):
        Xi. __init__(self) 
        Putin. __init__(self) 
        JungEun. __init__(self) 

s = Sungwoo()
print("money",s.money)
print("nuclear",s.nuclear)
print("missile",s.missile)

s.steal(100)
s.alzheimer()
s.ssorau()

print("money",s.money)
print("nuclear",s.nuclear)
print("missile",s.missile)