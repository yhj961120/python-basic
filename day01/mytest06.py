import random
a = ""
game = ""
game = input("홀/짝을 입력하세요.")
rnd = ["홀","짝"]

a=random.choice(rnd)

print(a)

if game == a :
  print("승리")
else : 
  print("패배")


# com = ""
# mine = ""
# rnd == random.random()

# if rnd > 0.5 : 
#   com = "홀"
# else:
#   com = "짝"

# if com == mine : 
#   result = "이김"
# else : 
#   result = "짐"

# print("mine",mine)
# print("com",com)
# print("result",result)
