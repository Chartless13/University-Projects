# -*- coding: utf-8 -*-
"""
Created on Mon Apr 12 21:11:20 2021

@author: chart
"""
#Libray imports
from textblob import TextBlob
import pandas as pd
import nltk
from nltk.collocations import BigramCollocationFinder
from nltk.collocations import TrigramCollocationFinder
from nltk.corpus import stopwords
import string

#input_file is the destination path for the excel spreadsheet
input_file = 'E:\Year 2\Semester 2\data analytics\CW2\Movie_reviews.csv'
#Pandas is used to read the excel spreadsheet and copy it into a dataframe
#The sep='\t' is used to create columns where a tab is present
df = pd.read_csv(input_file,  sep='\t')
#Sets the column names for dataframe
df.columns = ['Review No','Review Code','Review Comment']

#Drops reviews from dataframe that have no comment
df.dropna(subset = ["Review Comment"], inplace=True)
#Creates new dataframes
positive_comment = pd.DataFrame(columns=["Review No","Review Polarity","Review Bool Polarity Label","Review Comment"])
negative_comment = pd.DataFrame(columns=["Review No","Review Polarity","Review Bool Polarity Label","Review Comment"])
# Loops over every index in the dataframe
positive_polarity_total = 0
positive_polarity_average = 0
negative_polarity_total = 0
negative_polarity_average = 0
for i in range(9997):
    polarity_total = 0
    j = 0
    #Blob will be equal to the contents of the comment that correlates to the index of i from the dataframe 
    blob = TextBlob(df.iloc[i,2])
    #Loops over all the sentences in blob and accumulates the sentiment polarity for the sentences
    #and sets the overall value to polarity_total
    
    for sentence in blob.sentences:
        j = j + 1
        polarity_total = polarity_total + sentence.sentiment.polarity
    #Calculates the average polarity of a comment based on the consituent sentences
    polarity_average = polarity_total / j
    #Sets value of polarity_bool based on the polarity_total
    if polarity_total > 0:
        polarity_bool = True
    elif polarity_total < 0:
        polarity_bool = False
    #Creates a temporary dataframe 
    temp_df = pd.DataFrame({"Review No":[df.iloc[i,0]],
                    "Review Polarity":[polarity_total],
                    "Review Bool Polarity Label":[polarity_bool],
                    "Review Comment":[df.iloc[i,2].lower()]})
    #Seperates out positive and negative reviews into different dataframes
    if polarity_total > 0:
        positive_comment = positive_comment.append(temp_df, ignore_index=True)
        positive_polarity_total = positive_polarity_total + polarity_total 
    elif polarity_total < 0:
        negative_comment = negative_comment.append(temp_df, ignore_index=True)
        negative_polarity_total = negative_polarity_total + polarity_total 
positive_polarity_average = positive_polarity_total / 7647
negative_polarity_average = negative_polarity_total / 2210
print(positive_polarity_average)
print(negative_polarity_average)
# Function to remove punction from an inputted text
def remove_punctuations(text):
    for punctuation in string.punctuation:
        text = text.replace(punctuation, ' ')
    return text
# Creates a new column where the text has no punctuation
positive_comment['No punctuation'] = positive_comment['Review Comment'].apply(remove_punctuations)
negative_comment['No punctuation'] = negative_comment['Review Comment'].apply(remove_punctuations)
positive_string = ""
negative_string = ""
# For loop that copies all words from each comment and adds them to one string
for index, row in positive_comment.iterrows():
    comment_words = positive_comment.iloc[index,4]
    positive_string = positive_string + " " + comment_words
for index, row in negative_comment.iterrows():
    comment_words = negative_comment.iloc[index,4]
    negative_string = negative_string + " " + comment_words
# Sets the bigram association measures
bigram_measures = nltk.collocations.BigramAssocMeasures()
# Sets up the stopset and filters, this will then take away all
# english words that are in the stopset and that are less than 2 in length
stopset = set(stopwords.words('english'))
filter_stops = lambda w: len(w) < 2 or w in stopset
# Finds all bigram Collocations in the positive_string which contains all comments
positive_finder = BigramCollocationFinder.from_words(positive_string.split(), window_size = 3)
# Finds all bigram Collocations in the negative_string which contains all comments
negative_finder = BigramCollocationFinder.from_words(negative_string.split(), window_size = 3)
# Applies word filters
positive_finder.apply_word_filter(filter_stops)
negative_finder.apply_word_filter(filter_stops)

# Applies a frequency filter so only bigrams that happen 50/30 times will come up
positive_finder.apply_freq_filter(50)
negative_finder.apply_freq_filter(30)
j = 0
k = 0
print(positive_finder.ngram_fd.most_common(40))
# For loops over positive bigrams and prints the top 40 based on score_ngram
for i in positive_finder.score_ngrams(bigram_measures.pmi):
    j = j + 1
    if j < 40:
        print(i)
    elif j >= 40:
        break

print(negative_finder.ngram_fd.most_common(40))
# For loops over positive bigrams and prints the top 40 based on score_ngram
for i in negative_finder.score_ngrams(bigram_measures.pmi):
    k = k + 1
    if k < 40:
        print(i)
    elif k >= 40:
        break
    
    
trigram_measures = nltk.collocations.TrigramAssocMeasures()
# Sets up the stopset and filters, this will then take away all
# english words that are in the stopset and that are less than 2 in length
stopset = set(stopwords.words('english'))
filter_stops = lambda w: len(w) < 2 or w in stopset
# Finds all bigram Collocations in the positive_string which contains all comments
positive_tfinder = TrigramCollocationFinder.from_words(positive_string.split(), window_size = 3)
# Finds all bigram Collocations in the negative_string which contains all comments
negative_tfinder = TrigramCollocationFinder.from_words(negative_string.split(), window_size = 3)
# Applies word filters
positive_tfinder.apply_word_filter(filter_stops)
negative_tfinder.apply_word_filter(filter_stops)

# Applies a frequency filter so only bigrams that happen 50/30 times will come up
positive_tfinder.apply_freq_filter(10)
negative_tfinder.apply_freq_filter(5)
j = 0
k = 0
print(positive_tfinder.ngram_fd.most_common(40))
# For loops over positive bigrams and prints the top 40 based on score_ngram
for i in positive_tfinder.score_ngrams(bigram_measures.pmi):
    j = j + 1
    if j < 40:
        print(i)
    elif j >= 40:
        break

print(negative_tfinder.ngram_fd.most_common(40))
# For loops over positive bigrams and prints the top 40 based on score_ngram
for i in negative_tfinder.score_ngrams(bigram_measures.pmi):
    k = k + 1
    if k < 40:
        print(i)
    elif k >= 40:
        break




# for k,v in finder1.score_ngrams(bigram_measures.pmi):
#     print(k,v)
# print(finder1.nbest(bigram_measures.pmi, 10))
# print(finder1.nbest(BigramAssocMeasures.likelihood_ratio, 40))
# print(finder1.score_ngrams(bigram_measures.pmi))

# words = word_tokenize(positive_string)
# allwords = FreqDist(words)


# stopset = set(stopwords.words('english'))
# bigram_measures = nltk.collocations.BigramAssocMeasures()
# print(bcf_positive.score_ngrams(bigram_measures.pmi))
# filter_stops = lambda w: len(w) < 3 or w in stopset
# bcf_positive.apply_freq_filter(2)
# bcf_negative.apply_freq_filter(2)
# # bcf_positive.apply_word_filter(filter_stops)
# # bcf_negative.apply_word_filter(filter_stops)
# bigram_measures = nltk.collocations.BigramAssocMeasures()
# # print(bcf_positive.score_ngrams(bigram_measures.pmi))
# # print(bcf_positive.nbest(BigramAssocMeasures.likelihood_ratio, 40))
# # print(bcf_negative.nbest(BigramAssocMeasures.likelihood_ratio, 40))
# # print(bcf_positive.nbest(bigram_measures.pmi,20))
