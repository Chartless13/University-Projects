# -*- coding: utf-8 -*-
"""
Created on Thu Feb 18 10:27:31 2021

@author: chart
"""
import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
df = pd.read_csv("train.csv", index_col=("Loan_ID"))
#Question 1
print(df.head(10))
#gets the percentage of men and women that are accepted by their gender, so the number of men that got accepted divided by the total number of men
percentageOfMen = len(df[(df['Gender'] == 'Male') & (df['Loan_Status'] == 'Y')]) / len(df[(df['Gender'] == 'Male')])
percentageOfFemale = len(df[(df['Gender'] == 'Female') & (df['Loan_Status'] == 'Y')]) / len(df[(df['Gender'] == 'Female')])
if percentageOfMen > percentageOfFemale:
    print("Men have a higher rate of getting a loan than women and have a rate of: " + str(percentageOfMen))
elif percentageOfFemale > percentageOfMen:
        print("Women have a higher rate of getting a loan than men and have a rate of: " + str(percentageOfFemale))

print(percentageOfFemale)
men = np.array([percentageOfMen, (1-percentageOfMen)])
women = np.array([percentageOfFemale, (1-percentageOfFemale)])
myLabels = ["Accepted","Denied"]
#creates a pie chart for men who  and who have not been accepted
plt.pie(men, labels = myLabels, autopct='%1.1f%%')
plt.title("Acceptance percentages for Male")
plt.show() 
plt.pie(women, labels = myLabels, autopct='%1.1f%%')
plt.title("Acceptance percentages for Women")
plt.show()

#Question 2
#gets the percentage of people that are accepted by their education, so the number of people that got accepted who graduated divided by the total number of people
percentageOfGrad = len(df[(df['Education'] == 'Graduate') & (df['Loan_Status'] == 'Y')]) / len(df[(df['Education'] == 'Graduate')])
percentageOfNonGrad = len(df[(df['Education'] == 'Not Graduate') & (df['Loan_Status'] == 'Y')]) / len(df[(df['Education'] == 'Not Graduate')])
grad = np.array([percentageOfGrad, (1-percentageOfGrad)])
nonGrad = np.array([percentageOfNonGrad, (1-percentageOfNonGrad)])
myLabels = ["Accepted","Denied"]
#creates a pie chart for people who have graduated and who have or have not been accepted
plt.pie(grad, labels = myLabels, autopct='%1.1f%%')
plt.title("Acceptance percentages for Grads")
plt.show() 
plt.pie(nonGrad, labels = myLabels, autopct='%1.1f%%')
plt.title("Acceptance percentages for non Grads")
plt.show()

#Question 3
#gets the percentage of people that are accepted by their credit history, so the number of people that got accepted who passed divided by the total number of people
percentageOfMeetsGuidelines = len(df[(df['Credit_History'] == 1) & (df['Loan_Status'] == 'Y')]) / len(df[(df['Credit_History'] == 1)])
percentageOfNotMeetsGuidelienes = len(df[(df['Credit_History'] == 0) & (df['Loan_Status'] == 'Y')]) / len(df[(df['Credit_History'] == 0)])
Meets = np.array([percentageOfGrad, (1-percentageOfGrad)])
nonMeets = np.array([percentageOfNotMeetsGuidelienes, (1-percentageOfNotMeetsGuidelienes)])
myLabels = ["Accepted","Denied"]
#creates a pie chart for people who have passed and who have or have not been accepted
plt.pie(Meets, labels = myLabels, autopct='%1.1f%%')
plt.title("Acceptance percentages for people who meet the credit check")
plt.show() 
plt.pie(nonMeets, labels = myLabels, autopct='%1.1f%%')
plt.title("Acceptance percentages for people who dont meet the credit check")
plt.show()


#Question 4
#gets the percentage of people that are accepted by their location, so the number of people that got accepted who live in certain area divided by the total number of people
percentageOfUrban = len(df[(df['Property_Area'] == 'Urban') & (df['Loan_Status'] == 'Y')]) / len(df[(df['Property_Area'] == 'Urban')])
percentageOfSemiUrban = len(df[(df['Property_Area'] == 'Semiurban') & (df['Loan_Status'] == 'Y')]) / len(df[(df['Property_Area'] == 'Semiurban')])
percentageOfRural = len(df[(df['Property_Area'] == 'Rural') & (df['Loan_Status'] == 'Y')]) / len(df[(df['Property_Area'] == 'Rural')])
Urban = np.array([percentageOfUrban, (1-percentageOfUrban)])
SemiUrban = np.array([percentageOfSemiUrban, (1-percentageOfSemiUrban)])
Rural = np.array([percentageOfRural, (1-percentageOfRural)])
myLabels = ["Accepted","Denied"]
#creates a pie chart for people who live in a certain area and who have or have not been accepted
plt.pie(Urban, labels = myLabels, autopct='%1.1f%%')
plt.title("Acceptance percentages for people who live in a urban area")
plt.show() 
plt.pie(SemiUrban, labels = myLabels, autopct='%1.1f%%')
plt.title("Acceptance percentages for people who live in a semi-urban area")
plt.show()
plt.pie(Rural, labels = myLabels, autopct='%1.1f%%')
plt.title("Acceptance percentages for people who live in a rural area")
plt.show()


