# =======================================================================================================================
# An intro for myself: 
# http://madhugnadig.com/articles/machine-learning/2017/03/04/implementing-k-means-clustering-from-scratch-in-python.html
# 
# Creating the algorithm based off the instructions given in the article 
# =======================================================================================================================

import pandas as pd
import numpy as np
import math
from math import sqrt
import matplotlib.pyplot as plt

class kmeans:

    def __init__(self, k = 4, tolerance = 0.0001, max_its = 1000):
       self.k = k
       self.tolerance = tolerance
       self.max_its = max_its

# Euclidean Distance (length between two points)
# Formula that is beling calculated: 
# https://wikimedia.org/api/rest_v1/media/math/render/svg/795b967db2917cdde7c2da2d1ee327eb673276c0

def ED(self,data,one,two):
    self.centroids = {}
    # squared distance
    sqd = 0
    # if two lengths of features are the same
    for i in range(len(one)):
        sqd += (one[i] - two[i])**2
    ed = sqrt(sqd)
    return ed;

# start the process of centroids for k
    for i in range(self.k):
        self.centroids[i] = data[i]

# enter into loop
    for i in range(self.max_its):
        self.classes = {}
        for i in range(self.k):
            self.classes[i] = []

# distance between point and centroid
    for features in data:
        distances = [np.linalg.norm(features - self.centroids[centroid]) for centroid in self.centroids]
        classfication = distances.index(min(distances))
        self.classes[classfication].append(features)

        # recalc distance between centroids
    previous = dict(self.centroids)
    for classfication in self.classes:
        self.centroids[classfication] = np.average(self.classes[classfication], axis = 0)
    # Flag
    isOptimal = True
    # loop through old centroids with new centroids
    for centroid in self.centroids:

        OC = previous[centroid]
        curr = self.centroids[centroid]

        if np.sum((curr - OC)/OC * 100) > self.tolerance:
            isOptimal = False

    # break out of main loop
        if isOptimal:
             break

def main():
    df = df[['LC', 'RC']]
    dataset = df.astype(float).values.tolist()
    # put data into array
    X = df.values
    # read the data
    df = pd.read_csv(r".\desktop\datapoints.csv")

    km = kmeans(4)
    km.fit(X)

    # Plot begins
    colors = 10*["r", "g", "c", "b", "k"]

     # Mark centroids with x
    for centroid in km.centroids:
        plt.scatter(km.centroids[centroid][0], km.centroids[centroid][1], s = 130, marker = "x")

        for classfication in km.classes:
            color = colors[classfication]
            for features in km.classes[classfication]:
                plt.scatter(features[0], features[1], color = color, s = 130)

                plt.show()
