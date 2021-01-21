def InsertionSort(arr):
    for i in range(len(arr)):
        key = arr[i]
        j = i - 1

        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
            arr[j + 1] = key




arr = [23, 45, 3, 5, 11]
InsertionSort(arr)
for i in range(len(arr)):
    print(arr[i])