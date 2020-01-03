import array as arr
def InsertionSort(arr):
    n = len(arr)

    for i in range(n):
        key = arr[i]
        j = i - 1

        while j >= 0 & arr[j] > key:
            arr[j + 1] = arr[j]
            arr[j + 1] = key




arr = [23, 45, 3, 5, 11]
#Driver
print("Sorted")
for i in range(len(arr)):
    print("%d"%arr[i])