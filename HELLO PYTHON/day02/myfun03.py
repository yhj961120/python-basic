import random


def getHOllJJak() :
    ret = ""
    rnd = random.random()
    if rnd > 0.5:
        ret = "홀"
    else :
        ret = "짝"    
    return ret
    


com = getHOllJJak()
print("com",com)