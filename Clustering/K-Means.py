import pandas as pd
import numpy as np
import csv
import math

class kmeans:

    def __init__(self, k = 4, tolerance = 0.0001, max_its = 1000):
       self.k = k
       self.tolerance = tolerance
       self.max_its = max_its

# Read in datapoints from csv file
with open ('datapoints.csv') as csvfile:
    reader = csv.DictReader(csvfile)
    for row in reader:
        print(row['LC'], row['RC'])

# Euclidean Distance (length between two points)
# Formula that is beling calculated: 
# https://wikimedia.org/api/rest_v1/media/math/render/svg/795b967db2917cdde7c2da2d1ee327eb673276c0

def ED(one,two):
    sqd = 0

    #if two lengths of features are the same
    for i in range(ln(one)):
        sqd += (one[i] - two[i])**2
    ed = sqrt(sqd)
    return ed;

# start the process of centroids for k
for i in range(self.k):
    self.centroids[i] = data[i]