# An intro for myself: 
# http://madhugnadig.com/articles/machine-learning/2017/03/04/implementing-k-means-clustering-from-scratch-in-python.html

import pandas as pd
import numpy as np

class kmeans:

    def __init__(self, k = 4, tolerance = 0.0001, max_its = 1000):
       self.k = k
       self.tolerance = tolerance
       self.max_its = max_its

# Euclidean Distance (length between two points)
# Formula that is beling calculated: 
# https://wikimedia.org/api/rest_v1/media/math/render/svg/795b967db2917cdde7c2da2d1ee327eb673276c0

def ED(self,data):
    sqd = 0
    self.centroids = {}

    # if two lengths of features are the same
    for i in range(ln(one)):
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

def main():