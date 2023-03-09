# -*- coding: utf-8 -*-
import pandas as pd
from sklearn.metrics import classification_report
from sklearn.ensemble import RandomForestClassifier
from sklearn import tree
from sklearn import svm
from sklearn.neighbors import KNeighborsClassifier
from sklearn.ensemble import VotingClassifier
from sklearn.naive_bayes import GaussianNB

# file paths to the datasets
file_path = "reviews_Video_Games_test.csv"
file_path2 = "reviews_Video_Games_training.csv"

print("The program is running, please wait it may take up 30 seconds")

def load_data_from_csv(input_csv):
    #loads data and puts it in a dataframe
    df = pd.read_csv(input_csv, header=0)
    csv_headings = list(df.columns.values)
    feature_names = csv_headings[:len(csv_headings) - 1]
    # sorts data so it is useable by the algorithms
    label_name = csv_headings[len(csv_headings) - 1:len(csv_headings)][0]
    df = df._get_numeric_data()
    numpy_array = df.to_numpy()
    number_of_rows, number_of_columns = numpy_array.shape
    instances = numpy_array[:, 0:number_of_columns - 1]
    labels = []
    for label in numpy_array[:, number_of_columns - 1:number_of_columns].tolist():
        labels.append(label[0])
    return instances, labels, feature_names

# calls the load_data_from_csv to load and sort both training and test datasets.
training_data = load_data_from_csv(file_path)
test_data = load_data_from_csv(file_path2)

def random_forest(training_data, test_data):
    print("Random Forest:")
    # creates the random forest classifier
    RF = RandomForestClassifier(n_estimators=200, random_state=42, max_features=3, min_samples_split=12)
    RF.fit(training_data[0], training_data[1])
    # tests the classifier against the test dataset
    predictions = RF.predict(test_data[0])
    y_pred = predictions
    y_true = test_data[1]
    # Uses the predicted labels and actual labels to determine the
    # Precision, recall, accuracy and f-measure for each label 
    print(classification_report(y_true, y_pred) + "\n")
#calls the random_forest method and passes the training and test data
random_forest(training_data, test_data)

def svc(training_data,test_data):
    print("SVC:")
    # Perform classification with SVM, kernel=linear
    SVM = svm.SVC(kernel='linear')
    SVM.fit(training_data[0], training_data[1])
    # tests the classifier against the test dataset
    prediction_linear = SVM.predict(test_data[0])
    
    y_pred = prediction_linear
    y_true = test_data[1]
    # Uses the predicted labels and actual labels to determine the
    # Precision, recall, accuracy and f-measure for each label 
    print(classification_report(y_true, y_pred) + "\n")
#calls the svc method and passes the training and test data
svc(training_data, test_data)



# the following methods are different machine learning algorithms that are trained and tested on the games review dataset.
# however they did not perform to a high enough standard and so were not chose to be the final two algorithms



# def tree_alg(training_data, test_data):
#     print("Decision tree: \n")
#     # Creates the decision tree classifier, and fits it with the training insances 
#     # And labels from the training data
#     classifier = tree.DecisionTreeClassifier()
#     classifier.fit(training_data[0], training_data[1])
#     # Passes in the test instances and assigns the predicts the lables to a list 
#     predicted_test_labels = classifier.predict(test_data[0])

#     y_pred = predicted_test_labels
#     y_true = test_data[1]
#     # Uses the predicted labels and actual labels to determine the
#     # Precision, recall, accuracy and f-measure for each label 
#     print(classification_report(y_true, y_pred) + "\n")
# # Calls the decision tree algorithm and passes in training and test data
# tree_alg(training_data, test_data)


# def KNN_alg(training_data, test_data):
#     print("KNN: \n")
#     # Creates the KNN classifier, sets the value of K, and fits it with the training insances 
#     # And labels from the training data
#     classifier = KNeighborsClassifier(n_neighbors=5)
#     classifier.fit(training_data[0], training_data[1])
#     # Passes in the test instances and assigns the predicts the lables to a list 
#     predicted_test_labels = classifier.predict(test_data[0])
    
#     y_pred = predicted_test_labels
#     y_true = test_data[1]
#     # Uses the predicted labels and actual labels to determine the
#     # Precision, recall, accuracy and f-measure for each label 
#     print(classification_report(y_true, y_pred) + "\n")
# # Calls the KNN algorithm and passes in training and test data
# KNN_alg(training_data, test_data)


# def Majority_vote(training_data, test_data): 
#     print("Majority Vote: \n")
#     # Creates the majority vote classifier using subclassifiers, 
#     # One that is KNN and sets the value of K, and the other is decision tree
#     subclassifier1 = KNeighborsClassifier(n_neighbors=5)
#     subclassifier2 = tree.DecisionTreeClassifier()
#     Voting_Classifier = VotingClassifier(estimators = [('subc1', subclassifier1), 
#                                                         ('subc2', subclassifier2)], voting='hard')
        
#     # then fits it with the training insances and labels from the training data
#     Voting_Classifier.fit(training_data[0],training_data[1])
#     # Passes in the test instances and assigns the predicts the lables to a list 
#     predicted_test_labels = Voting_Classifier.predict(test_data[0])

#     y_pred = predicted_test_labels
#     y_true = test_data[1]
#     # Uses the predicted labels and actual labels to determine the
#     # Precision, recall, accuracy and f-measure for each label 
#     print(classification_report(y_true, y_pred) + "\n")
# # Calls the majority vote algorithm and passes in training and test data
# Majority_vote(training_data, test_data)


# def Naive_Bayes(training_data, test_data):
#     print("Naive Bayes: \n")
#     # Creates the Naive Bayes classifier and fits it with the training insances 
#     # And labels from the training data
#     classifier = GaussianNB()
#     classifier.fit(training_data[0], training_data[1])
#     # Passes in the test instances and assigns the predicts the lables to a list 
#     predicted_test_labels = classifier.predict(test_data[0])
    
#     y_pred = predicted_test_labels
#     y_true = test_data[1]
#     # Uses the predicted labels and actual labels to determine the
#     # Precision, recall, accuracy and f-measure for each label 
#     print(classification_report(y_true, y_pred) + "\n")
# # Calls the Naive Bayes algorithm and passes in training and test data
# Naive_Bayes(training_data, test_data)
