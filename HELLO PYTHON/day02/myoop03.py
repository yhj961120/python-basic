import time
class Cat:
    def __init__(self):
        print("constructor")      #생성자
        
    def crying(self):
        print("crying")    
        
    def __del__(self):
        print("destroyer")     # 죽이는 메서드 (파이썬은 가비지컬렉터가 없음)
        
    def __str__(self):         #tostring
        return "babo"


c = Cat() 
c.crying()
time.sleep(4)    # 잠시 멈추는 메서드
print(c)
        