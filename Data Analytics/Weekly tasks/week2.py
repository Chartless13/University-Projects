# -*- coding: utf-8 -*-
"""
Created on Thu Feb  4 10:11:17 2021

@author: chart
"""
#Question 1
count = 1000 
# while the count is less than 2000, and the count is not divisible by 3 but by 11, print that number 
while count < 2000:
    if count % 3 == 0:
        count += 1
        continue
    if count % 11 != 0:
        count += 1
        continue
    print (str(count) + " is a divisible by 11 and n ot a multiple of 3")
    count += 1

#Question 2
hello = "Hello, world!"
print (hello.upper())

#Question 3
#function that converts an int to a string
def converter(x):
    stringx = str(x)
    print (stringx)
    
x = 71
converter(x)

#Question 4
set1 = ['I','You']
set2 = [' Read',' Borrow']
set3 = [' Shakespeares play',' Shakespeares poems']
# for loop that will print all possible combinations of the sets
for i in set1:
    for j in set2:
        for k in set3:
            print (i + j + k)
            
#Question 5
import numpy as np
import matplotlib.pyplot as plt
with open("test.txt") as test:
    data = test.read()
data = data.split('\n')
x = [row.split(' ')[0] for row in data]
y = [row.split(' ')[1] for row in data]
y = list(map(int, y))
x = list(map(int, x))
plt.plot(x, y)
# Set the x axis label of the current axis.
plt.xlabel('x - axis')
# Set the y axis label of the current axis.
plt.ylabel('y - axis')
# Set a title 
plt.title('test')
# Display a figure.
plt.show()

#Question 6
password = (input("Enter all passwords with a comma between them: \n"))
import re
accepted = []
#checks if the password meets all the requirements
#splits the string into passwords by the comma
for passw in password.split(","):
    if len(passw) > 12:
        continue
    elif len(passw) < 6: 
        continue
    elif not re.search("[abcdefghijklmnopqrstuvwxyz]", passw): 
        continue
    elif not re.search("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]", passw): 
        continue
    elif not re.search("[1-9]", passw): 
        continue
    elif not re.search("[$#@]", passw): 
        continue
    else:
        accepted.append(passw)


for i in accepted:
    print ("The accepted passwords are", i)