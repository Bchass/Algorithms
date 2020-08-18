import array as arr 
def BubbleSort(arr):
    n = len(arr)
    
    for i in range(n):
    
        for j in range(0, n-i-1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

arr = [8, 4, 3, 5, 7]
BubbleSort(arr)
print("Sorted")
for i in range(len(arr)):
    print("%d"%arr[i])