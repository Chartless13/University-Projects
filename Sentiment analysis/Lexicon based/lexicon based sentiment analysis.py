# -*- coding: utf-8 -*-
"""
Created on Tue Jan  4 18:28:25 2022

@author: 24239518
"""

import pandas as pd
from sklearn.metrics import classification_report
import string


input_file1 = "reviews_Video_Games_test.raw.tsv"

print("The program is running, please wait it may take up to a minute")

def load_clean_data_from_csv(input_csv):
    # load test data into a data frame by seperating the comments and labels using \t (tab)
    df_training_data = pd.read_csv(input_csv, sep='\t', engine='python')
    # load sentiment lexicon 
    df_sentiment_lexicon = pd.read_csv("Games_senti_lexicon.tsv", delimiter='\\t', header=None, engine='python')
    # get all sentiment words and put in a list
    sentiment_words = list(df_sentiment_lexicon[0])
    # get all sentiment scores and put in a list
    sentiment_scores = list(df_sentiment_lexicon[1])
    # name the columns in the test dataframe
    df_training_data.columns = ["Comments","Label"]
    # lists that will be used later
    total_sentiment_score = list()
    label = list()
    label_mc = list()
    # the following code removes all punctuation and any words that do not appear in the sentiment lexicon
    # it is now used as there is no impact on the overall f-measure and only slows down the program
    
    # new = list()
    # for i in range(4999):
    #     sentence = df_training_data.iloc[i,0]
    #     sentence = sentence.translate(str.maketrans('', '', string.punctuation))
    #     new.append(sentence)
    # df_training_data['clean_comments'] = new
    # df_training_data['clean_title'] = df_training_data['Comments'].apply(lambda x: ' '.join([word for word in x.split() if word in (sentiment_words)]))
    
    # loops over all reviews in the dataframe
    for i in range(4999):
        total_polarity = 0
        counter_pos = 0
        counter_neg = 0
        sentence = df_training_data.iloc[i,0].split()
        # loops over each word in the review
        for word in sentence:
            #checks if the word is in the sentiment lexicon
            if word in sentiment_words:
                # adds the words sentiment score to a total of the reveiws sentiment score
                total_polarity = total_polarity + sentiment_scores[sentiment_words.index(word)]
                # counts the number of positive and negative words in the review
                if sentiment_scores[sentiment_words.index(word)] > 0:
                    counter_pos = counter_pos + 1
                if sentiment_scores[sentiment_words.index(word)] < 0:
                    counter_neg = counter_neg + 1          
        # for each review add its sentiment score to a list
        total_sentiment_score.append(total_polarity)
        # checks if reveiw is positive or negative and adds a predicted label to a list
        if total_polarity >= 0:
            label.append(1)
        if total_polarity < 0:
            label.append(0)
        if counter_pos >= counter_neg:
            label_mc.append(1)
        if counter_neg > counter_pos:
            label_mc.append(0)
    # adds each list to the test dataframe
    df_training_data['total_sentiment_score'] = total_sentiment_score
    df_training_data['label_sum'] = label
    df_training_data['label_mc'] = label_mc
    #returns the dataframe
    return df_training_data
#  calls the load_clean_data_from_csv method
training = load_clean_data_from_csv(input_file1)
# change the y_pred training value to label_mc to get results when the most common positive or negative words are used
# change the y_pred training value to label_sum to get results when the sum of the words sentiments are used
y_pred = training['label_sum']
y_true = training['Label']
# Uses the predicted labels and actual labels to determine the
# Precision, recall, accuracy and f-measure for each label 
print("Lexicon-Based:")
print(classification_report(y_true, y_pred) + "\n")

