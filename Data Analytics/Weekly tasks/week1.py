#Question 1
i = 52
j = 78
#this line will add i and j
l = i + j
print (l)

#Question 2
x = 0
# while x is greater than 2 print hello world, this will print twice
while x < 2:
    print("Hello, World!")
    x += 1
    
helloworld = ["Hello, World!","Hello, World!"]
#for each item in hello world, print that item
for z in helloworld:
    print (z)
    
#Question 3
print ("\nTwinkle, twinkle, little star,\n\tHow I wonder what you are!\n\t\tUp above the world so high,\n\t\tLike a diamond in the sky.\nTwinkle, twinkle, little star,\n\tHow I wonder what you are")

#Question 4
import random
import re
passlen = int(input("Enter the length of password: \n"))
s="abcdefghijklmnopqrstuvwxyz01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()?"
p =  "".join(random.sample(s,passlen ))
# this will check if the password meets the criteria, if ti does not then a new password is created
while True:
    if not re.search("[0-9]", p): 
        p =  "".join(random.sample(s,passlen ))
        print ("Password didn't have a number, creating new password.")
        continue
    elif not re.search("[A-Z]", p): 
        p =  "".join(random.sample(s,passlen ))
        print ("Password didn't have a capital letter, creating new password.")
        continue
    elif not re.search("[!@#$%^&*()?]", p): 
        p =  "".join(random.sample(s,passlen ))
        print ("Password didn't have a symbol, creating new password.")
        continue
    else:
        break
        
            
print ("The generated password: ", p)
