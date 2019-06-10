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

def ED(one,two):
    sqd = 0

    #if two lengths of features are the same
    for i in range(ln(one)):
        sqd += (one[i] - two[i])**2
    ed = sqrt(sqd)
    return ed;